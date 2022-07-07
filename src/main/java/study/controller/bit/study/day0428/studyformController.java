package study.controller.bit.study.day0428;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.dto.PersonDto;
import data.dto.ShopDto;

@Controller
public class studyformController {
	
	@GetMapping("/form1")
	public String goForm1()
	{
		return "form/testform1";
	}
	@GetMapping("/read1")
	public ModelAndView goRead1(
			/*@RequestParam�� ������ �����ϳ� ��Ȯ�� ���ִ°� ����*/
			@RequestParam String name,
			@RequestParam String ipsa,
			/* @RequestParam(required =false) String pageNum *//*���� �ȳѾ� ������ ������ �ȳ����� �Ѵ�(required =false)*/
			@RequestParam(defaultValue = "10") String pageNum /*���� ���� ��� �⺻���� 10�� ��*/
			)
	{
		ModelAndView mview=new ModelAndView();
		String result=name+"���� �Ի�����"+ipsa+"�Դϴ�";
		mview.addObject("pageNum",pageNum);
		mview.addObject("result",result);
		mview.setViewName("result/view1");
		return mview;
	}
	//////////////////////////////////
	@GetMapping("/form2")
	public String goForm2()
	{
		return "form/testform2";
	}
	@PostMapping("/read2")
	public String goRead2(Model model,
			@RequestParam String name,
			@RequestParam String gender,
			@RequestParam("address") String a) /*���±��� name�� �������� �ٸ����*/
	{
		model.addAttribute("name",name);
		model.addAttribute("gender",gender);
		model.addAttribute("address",a);
		return "result/view2";
	}
	@GetMapping("/form3")
	public String goForm3()
	{
		return "form/testform3";
	}
	@PostMapping("/read3")
	public String goRead3(@ModelAttribute ShopDto dto)//��°�� �о����
{ //@ModelAttribute�� model�� shopDto��� �̸����� ����Ǿ��ִ�.
		System.out.println(dto.getPhoto());
		return "result/view3";
		}
	//////////////
	@GetMapping("/munjae")
	public String goForm4()
	{
		return "form/testform5";
	}
	@PostMapping("/form/result")
	public String goRead4(@ModelAttribute PersonDto dto)//��°�� �о����
{ //@ModelAttribute�� model�� PersonDto��� �̸����� ����Ǿ��ִ�.
		System.out.println(dto.getSpring());
		return "result/view5";
		}
	//////////////
}