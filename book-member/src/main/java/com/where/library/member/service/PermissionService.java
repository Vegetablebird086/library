package com.where.library.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.where.library.common.utils.PageUtils;
import com.where.library.member.entity.PermissionEntity;

import java.util.Map;

/**
 * 
 *
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-12-08 19:43:59
 */
public interface PermissionService extends IService<PermissionEntity> {

    PageUtils queryPage(Map<String, Object> params);


}

