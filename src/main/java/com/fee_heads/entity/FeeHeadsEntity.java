package com.fee_heads.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeeHeadsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int tran_head_id;
	private int  head_code;
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
