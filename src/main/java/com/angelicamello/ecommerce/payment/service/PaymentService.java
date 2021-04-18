package com.angelicamello.ecommerce.payment.service;

import com.angelicamello.ecommerce.payment.entity.PaymentEntity;
import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
