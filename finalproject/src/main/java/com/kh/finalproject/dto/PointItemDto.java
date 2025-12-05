package com.kh.finalproject.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PointItemDto {
    private int pointItemNo; 
    private String pointItemName; 
    private String pointItemType; 	
    private String pointItemContent; 
    private int pointItemPrice;
    private int pointItemStock;
    private LocalDateTime pointItemReg;
}