package com.demoservertest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demoservertest.entity.User;
import com.demoservertest.service.UserService;
import com.demoservertest.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Junlin
* @description 针对表【user】的数据库操作Service实现
* @createDate 2026-04-29 14:33:02
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




