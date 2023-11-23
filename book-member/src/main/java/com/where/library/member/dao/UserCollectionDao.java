package com.where.library.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.where.library.member.entity.UserCollectionEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户书籍收藏表
 * 
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-28 17:18:42
 */
@Mapper
public interface UserCollectionDao extends BaseMapper<UserCollectionEntity> {
	List<Long> getBookIdList(@Param("userId") long userId, @Param("pageNum") long pageNum, @Param("pageSize") long pageSize);
}
