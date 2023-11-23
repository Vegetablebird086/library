package com.where.library.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.where.library.common.utils.PageUtils;
import com.where.library.book.entity.BookCategoryRelationEntity;

import java.util.Map;

/**
 * 书籍分类关系表
 *
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-19 22:16:54
 */
public interface BookCategoryRelationService extends IService<BookCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

