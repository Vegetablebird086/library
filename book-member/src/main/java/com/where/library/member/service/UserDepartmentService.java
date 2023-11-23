package com.where.library.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.where.library.common.utils.PageUtils;
import com.where.library.member.entity.UserDepartmentEntity;

import java.util.Map;

/**
 * `bms_department`
 *
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-28 21:25:51
 */
public interface UserDepartmentService extends IService<UserDepartmentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

