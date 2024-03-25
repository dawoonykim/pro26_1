package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import com.spring.member.vo.MemberVO;

public interface MemberContronller {

	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView addMember(MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception;

	ModelAndView updateMemberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView updateMember(MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception;

	ModelAndView deleteMember(String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception;

	
}
