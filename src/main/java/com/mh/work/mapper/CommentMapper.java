package com.mh.work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mh.work.entity.WorkComment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper extends BaseMapper<WorkComment> {
}
