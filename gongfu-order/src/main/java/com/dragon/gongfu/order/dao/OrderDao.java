package com.dragon.gongfu.order.dao;

import com.dragon.gongfu.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 13:40:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
