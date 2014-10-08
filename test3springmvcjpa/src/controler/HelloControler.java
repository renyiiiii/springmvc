package controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControler {
	@RequestMapping("/show")
	public String show(HttpServletRequest req,
            HttpServletResponse res){
		System.out.println("show");
		req.setAttribute("msg", "annotation");
		return "hello";
	}

}
