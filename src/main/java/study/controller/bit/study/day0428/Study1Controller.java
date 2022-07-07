package study.controller.bit.study.day0428;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Study1Controller {
		@GetMapping("/")
public String process1(Model model)
	{
		model.addAttribute("message","오늘은 즐거운 목요일!!!!");
		model.addAttribute("today", new Date());
		
		return "hello/study1"; //포워드(url안바뀜,model데이타 전달)
	}
		@GetMapping("/go1")
		public ModelAndView process2()
		{
			ModelAndView mview=new ModelAndView();
			mview.addObject("name","최윤석");
			mview.addObject("addr","대한민국");
			mview.setViewName("hello/study2"); //포워드 될 파일명
			return mview;
		}
		@GetMapping("/go2/busan/sea")
		public String process3()
		{
			return "hello/study3";
		}
		@GetMapping({"/go3","/go3/jeju","/go3/seoul"}) 
		//2개이상일떄는 {}넣는다, go3 go3jeju, go3seoul일때도 study4로 가게한다.
		public String process4(HttpServletRequest request,Model model)
		{
			String urlPath=request.getContextPath(); //프로젝트명까지 구하기
			String urlPath2=request.getRequestURI(); //현재 url 전체 경로 구하기
			System.out.println(urlPath); //day0428 로 출력
			System.out.println(urlPath2); //day0428/go3/jeju로 출력
			
			model.addAttribute("Path",urlPath); //Path에다가 urlPath 저장 
			return "hello/study4";
		}
}
