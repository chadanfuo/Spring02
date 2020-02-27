package net.madvirus.spring4.chap02.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap02.conf.ConfigShop;
import net.madvirus.spring4.chap02.conf.ConfigWithXmlImport;
import net.madvirus.spring4.chap02.search.SearchClientFactory;
import net.madvirus.spring4.chap02.search.SearchServiceHealthChecker;
import net.madvirus.spring4.chap02.shop.OrderInfo;
import net.madvirus.spring4.chap02.shop.OrderService;
import net.madvirus.spring4.chap02.shop.ProductInfo;
import net.madvirus.spring4.chap02.shop.ProductService;

public class MainForShop {
	public static void main(String[] args) {
		runByUsingXmlConfig();
	}
	private static void runByUsingXmlConfig(){
//		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:config-shop.xml");
		//초기화작업
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigShop.class);
		System.out.println("===========");
		useBean(ctx);
		ctx.close();
	}
	private static void useBean(ApplicationContext ctx){
		ProductService productService=ctx.getBean(ProductService.class);
		productService.createProduct(new ProductInfo());
		System.out.println("1");
		OrderService orderService=ctx.getBean(OrderService.class);
		orderService.order(new OrderInfo());
		System.out.println("2");
		SearchClientFactory orderSearchClientFactory =ctx.getBean("orderSearchClientFactory",SearchClientFactory.class);
		System.out.println("3");
		System.out.println(orderSearchClientFactory);
		SearchServiceHealthChecker healthChecker=ctx.getBean("searchServiceHealthChecker",SearchServiceHealthChecker.class);
		healthChecker.check();
	}
}
