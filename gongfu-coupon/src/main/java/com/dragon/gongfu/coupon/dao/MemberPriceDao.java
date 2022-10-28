package com.dragon.gongfu.coupon.dao;

import com.dragon.gongfu.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 14:58:12
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
