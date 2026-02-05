package com.admin.expense.control.repository;

import com.admin.expense.control.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    List<PaymentMethod> findByUserId(Long user);

    List<PaymentMethod> findByNameContaining(String name);

    boolean existByIdAndUserId(Long id, Long user);

    boolean existsByNameAndUserId(String name, Long user);
}
