package com.admin.expense.control.repository;

import com.admin.expense.control.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    Optional<Budget> findByCategoryId(Long category_id);

    @Query("SELECT b from Budget b WHERE b.current_spending > b.monthly_limit")
    List<Budget> findExceededBudgets();
}
