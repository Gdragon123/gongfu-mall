package com.dragon.gongfu.order.dao;

import com.dragon.gongfu.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author rsl
 * @email sunlightcs@gmail.com
 * @date 2022-10-28 13:40:25
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
