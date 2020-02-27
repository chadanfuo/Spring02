package net.madvirus.spring4.chap02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.PasswordChangeService;

public class MainByJavaPackage {
	public static void main(String[] args) {
		//������̼� ����� �ڹټҽ��� net.madvirus.spring4.chap02.conf ��Ű���ȿ� �־����
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("net.madvirus.spring4.chap02.conf");
		//AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("atemp");
		
		AuthenticationService authSvc =ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authentcate("bkchoi", "1234");
		
		PasswordChangeService pwChgSvc=ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");
		ctx.close();
	}
}
