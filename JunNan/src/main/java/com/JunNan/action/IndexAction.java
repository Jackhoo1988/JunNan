package com.JunNan.action;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.JunNan.model.Module;
import com.JunNan.service.ModuleService;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class IndexAction {
	@Resource
	private ModuleService moduleService;
	private JSONObject jsobj;
	
	public String initInfo(){System.out.println("出来吧！！！");
		//加载模块信息
		jsobj =  moduleService.listModule();
    	List<Module> modules = (List<Module>) jsobj.get("data");
    	ActionContext.getContext().getSession().put("modules", modules);
    	return "jsobj";
	}

	public JSONObject getJsobj() {
		return jsobj;
	}

	public void setJsobj(JSONObject jsobj) {
		this.jsobj = jsobj;
	}
	
}
