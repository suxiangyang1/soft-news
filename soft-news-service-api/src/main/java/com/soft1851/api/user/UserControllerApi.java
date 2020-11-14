package com.soft1851.api.user;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ysx
 */

public interface UserControllerApi {

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/users")
    Object getUsers();
}
