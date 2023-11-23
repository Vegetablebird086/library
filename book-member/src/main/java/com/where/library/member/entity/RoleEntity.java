package com.where.library.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色表
 * 
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-27 14:47:14
 */
@Data
@TableName("ums_role")
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 角色名
	 */
	private String name;
	/**
	 * 角色关键字
	 */
	private String role;
	/**
	 * 是否启用（0正常， 1停用）
	 */
	private Integer status = 1;
	/**
	 * 描述信息
	 */
	@TableField("`describe`")
	private String describe;
}
