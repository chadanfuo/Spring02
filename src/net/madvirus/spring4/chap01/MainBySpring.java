package net.madvirus.spring4.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBySpring {
	public static void main(String[] args) {
		String configLocation="classpath:applicationContext.xml";//src밑에 만약 패키지안에있으면 패키지까지써주기
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLocation);
		Project project=ctx.getBean("sampleProject",Project.class);
		project.build();
		ctx.close();
	}
}
