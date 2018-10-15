package com.waterelephant.mapper;

import java.util.List;

import com.waterelephant.entity.SysUser;

public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}