package com.soft1851.user.controller;

import com.soft1851.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ysx
 */
@RestController
public class HelloController implements HelloControllerApi {


    @Override
    public Object hello() {
        return  "hello";
    }
}
