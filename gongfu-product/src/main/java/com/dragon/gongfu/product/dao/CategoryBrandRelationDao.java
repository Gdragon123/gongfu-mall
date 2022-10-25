package com.dragon.gongfu.product.dao;

import com.dragon.gongfu.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-25 02:18:25
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
