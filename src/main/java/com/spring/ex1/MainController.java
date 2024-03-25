package com.spring.ex1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "mainController") // id는 mainController
@RequestMapping(value = "/yahoo/")
public class MainController {

	// 요청 처리 클래스의 메소드에 웹 요청을 매핑하기 위한 주석입니다.

	/*
	 * @RequestMapping(value = "/yahoo/hello.do") ModelAndView
	 * main(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception { ModelAndView mav = new ModelAndView(); mav.setViewName("main");
	 * return mav; }
	 * 
	 * @RequestMapping(value = "/yahoo/hi2.do") ModelAndView
	 * main2(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception { ModelAndView mav = new ModelAndView(); mav.setViewName("main2");
	 * return mav; }
	 * 
	 * @RequestMapping(value = "/yahoo/dhdhdh.do") ModelAndView
	 * main3(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception { ModelAndView mav = new ModelAndView(); mav.setViewName("dhdhdh");
	 * return mav; }
	 * 
	 * @RequestMapping(value = "/yahoo/hi4.do") ModelAndView
	 * main4(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception { ModelAndView mav = new ModelAndView(); mav.setViewName("hi4");
	 * return mav; }
	 */

	@RequestMapping(value = "hello.do", method = RequestMethod.GET) // RequestMethod는 기본이 GET이므로 생략이 가능
	ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("age",33);
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping(value = "hi2.do", method = RequestMethod.POST) // RequestMethod는 GET 방식이 때문에 POST로 접근하면 에러가 발생한다.
	ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main2");
		return mav;
	}

	@RequestMapping(value = "dhdhdh.do")
	ModelAndView main3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("color","파란색");
		mav.setViewName("dhdhdh");
		return mav;
	}

	@RequestMapping(value = "hi4.do")
	ModelAndView main4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		Student stu1=new Student();
		stu1.setBan(1);
		stu1.setName("홍길동");
		mav.addObject("student1",stu1);
		Student stu2=new Student(7,"홍이동");
		mav.addObject("student2",stu2);
		mav.setViewName("hi4");
		return mav;
	}
}
