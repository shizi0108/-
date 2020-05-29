package com.baidu.mapper;

import com.baidu.common.resp.OderRes;
import com.baidu.entity.OderZkt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
public interface OderZktMapper extends BaseMapper<OderZkt> {

    List<OderRes> getAllOder(Map map);
}
