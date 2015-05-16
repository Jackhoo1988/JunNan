package com.JunNan.action;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.JunNan.service.ModuleService;

@Controller
@Scope("prototype")
public class ModuleAction {

	@Resource
	private ModuleService moduleService;
	private JSONObject jsobj;
	
	public String load(){
		jsobj =  moduleService.listModule();
    	System.out.println(jsobj.toString());
    	return "jsobj";
	}
}
