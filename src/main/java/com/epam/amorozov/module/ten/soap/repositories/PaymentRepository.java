package com.epam.amorozov.module.ten.soap.repositories;

import com.epam.amorozov.module.ten.soap.models.PaymentEntity;

import java.util.Optional;

public interface PaymentRepository {
    Optional<PaymentEntity> getPaymentByPaymentId(Long paymentId);
    Optional<PaymentEntity> savePayment(PaymentEntity paymentEntity);
    Optional<PaymentEntity> findById(Long id);
}
