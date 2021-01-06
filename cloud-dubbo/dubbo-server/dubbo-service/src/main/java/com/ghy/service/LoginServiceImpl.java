package com.ghy.service;

import com.ghy.server.ILoginService;


public class LoginServiceImpl implements ILoginService {

    @Override
    public String login(String username, String password) {

        if(username.equals("admin")&&password.equals("123456")){
            return "登录成功";
        }
        return "失败";
    }
}
