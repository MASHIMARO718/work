package com.mh.work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mh.work.entity.BaseUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<BaseUser> {
}
