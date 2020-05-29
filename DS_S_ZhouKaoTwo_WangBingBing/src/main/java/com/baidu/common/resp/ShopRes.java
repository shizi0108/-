package com.baidu.common.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@Data
public class ShopRes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private Long sid;

    /**
     * 商品名称
     */
    private String sname;

    /**
     * 单位
     */
    private String unit;

    /**
     * 价格
     */
    private Double price;

    /**
     * 库存量
     */
    private Integer storage;

    /**
     * 购买量
     */
    private int bnum;

    /**
     * 购买人id
     */
    private Integer uid;

}
