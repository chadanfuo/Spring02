package net.madvirus.spring4.chap02.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.sensor.Monitor;

public class MainByAll {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:config-all.xml");
		AuthenticationService authSvc=ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authentcate("bkchoi", "1234");
		
		Monitor monitor =ctx.getBean(Monitor.class);
		System.out.println(monitor);
		ctx.close();
	}
}
