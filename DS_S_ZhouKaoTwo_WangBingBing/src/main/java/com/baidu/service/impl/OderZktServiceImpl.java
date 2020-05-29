package com.baidu.service.impl;

import com.baidu.common.resp.OderRes;
import com.baidu.entity.OderZkt;
import com.baidu.mapper.OderZktMapper;
import com.baidu.service.IOderZktService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@Service
public class OderZktServiceImpl extends ServiceImpl<OderZktMapper, OderZkt> implements IOderZktService {

    @Autowired
    private OderZktMapper oderZktMapper;
    @Override
    public List<OderRes> getAllOder(Map map) {
        return oderZktMapper.getAllOder(map);
    }
}
