package net.madvirus.spring4.chap02.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap02.erp.ErpClient;
import net.madvirus.spring4.chap02.erp.ErpClientFactory;

public class MainForErp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:config-erp.xml");
		ErpClientFactory factory=ctx.getBean("factory",ErpClientFactory.class);
		ErpClient client=factory.create();
		client.connect();
		client.close();
		ctx.close();
	}
}
