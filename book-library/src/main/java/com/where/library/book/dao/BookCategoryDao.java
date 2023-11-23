package com.where.library.book.dao;

import com.where.library.book.entity.BookCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 书籍分类
 * 
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-19 22:16:54
 */
@Mapper
public interface BookCategoryDao extends BaseMapper<BookCategoryEntity> {
	
}
