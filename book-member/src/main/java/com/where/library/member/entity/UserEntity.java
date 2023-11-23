package com.where.library.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 借阅人信息
 * 
 * @author Jiang Wenrui
 * @email 20722056@bjtu.edu.cn
 * @date 2022-11-27 14:47:14
 */
@Data
@TableName("ums_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 学院id
	 */
	@TableField(exist = false)
	private Long departmentId;
	/**
	 * 学院名称
	 */
	@TableField(exist = false)
	private String department;
	/**
	 * 专业id
	 */
	private Long majorId;
	/**
	 * 专业
	 */
	@TableField(exist = false)
	private String major;
	/**
	 * 班级
	 */
	@TableField(exist = false)
	private Integer classNumber;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 手机号
	 */
	private String telephone;
	/**
	 * 用户头像
	 */
	private String image;
	/**
	 * 剩余可以借书籍数量
	 */
	private Integer remain;
	/**
	 * 状态 0: 可用 1；停用
	 */
	private Integer status = 0;
}
