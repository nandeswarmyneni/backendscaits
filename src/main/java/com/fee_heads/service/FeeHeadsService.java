package com.fee_heads.service;

import com.fee_heads.dto.RequestDto;
import com.fee_heads.dto.ResponseDto;
import com.fee_heads.entity.FeeHeadsEntity;
import com.fee_heads.repository.FeeHeadRepo;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeeHeadsService {
	 @Autowired
    private final FeeHeadRepo feeHeadsRepository;
    private final ModelMapper modelMapper;

   
    public FeeHeadsService(FeeHeadRepo feeHeadsRepository, ModelMapper modelMapper) {
        this.feeHeadsRepository = feeHeadsRepository;
        this.modelMapper = modelMapper;
    }

    public ResponseDto createFeeHead(RequestDto requestDto) {
        FeeHeadsEntity entity = modelMapper.map(requestDto, FeeHeadsEntity.class);
        FeeHeadsEntity savedEntity = feeHeadsRepository.save(entity);
        return modelMapper.map(savedEntity, ResponseDto.class);
    }

    public List<ResponseDto> getAllFeeHeads() {
        return feeHeadsRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, ResponseDto.class))
                .collect(Collectors.toList());
    }

    public ResponseDto getFeeHeadById(int id) {
        return feeHeadsRepository.findById(id)
                .map(entity -> modelMapper.map(entity, ResponseDto.class))
                .orElseThrow(() -> new RuntimeException("FeeHead not found with id: " + id));
    }

    public ResponseDto updateFeeHead(int id, RequestDto requestDto) {
        FeeHeadsEntity existing = feeHeadsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("FeeHead not found with id: " + id));

        modelMapper.map(requestDto, existing);
        FeeHeadsEntity updated = feeHeadsRepository.save(existing);
        return modelMapper.map(updated, ResponseDto.class);
    }

    public void deleteFeeHead(int id) {
        if (!feeHeadsRepository.existsById(id)) {
            throw new RuntimeException("FeeHead not found with id: " + id);
        }
        feeHeadsRepository.deleteById(id);
    }
}
