package com.dragon.gongfu.order.dao;

import com.dragon.gongfu.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 13:40:25
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
