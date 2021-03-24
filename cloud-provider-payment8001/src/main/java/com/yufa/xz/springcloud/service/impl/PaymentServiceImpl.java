package com.yufa.xz.springcloud.service.impl;

import com.yufa.xz.springcloud.dao.PaymentDao;
import com.yufa.xz.springcloud.entities.Payment;
import com.yufa.xz.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author LiuYe
 * @data 2021/3/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

