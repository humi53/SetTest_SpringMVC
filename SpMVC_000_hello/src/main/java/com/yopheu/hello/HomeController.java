package com.yopheu.hello;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yopheu.hello.models.TestDto;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		TestDto testDto = new TestDto();
		return "home";
	}
	
}
