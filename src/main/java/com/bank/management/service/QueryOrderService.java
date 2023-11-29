package com.bank.management.service;

import com.bank.management.entity.Event;
import com.bank.management.entity.QueryOrder;
import com.bank.management.messaging.QueryOrderEventReceiver;
import com.bank.management.repository.QueryOrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class QueryOrderService {

    @Autowired
    private QueryOrderRepository repository;

    public QueryOrder fetchOrder(Event event) {
        Optional<QueryOrder> order = repository.findById(event.getOrderId());
        return order.get();
    }

    public QueryOrder fetchOrder(Long orderId) {
        Optional<QueryOrder> order = repository.findById(orderId);
        return order.get();
    }
}