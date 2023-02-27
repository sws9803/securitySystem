package kr.or.project.main.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonException {

	@ExceptionHandler(RuntimeException.class)
	private ModelAndView handleErrorCommon(Exception e) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("exception",e);
		modelAndView.setViewName("/main/errorCommon");
		return modelAndView;
		
	}
}
