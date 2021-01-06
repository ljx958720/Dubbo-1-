package com.ghy.clouddubboserver.service;


import com.ghy.springcloudapi.GhyService;
import org.apache.dubbo.config.annotation.Service;

@Service//注意不要引错包了
public class GhyServiceImpl implements GhyService {

    public String ghyServer(String str) {
        return "返回的信息是"+str;
    }
}
