package com.admin.expense.control.repository;

import com.admin.expense.control.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByDateBetween(LocalDateTime start, LocalDateTime end);

    List<Expense> findByAmountGreaterThan(BigDecimal amount);

    List<Expense> findByDescriptionContaining(String description);
}
