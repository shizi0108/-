package com.baidu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserZkt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "UID", type = IdType.AUTO)
    private Long uid;

    /**
     * 用户名（登录账号）
     */
    @TableField("UNAME")
    private String uname;

    /**
     * 登陆密码
     */
    @TableField("PWD")
    private String pwd;

    /**
     * 角色级别  0  店员  1 老板
     */
    @TableField("ROLE")
    private Integer role;


}
