package com.kh.finalproject.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PointInventoryDto {
    private int pointInventoryNo; 
    private String pointInventroyMemberId; 
    private int pointInventoryPointItemNo; 
    private int pointInventoryItemAmount;
    private String pointInventoryItemType;
    private LocalDateTime pointInventoryPurchaseDate; 	
}