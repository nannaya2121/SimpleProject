package org.sp.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyDTO {

	private int r_no;
	private int r_boardNum;
	private String r_writer;
	private String r_content;
	private Timestamp r_regDate;
	
}
