package net.madvirus.spring4.chap02.sensor;

import org.springframework.context.support.GenericXmlApplicationContext;
//xml���
public class MainForSensor {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:config-sensor.xml");
		Monitor monitor=ctx.getBean(Monitor.class);
		System.out.println(monitor);
		ctx.close();
	}
}
