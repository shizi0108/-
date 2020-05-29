package com.baidu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

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
public class OderZkt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @TableId(value = "DID", type = IdType.AUTO)
    private Long did;

    /**
     * 订单编号
     */
    @TableField("DBH")
    private Integer dbh;

    /**
     * 供应商id
     */
    @TableField("SHOPID")
    private Long shopid;

    /**
     * 商品id
     */
    @TableField("SID")
    private long sid;

    /**
     * 采购数量
     */
    @TableField("BNUM")
    private Integer bnum;

    /**
     * 采购人
     */
    @TableField("UID")
    private Integer uid;

    /**
     * 采购时间
     */
    @TableField("BTIME")
    private Date btime;

    /**
     * 状态
     */
    @TableField("STATUS")
    private Integer status;


}
