package com.lalibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class LostAndFoundVO {
	private String property_id;	//분실물 아이디
	private String library_id;	//도서관 아이디
	private String property_name;	//분실물 이름
	private String found_date;	//발견한 날짜
	
	public LostAndFoundVO(String library_id, String property_name, String found_date) {
		super();
		this.library_id = library_id;
		this.property_name = property_name;
		this.found_date = found_date;
	}
	
}
