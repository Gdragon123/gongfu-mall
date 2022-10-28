package com.dragon.gongfu.ware.dao;

import com.dragon.gongfu.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 15:03:25
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
