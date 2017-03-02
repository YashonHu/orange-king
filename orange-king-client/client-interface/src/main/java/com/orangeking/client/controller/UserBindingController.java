package com.orangeking.client.controller;

import com.orangeking.client.biz.service.UserBindingService;
import com.orangeking.client.dao.model.UserBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Yashon on 2017/3/1.
 */
@RequestMapping("/userBinding")
@RestController
public class UserBindingController {
    private Logger logger = LoggerFactory.getLogger(UserBindingController.class);

    @Autowired
    private UserBindingService userBindingService;

    @RequestMapping("/findUserBindings")
    public List<UserBinding> findUserBindings(Integer page, Integer pageSize){
        return userBindingService.findUserBinding(page,pageSize);
    }
    @RequestMapping("/find")
    public UserBinding find(Long id){
        return (UserBinding)userBindingService.get(id);
    }


    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()) {
            return "文件为空";
        }
        // 获取文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);
        // 文件上传路径
        String filePath = "d:/";
        // fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath + fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
}
