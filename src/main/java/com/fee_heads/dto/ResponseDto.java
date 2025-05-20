package com.fee_heads.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDto {
	private int tran_head_id;
    private String head_name;
    private Date created_on;
    private int created_by;
    private int payment_head;
    private int scenaro_id;
    private int ob_scenaro_id;
    private int quick_payment_head;
    private String sub_head_code;
    private int payment_data;
    private int category_id;
    private int daysheet_head;

}
