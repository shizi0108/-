package com.baidu.common.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * FileName: OderRes
 * Author:   User_王兵兵
 * Date:     2020/5/27 10:49
 * Description: Oder返回类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Data
public class OderRes {
    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    private Long did;

    /**
     * 订单编号
     */
    private Integer dbh;

    /**
     * 供应商id
     */
    private Long shopid;

    /**
     * 商品id
     */
    private long sid;

    /**
     * 采购数量
     */
    private Integer bnum;

    /**
     * 采购人
     */
    private Integer uid;

    /**
     * 采购时间
     */
    private Date btime;

    /**
     * 状态
     */
    private Integer status;

    private String sname;

    private double price;

    private double moeny;

    private String uname;
}
