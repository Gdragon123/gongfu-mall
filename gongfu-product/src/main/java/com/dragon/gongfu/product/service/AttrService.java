package com.dragon.gongfu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

