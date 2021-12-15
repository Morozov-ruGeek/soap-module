package com.epam.amorozov.module.ten.soap.services;

import com.epam.amorozov.module.ten.soap.models.PaymentEntity;
import com.epam.amorozov.module.ten.soap.soaps.payments.Payment;

public interface PaymentService {
    Payment saveNewPayment(PaymentEntity paymentEntity);
    Payment getPaymentByPaymentId(Long paymentId);
}
