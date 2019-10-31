package fakeSite;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class AccountHolderController  {
	
	@RequestMapping(value = "/**")
	public ModelAndView holderList() {
		ModelAndView view = new ModelAndView("home");
		view.addObject("message", LocalDateTime.now());
		return view;
	}

}
