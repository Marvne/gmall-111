package com.ppt.gmall.oms.service.impl;

import com.ppt.gmall.oms.entity.Order;
import com.ppt.gmall.oms.mapper.OrderMapper;
import com.ppt.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-11-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
