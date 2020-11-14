package com.soft1851.user.controller;

import com.soft1851.api.user.UserControllerApi;
import com.soft1851.pojo.AppUser;
import com.soft1851.result.GraceResult;
import com.soft1851.user.mapper.AppUserMapper;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author ysx
 */
@RestController
public class UserController implements UserControllerApi {
    @Resource
    private AppUserMapper appUserMapper;

    @Override
    public GraceResult getAllUsers() {
        return GraceResult.ok(appUserMapper.selectAll());
    }

    @Override
    public GraceResult getUserInfo(String userId) {
        Example useExample = new Example(AppUser.class);
        Example.Criteria userCriteria = useExample.createCriteria();
        userCriteria.andEqualTo("id",userId);
        AppUser user = appUserMapper.selectOneByExample(useExample);
        return GraceResult.ok(user);
    }
}
