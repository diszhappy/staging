/**
 * 
 */
package in.diszhappy.ui;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Saumm
 * Created on 17-Jul-2017 10:07:56 PM
 */
@Controller
public class WelcomeController {
	
	@Value("${welcome.message:test}")
	private String message = "Welcome To Soring Boot Starting";
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 10:10:19 PM
	 * Desc : This method will
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

}
