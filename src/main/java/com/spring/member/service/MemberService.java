package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	
	void addMember(MemberVO memberVO) throws DataAccessException;

	public void updateMember(MemberVO memberVO) throws DataAccessException;
	
	public void delMember(String id) throws DataAccessException;
}
