package com.dragon.gongfu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:24
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

