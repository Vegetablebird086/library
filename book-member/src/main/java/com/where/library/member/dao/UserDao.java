package com.where.library.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.where.library.member.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 借阅人信息
 * 
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-27 14:47:14
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	UserEntity getUserDetail(@Param("userId") Long userId);
}
