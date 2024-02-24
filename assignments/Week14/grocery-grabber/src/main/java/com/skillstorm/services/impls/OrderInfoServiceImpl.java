package com.skillstorm.services.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.OrderInfo;
import com.skillstorm.repositories.OrderInfoRepository;
import com.skillstorm.services.OrderInfoService;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public OrderInfoServiceImpl(OrderInfoRepository orderInfoRepository) {
        this.orderInfoRepository = orderInfoRepository;
    }

    @Override
    public List<OrderInfo> findAll() {
        return orderInfoRepository.findAll();
    }

    @Override
    public OrderInfo findById(long orderInfoId) {
        Optional<OrderInfo> optionalOrderInfo = orderInfoRepository.findById(orderInfoId);
        if (optionalOrderInfo.isPresent()) {
            return optionalOrderInfo.get();
        } else {
            throw new IllegalArgumentException("Id not found.");
        }
    }

    @Override
    public OrderInfo save(OrderInfo orderInfo) {
        if (orderInfo != null) {
            return orderInfoRepository.save(orderInfo);
        } else {
            throw new IllegalArgumentException("OrderInfo is null.");
        }
    }
    

}
