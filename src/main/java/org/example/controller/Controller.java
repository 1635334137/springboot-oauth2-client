package org.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author Mr.Lan
 * @create: 2022-01-20 19:53
 */
@RestController
@RequestMapping("/user")
public class Controller {

    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication){
        return authentication;
    }
}
