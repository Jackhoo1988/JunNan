package com.JunNan.service;

import net.sf.json.JSONObject;
public interface ModuleService {
	JSONObject listModule();
	JSONObject selectById(Long id); 
}
