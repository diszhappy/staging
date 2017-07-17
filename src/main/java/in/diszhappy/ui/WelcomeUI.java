package in.diszhappy.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
/**
 * 
 * @author Saumm
 * Created on 17-Jul-2017 11:31:01 PM
 */
@Theme("valo")
@SpringUI(path = "/welcome")
public class WelcomeUI extends UI {
	private static final long serialVersionUID = -2857987309424732815L;
	
	private static final Logger log = LoggerFactory.getLogger(WelcomeUI.class);

	@Value("${welcome.message}")
	private String message;
	/**
	 * This method is written by Saumm on 17-Jul-2017 11:31:24 PM
	 * Desc : This method will initialize the UI
	 */
	@Override
	protected void init(VaadinRequest request) {
		log.info("Initializing the screen");
		setContent(new Label(message));
	}

}