package com.dragon.gongfu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:25
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

