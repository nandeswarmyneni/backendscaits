package com.fee_heads.controller;

import com.fee_heads.dto.RequestDto;
import com.fee_heads.dto.ResponseDto;
import com.fee_heads.service.FeeHeadsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fee-heads")

public class FeeHeadsController {
     
	 @Autowired
    private final FeeHeadsService feeHeadsService;

   
    public FeeHeadsController(FeeHeadsService feeHeadsService) {
        this.feeHeadsService = feeHeadsService;
    }

    
    @PostMapping("/Add_fee_head")
    public ResponseEntity<ResponseDto> createFeeHead(@RequestBody RequestDto requestDto) {
        ResponseDto created = feeHeadsService.createFeeHead(requestDto);
        return ResponseEntity.ok(created);
    }

   
    @GetMapping("/get_all_fee_heads")
    public ResponseEntity<List<ResponseDto>> getAllFeeHeads() {
        List<ResponseDto> feeHeads = feeHeadsService.getAllFeeHeads();
        return ResponseEntity.ok(feeHeads);
    }

   
    @GetMapping("/getFeeHeadById/{id}")
    public ResponseEntity<ResponseDto> getFeeHeadById(@PathVariable int id) {
        ResponseDto feeHead = feeHeadsService.getFeeHeadById(id);
        return ResponseEntity.ok(feeHead);
    }

   
    @PutMapping("/updateFeeHead/{id}")
    public ResponseEntity<ResponseDto> updateFeeHead(
            @PathVariable int id,
            @RequestBody RequestDto requestDto) {
        ResponseDto updated = feeHeadsService.updateFeeHead(id, requestDto);
        return ResponseEntity.ok(updated);
    }

    
    @DeleteMapping("/deleteFeeHead/{id}")
    public ResponseEntity<Void> deleteFeeHead(@PathVariable int id) {
        feeHeadsService.deleteFeeHead(id);
        return ResponseEntity.noContent().build();
    }
}
