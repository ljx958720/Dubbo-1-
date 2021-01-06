package com.ghy.spring.dubbo.springbootserver.service;
import com.ghy.spring.dubbo.springbootapi.GhyServer;

import org.apache.dubbo.config.annotation.DubboService;


@DubboService(registry = {"provider1","provider2"},version = "2.0")
public class GhyServiceImpl1 implements GhyServer{
    @Override
    public String ghyServer(String str) {
        return "返回的信息是"+str;
    }
}
