package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhoneListService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController 
public class PhoneListController {

	@Autowired
	private PhoneListService phoneListService;
	
	@GetMapping(value="api/phonelist/persons")
	public JsonResult getList() {
		System.out.println("PhoneListController.getList()");
		
		List<PersonVo> personList = phoneListService.exeGetPersonList();
		if (personList != null) {
			System.out.println(personList);
			return JsonResult.success(personList);
		}else {
			return JsonResult.fail("리스트 불러오는데 실패 하였습니다.");
		}
		
		
	}
	
}
