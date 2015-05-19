package com.JunNan.model;

import java.util.List;

public class Module {

	private Long ID;
	private String Name;
	private String Url;
	private List<ModuleItem> moduleItems;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public List<ModuleItem> getModuleItems() {
		return moduleItems;
	}
	public void setModuleItems(List<ModuleItem> moduleItems) {
		this.moduleItems = moduleItems;
	}
	
	
}
