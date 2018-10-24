package com.palash.SpringExample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String Home() {
		return "/view/display.jsp";
		
	}
	@RequestMapping("/add")
	public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {
		int i,j,k;
		i=j=k=0;
		if(request.getParameter("t1")!=null)
			i=Integer.parseInt(request.getParameter("t1")) ;
		if(request.getParameter("t2")!=null)
			j=Integer.parseInt(request.getParameter("t2")) ;
		k = i+j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/view/display.jsp");
		mv.addObject("result", k);
		return mv;
	}
}
