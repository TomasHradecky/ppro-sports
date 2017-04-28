package cz.uhk.sportportal.controller;

import cz.uhk.sportportal.service.CommentService;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	/**
	 * Method redirects to index page
	 */
	@RequestMapping(value = "/indeasx", method = RequestMethod.GET)
	public String showIndex() {
		return "home";
	}

}
