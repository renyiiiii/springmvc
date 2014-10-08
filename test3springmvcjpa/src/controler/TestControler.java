package controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestControler implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("id"));
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("msg", "hello world"+request.getParameter("id")+"/"+request.getParameter("name"));
		return mav;
	}

}
