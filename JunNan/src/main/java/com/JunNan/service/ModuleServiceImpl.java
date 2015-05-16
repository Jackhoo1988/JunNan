package com.JunNan.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.JunNan.dao.ModuleMapper;

import net.sf.json.JSONObject;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService {
 
	@Resource
	private ModuleMapper moduleMapper; 


	@Override
	public JSONObject selectById(Long id) {
		Map<Object,Object> map=new HashMap<>();
		map.put("data", moduleMapper.selectByPrimaryKey(id));
		return JSONObject.fromObject(map);
	}


	@Override
	public JSONObject listModule() {
		Map<Object,Object> map=new HashMap<>();
		map.put("data", moduleMapper.listModule());
		System.out.println("num:" + moduleMapper.listModule().size());
		return JSONObject.fromObject(map);
	}

}
