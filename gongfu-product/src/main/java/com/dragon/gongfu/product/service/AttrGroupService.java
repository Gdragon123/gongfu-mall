package com.dragon.gongfu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

