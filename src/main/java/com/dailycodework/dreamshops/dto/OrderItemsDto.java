package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemsDto {
    private Long productId;
    private String productName;
    private String productBrand;
    private int quantity;
    private BigDecimal price;
}
