package com.spring.ex2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller(value = "loginController1")
public class LoginController {

	@RequestMapping(value = { "/test/loginForm.do"/* , "/test/loginForm2.do" */ }, method = { RequestMethod.GET })
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");

		return mav;
	}

	@RequestMapping(value = "/test/login.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		mav.addObject("userID", id);
		mav.addObject("userName", name);

		return mav;
	}

//	@RequestMapping(value = { "/test/loginForm2.do" }, method = { RequestMethod.GET })
//	public ModelAndView loginForm2(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("loginForm2");
//
//		return mav;
//	}
//	// required = false로 설정해 놓으면 id 파라미터가 없을 경우 null 반환
//	@RequestMapping(value = "/test/login2.do", method = { /* RequestMethod.GET, */RequestMethod.POST })
//	public ModelAndView login2(@RequestParam(value = "id", required = true) String id,
//			@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result2");
//
//		/*
//		 * String id = request.getParameter("id"); String name =
//		 * request.getParameter("name");
//		 */
////		System.out.println("@@" + id);
//		mav.addObject("userID", id);
//		mav.addObject("userName", name);
//		System.out.println(id);
//		System.out.println(name);
//
//		return mav;
//	}

//	@RequestMapping(value = { "/test/loginForm3.do" }, method = { RequestMethod.GET })
//	public ModelAndView loginForm3(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("loginForm3");
//
//		return mav;
//	}
//
//	@RequestMapping(value = "/test/login3.do", method = { /* RequestMethod.GET, */RequestMethod.POST })
//	public ModelAndView login2(@RequestParam Map<String, String> info,
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println(info);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("info",info);
//		mav.setViewName("result3");
//
//		return mav;
//	}

	@RequestMapping(value = { "/test/loginForm4.do" }, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView loginForm4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm4");

		return mav;
	}

	@RequestMapping(value = "/test/login4.do", method = RequestMethod.POST)
	public ModelAndView login4(Student stu, HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println(stu);
		stu.setBan(7);
		stu.setName("홍길동");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("stu",stu);
		mav.setViewName("result4");
		return mav;
	}
	
	@RequestMapping(value = { "/test/loginForm5.do" }, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView loginForm5(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm5");

		return mav;
	}

	@RequestMapping(value = "/test/login5.do", method = RequestMethod.POST)
	public ModelAndView login5(@ModelAttribute("info") LoginVO loginVO, HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println(loginVO);
		System.out.println(loginVO.getId());
		System.out.println(loginVO.getName());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result5");
		return mav;
	}
}
