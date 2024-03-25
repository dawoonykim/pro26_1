package com.spring.member.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberDAO {
	public List selectAllMemberList() throws DataAccessException ;

	public void addMember(MemberVO memberVO);
	
	public void updateMember(MemberVO memberVO) throws DataAccessException;
	
	void delMember(String id) throws DataAccessException;
}
