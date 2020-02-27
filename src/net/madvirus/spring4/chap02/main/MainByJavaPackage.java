package net.madvirus.spring4.chap02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.PasswordChangeService;

public class MainByJavaPackage {
	public static void main(String[] args) {
		//어노테이션 만드는 자바소스가 net.madvirus.spring4.chap02.conf 패키지안에 있어야힘
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("net.madvirus.spring4.chap02.conf");
		//AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("atemp");
		
		AuthenticationService authSvc =ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authentcate("bkchoi", "1234");
		
		PasswordChangeService pwChgSvc=ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");
		ctx.close();
	}
}
