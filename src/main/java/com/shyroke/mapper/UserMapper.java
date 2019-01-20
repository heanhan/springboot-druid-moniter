package com.shyroke.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shyroke.bean.User;

@Mapper
public interface UserMapper{

	List<User> list();

	User getOne(int id);
	
}
