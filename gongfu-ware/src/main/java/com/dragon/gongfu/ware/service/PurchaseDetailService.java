package com.dragon.gongfu.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.gongfu.common.utils.PageUtils;
import com.dragon.gongfu.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 15:03:25
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

