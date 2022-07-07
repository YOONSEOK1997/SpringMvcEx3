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
		model.addAttribute("message","������ ��ſ� �����!!!!");
		model.addAttribute("today", new Date());
		
		return "hello/study1"; //������(url�ȹٲ�,model����Ÿ ����)
	}
		@GetMapping("/go1")
		public ModelAndView process2()
		{
			ModelAndView mview=new ModelAndView();
			mview.addObject("name","������");
			mview.addObject("addr","���ѹα�");
			mview.setViewName("hello/study2"); //������ �� ���ϸ�
			return mview;
		}
		@GetMapping("/go2/busan/sea")
		public String process3()
		{
			return "hello/study3";
		}
		@GetMapping({"/go3","/go3/jeju","/go3/seoul"}) 
		//2���̻��ϋ��� {}�ִ´�, go3 go3jeju, go3seoul�϶��� study4�� �����Ѵ�.
		public String process4(HttpServletRequest request,Model model)
		{
			String urlPath=request.getContextPath(); //������Ʈ������ ���ϱ�
			String urlPath2=request.getRequestURI(); //���� url ��ü ��� ���ϱ�
			System.out.println(urlPath); //day0428 �� ���
			System.out.println(urlPath2); //day0428/go3/jeju�� ���
			
			model.addAttribute("Path",urlPath); //Path���ٰ� urlPath ���� 
			return "hello/study4";
		}
}