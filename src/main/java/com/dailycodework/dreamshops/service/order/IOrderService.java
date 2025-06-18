package com.dailycodework.dreamshops.service.order;

import com.dailycodework.dreamshops.dto.OrderDto;
import com.dailycodework.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

<<<<<<< HEAD
    List<OrderDto> getUserOrders(Long userId);
=======
    List<Order> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
>>>>>>> 5121afe7e222f7c1aec788121c60c77d18356ff7
}
