package com.yufa.xz.springcloud.service;

import com.yufa.xz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author LiuYe
 * @data 2021/3/22
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
