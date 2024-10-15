package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneListDao {
	
	// 필드
	@Autowired
	private SqlSession sqlSession; 

	//리스트 가져오기
	public List<PersonVo> getPersonList() {
		System.out.println("PhoneListDao.getPersonList()");
		List<PersonVo> personList = sqlSession.selectList("phonelist.selectList");
		System.out.println("==========================================");
		System.out.println(personList);
		System.out.println("==========================================");

		return personList;
	}
	
}
