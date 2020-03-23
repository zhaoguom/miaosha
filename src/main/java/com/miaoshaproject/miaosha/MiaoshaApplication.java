package com.miaoshaproject.miaosha;

import com.miaoshaproject.miaosha.dao.UserDOMapper;
import com.miaoshaproject.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.miaoshaproject.miaosha"})
@RestController
@MapperScan("com.miaoshaproject.miaosha.dao")
public class MiaoshaApplication {

	@Autowired
	private UserDOMapper userDOMapper;

	public static void main(String[] args) {
		SpringApplication.run(MiaoshaApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		UserDO userDO = userDOMapper.selectByPrimaryKey(2);
		if(userDO==null){
			return "user not found";
		} else{
			return userDO.getName();
		}
	}
}
