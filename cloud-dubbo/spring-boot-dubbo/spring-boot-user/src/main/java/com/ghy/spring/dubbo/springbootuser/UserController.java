package com.ghy.spring.dubbo.springbootuser;

import com.ghy.spring.dubbo.springbootapi.GhyServer;

import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //指定调用服务端的版本2
    @DubboReference(registry = {"provider1","provider2"},version = "2.0")
    GhyServer ghyServer;

    @GetMapping("/ghy")
    public String text()
        {
            return ghyServer.ghyServer("LuJiaXing");
        }
}

