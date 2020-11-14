package com.soft1851.api.user;

import com.soft1851.result.GraceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ysx
 */
@Api(value = "用户相关Controller",tags = {"用户相关Controller"})
@RequestMapping("user")
public interface UserControllerApi {

    /**
     * 获取所有用户
     * @return
     */
    @ApiOperation(value = "获取用户信息",notes = "获得用户信息",httpMethod = "POST")
    @PostMapping("/all")
    GraceResult getAllUsers();


    /**
     * 获取用户基本信息
     * @param userId
     * @return 用户基本信息
     */
    @ApiOperation(value = "获得用户基本信息",notes = "获得用户基本信息",httpMethod = "POST")
    @PostMapping("/userInfo")
    GraceResult getUserInfo(@RequestParam String userId);
}
