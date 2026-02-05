package com.admin.expense.control.repository;

import com.admin.expense.control.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    List<Income> findByUserId(Long user);

    List<Income> findByDateBetween(LocalDateTime start, LocalDateTime end);

    @Query("SELECT i FROM Income i WHERE i.amount > 10000")
    List<Income> findByAmountExceeded();
}
