package com.mq.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mq.app.bean.MessageBean;
import com.mq.app.brocker.MessageBrocker;

@Controller
@RequestMapping("/service")
public class HomeController {
	
	@Autowired
	private MessageBrocker brocker;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test () {
		brocker.send(new MessageBean("test"));
		return "test";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.GET)
	@ResponseBody
	public String send (@RequestParam(name="message", defaultValue="test")String message) {
		brocker.send(new MessageBean(message));
		return message;
	}
}
