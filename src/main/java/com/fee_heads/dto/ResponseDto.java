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
	private String  head_code;
    private String head_name;
    private Date created_on;
    private String created_by;
    private int payment_heads;
    private int scenario_id;
    private Integer ob_paid_scenario_id;
    private int quick_payment_heads;
    private String sub_head_code;
    private int payment_data;
    private int category_id;
    private int daysheet_heads;

}
