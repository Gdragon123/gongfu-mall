package com.dragon.gongfu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:24
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

