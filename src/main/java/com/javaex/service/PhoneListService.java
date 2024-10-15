package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneListDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneListService {
	
	@Autowired
	private PhoneListDao phoneListDao;
	
	
	/* 전화번호 전체 가져오기 */
	public List<PersonVo> exeGetPersonList(){
		System.out.println("PhoneListService.exeGetPerson()");
		
		List<PersonVo> personList = phoneListDao.getPersonList();
		
		return personList;
	}
	
}
