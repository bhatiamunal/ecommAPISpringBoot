package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> saveOrder(List<Order> order) {
        return repository.saveAll(order);
    }

    public List<Order> getOrder() {
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id).orElse(null);
    }

//    public Order getOrderByName(String name) {
//        return repository.findByName(name);
//    }

    public String deleteOrder(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Order updateOrder(Order order) {
        Order existingOrder = repository.findById(order.getId()).orElse(null);
        existingOrder.setOrderId(order.getOrderId());
        existingOrder.setQty(order.getQty());
        existingOrder.setUserid(order.getUserid());
        
        return repository.save(existingOrder);
    }
}
