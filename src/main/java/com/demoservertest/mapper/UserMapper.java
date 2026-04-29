package com.demoservertest.mapper;

import com.demoservertest.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Junlin
* @description 针对表【user】的数据库操作Mapper
* @createDate 2026-04-29 14:33:02
* @Entity com.demoservertest.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




