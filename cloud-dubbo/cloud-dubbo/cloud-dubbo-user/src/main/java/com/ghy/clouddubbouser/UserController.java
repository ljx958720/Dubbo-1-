package com.ghy.clouddubbouser;

import com.ghy.springcloudapi.GhyService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    GhyService ghyService;

    @GetMapping("/ghy")
    public String text(){
        return ghyService.ghyServer("aaa");
    }
}

