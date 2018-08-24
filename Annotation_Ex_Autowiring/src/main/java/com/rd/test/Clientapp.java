package com.rd.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.rd.beans.Remote;

public class Clientapp {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Remote r=ctx.getBean("remote",Remote.class);
		r.perform();
		
	((AbstractApplicationContext) ctx).close();
	}

}
