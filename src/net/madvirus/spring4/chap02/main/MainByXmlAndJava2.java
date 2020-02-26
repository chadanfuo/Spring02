package net.madvirus.spring4.chap02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.PasswordChangeService;
import net.madvirus.spring4.chap02.conf.ConfigWithXmlImport;
import net.madvirus.spring4.chap02.sensor.Sensor;

public class MainByXmlAndJava2 {
	public static void main(String[] args) {
		//useBean(new GenericXmlApplicationContext("classpath:config-with-java.xml"));
		useBean(new AnnotationConfigApplicationContext(ConfigWithXmlImport.class));
	}
	private static void useBean(AbstractApplicationContext ctx){
		AuthenticationService authSvc=ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authentcate("bkchoi", "1234");
		PasswordChangeService pwChaSvc=ctx.getBean(PasswordChangeService.class);
		pwChaSvc.changePassword("bkchoi", "1234", "5678");
		Sensor sensor1=ctx.getBean("sensor1",Sensor.class);
		System.out.println(sensor1);
		ctx.close();
	}
}
