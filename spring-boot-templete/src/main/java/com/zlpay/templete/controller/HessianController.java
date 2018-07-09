package com.zlpay.templete.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.syuf.common.ActivemqAppService;


@RestController
@RequestMapping("/hessian")
public class HessianController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HessianController.class);
	
//	@Autowired
//	private ActivemqAppService activemqAppService;
	
	@GetMapping("/sendMessage")
	public String sendMessage(String msg){
		try {
//			String resultmsg = activemqAppService.sendMessage(msg);
//			LOG.info(resultmsg);
		} catch (Exception e) {
			LOG.error("发送消息失败",e);
		}
		return "success";
	}
	
	@RequestMapping(value="/say",method=RequestMethod.GET)
	public String say(){
		return "Hello World!";
	}

}
