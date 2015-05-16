package com.JunNan.dao;

import java.util.List;

import com.JunNan.model.Module;

public interface ModuleMapper {

    Module selectByPrimaryKey(Long ID);
    
    List<Module> listModule();
}