package com.baidu.service;

import com.baidu.common.resp.OderRes;
import com.baidu.entity.OderZkt;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
public interface IOderZktService extends IService<OderZkt> {

    public List<OderRes> getAllOder(Map map);
}
