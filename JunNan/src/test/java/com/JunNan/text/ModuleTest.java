package com.JunNan.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JunNan.service.ModuleService;

public class ModuleTest {

	@Test
	public void ListModule(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ModuleService moduleService = (ModuleService)context.getBean("moduleService");
		
		System.out.println(moduleService.selectById(1L).toString());
	}
}
