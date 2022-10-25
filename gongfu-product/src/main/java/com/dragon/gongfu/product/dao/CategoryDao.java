package com.dragon.gongfu.product.dao;

import com.dragon.gongfu.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
