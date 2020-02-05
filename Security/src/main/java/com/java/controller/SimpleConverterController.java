package com.java.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

	
	@Controller
	@RequestMapping("/mc/simple")
	public class SimpleConverterController{
		
		@RequestMapping(method =RequestMethod.GET)
		public String simpleForm() {
			return "mc/simple";
		}
		
		@RequestMapping(method = RequestMethod.POST)
		@ResponseBody
		public String simple(@RequestBody String body) {
			return body;
		}
		
		@RequestMapping("/guestmessage/list")
		@ResponseBody
		public GuestMessageList2 listJson() {
			return getMessageList2();
		}
		
		public GuestMessageList2 getMessageList2() {
			List<GuestMessage> messages = Arrays.asList( new GuestMessage(1,"메세지",new Date()),
														 new GuestMessage(2,"메세지2",new Date()));
			return new GuestMessageList2(messages);
	}
}

