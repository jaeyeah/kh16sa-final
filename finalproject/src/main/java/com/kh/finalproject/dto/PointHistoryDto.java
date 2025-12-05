package com.kh.finalproject.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PointHistoryDto {
    
    // DB컬럼: point_history_no -> 자바: pointHistoryNo
    private int pointHistoryNo; 
    
    // DB컬럼: point_history_member_id -> 자바: pointHistoryMemberId
    private String pointHistoryMemberId; 
    
    // DB컬럼: point_history_amount -> 자바: pointHistoryAmount
    private int pointHistoryAmount; 
    
    // DB컬럼: point_history_reason -> 자바: pointHistoryReason
    private String pointHistoryReason; 
    
    //DB컬럼: point_history_item_no -> 자바: pointHistoryItemNo (구매 항목을 위해 추가)
    
    private Integer pointHistoryItemNo;
    
    // DB컬럼: point_history_date -> 자바: pointHistoryDate
    private LocalDateTime pointHistoryDate; 
}