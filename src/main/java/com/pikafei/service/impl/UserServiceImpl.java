package com.pikafei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pikafei.entity.User;
import com.pikafei.service.UserService;
import com.pikafei.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wangmengfei
* @description 针对表【m_user】的数据库操作Service实现
* @createDate 2023-02-16 15:46:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




