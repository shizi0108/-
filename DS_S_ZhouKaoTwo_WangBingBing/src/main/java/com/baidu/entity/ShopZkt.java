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
public class ShopZkt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "SID", type = IdType.AUTO)
    private Long sid;

    /**
     * 商品名称
     */
    @TableField("SNAME")
    private String sname;

    /**
     * 单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 价格
     */
    @TableField("PRICE")
    private Double price;

    /**
     * 库存量
     */
    @TableField("STORAGE")
    private Integer storage;


}
