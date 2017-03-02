package com.orangeking.client.biz.service;

import com.orangeking.client.dao.model.UserBinding;

import java.util.List;

/**
 * Created by Yashon on 2017/3/1.
 */
public interface UserBindingService extends  BaseService  {
    public List<UserBinding> findUserBinding(int page, int pageSize) ;
}
