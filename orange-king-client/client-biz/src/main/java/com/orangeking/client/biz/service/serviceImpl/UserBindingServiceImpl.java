package com.orangeking.client.biz.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.orangeking.client.biz.service.AbstractDbBaseService;
import com.orangeking.client.biz.service.UserBindingService;
import com.orangeking.client.dao.mapper.UserBindingMapper;
import com.orangeking.client.dao.model.UserBinding;
import com.orangeking.client.dao.util.MyMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yashon on 2017/3/1.
 */
@Service
public class UserBindingServiceImpl extends AbstractDbBaseService implements  UserBindingService{
    private Logger logger = LoggerFactory.getLogger(UserBindingServiceImpl.class);
    @Autowired
    private UserBindingMapper userBindingMapper;

    public UserBindingServiceImpl(UserBindingMapper mapper) {
        super(mapper);
    }


    @Override
    public List<UserBinding> findUserBinding(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<UserBinding> lists = userBindingMapper.selectAll();
        return lists;
    }
}
