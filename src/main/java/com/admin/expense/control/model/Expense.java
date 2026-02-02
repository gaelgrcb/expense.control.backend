package com.admin.expense.control.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Long category_id;
    private Long payment_method_id;
}
