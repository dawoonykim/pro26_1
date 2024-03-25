package com.spring.ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller(value = "loginController")
public class LoginController {

	// Model
	// 모델 속성에 대한 홀더를 정의하는 인터페이스
	// 주로 모델에 속성을 추가하기 위해 설계
	// 전체 모델에 java.util.Map으로 액세스할 수 있음
	
	// Model 클래스의 addAttribute()메소드는 ModelAndView의 addObject()메소드와 같은 기능
	// Model 클래스는 따로 view 정보를 전달해야함
	@RequestMapping("/test/login5.do")
	String login5(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("login5");
		model.addAttribute("menu","jajang");
		System.out.println(model);
		return "menupan";
	}
	
	@RequestMapping("/test/login55.do")
	ModelAndView login5(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("login5");
		mav=new ModelAndView();
		mav.setViewName("menupan");
		mav.addObject("menu","jjambbong");
		System.out.println(mav);
		return mav;
	}
}
