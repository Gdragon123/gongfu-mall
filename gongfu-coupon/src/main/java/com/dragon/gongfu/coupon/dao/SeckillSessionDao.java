package com.dragon.gongfu.coupon.dao;

import com.dragon.gongfu.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 14:58:13
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
