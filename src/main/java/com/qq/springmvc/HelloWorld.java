/**
 * 
 * @Date:2019年10月16日
 * 
 */
package com.qq.springmvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liupan
 *
 */
@Controller
public class HelloWorld {

	private static Log logger = LogFactory.getLog("com.qq.springmvc.HelloWorld");
	
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("Hello World");
		logger.info("aaa");
		System.out.println(logger.getClass().getName());
		return "success";
	}
}
