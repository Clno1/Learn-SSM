package com.atguigu.curd.test;

import com.atguigu.curd.bean.*;
import com.atguigu.curd.dao.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Test
	public void testCRUD() {
		/*���Բ���
		//1������SpringIOC����
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2���������л�ȡmapper
		DepartmentMapper bean=ioc.getBean(DepartmentMapper.class);
		*/
		
		System.out.println(departmentMapper);
	}
}

/*
java.lang.IllegalStateException: Failed to load ApplicationContext
*/