package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
    @CrossOrigin(origins="http://localhost:4200/")
    @PostMapping("/addOrder")
    public List<Order> addOrder(@RequestBody List<Order> order) {
        return service.saveOrder(order);
    }

    @CrossOrigin(origins="http://localhost:4200/")
    @GetMapping("/viewOrder")
    public List<Order> findAllOrder() {
        return service.getOrder();
    }

    @GetMapping("/orderById/{id}")
    public Order findOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }

//    @GetMapping("/orderByName/{name}")
//    public Order findOrderByName(@PathVariable String name) {
//        return service.getOrderByName(name);
//    }

    @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order) {
        return service.updateOrder(order);
    }
    @CrossOrigin(origins="http://localhost:4200/")
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable int id) {
        return service.deleteOrder(id);
    }

}
