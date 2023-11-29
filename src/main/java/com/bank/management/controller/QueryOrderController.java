package com.bank.management.controller;

import com.bank.management.entity.Event;
import com.bank.management.entity.QueryOrder;
import com.bank.management.service.QueryOrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.util.Arrays;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping("/api/orders")
public class QueryOrderController {

    @Autowired
    QueryOrderService service;

    @GetMapping(value = "/getOrder/{orderId}",
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<QueryOrder> getOrder(@PathVariable long orderId) {
        QueryOrder order = service.fetchOrder(orderId);
        return ResponseEntity.ok().body(order);
    }
}
