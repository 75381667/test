package com.pan.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.pan.model.User;

@Mapper
public interface UserMapper {
	@Select("SELECT id,user_id userId,user_name userName,user_password userPassword,user_limdate userLimdate,user_limit userLimit,telno telno,corp_code corpCode,email,wechatid FROM user_mstr")
	List<User> findAll();

}
