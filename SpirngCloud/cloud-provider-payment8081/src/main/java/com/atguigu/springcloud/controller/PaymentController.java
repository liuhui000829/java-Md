package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value="/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        System.out.println(result);
        log.info("插入成功");
        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        }else{
            return new CommonResult(404, "插入数据失败", null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentId(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentId(id);
        System.out.println(payment);
        log.info("查询成功");
        if (payment !=null) {
            return new CommonResult(200, "查询成功", payment);
        }else{
            return new CommonResult(404, "查询失败", null);
        }
    }

}
