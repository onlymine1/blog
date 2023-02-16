package com.pikafei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pikafei.entity.Blog;
import com.pikafei.service.BlogService;
import com.pikafei.mapper.BlogMapper;
import org.springframework.stereotype.Service;

/**
* @author wangmengfei
* @description 针对表【m_blog】的数据库操作Service实现
* @createDate 2023-02-16 15:15:32
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService{

}




