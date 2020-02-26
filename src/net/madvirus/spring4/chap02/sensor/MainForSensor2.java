package net.madvirus.spring4.chap02.sensor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.madvirus.spring4.chap02.conf.ConfigSensor;


//어노테이션 방식
public class MainForSensor2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(ConfigSensor.class);
		Monitor monitor=ctx.getBean(Monitor.class);
		System.out.println(monitor);
		ctx.close();
	}
}
