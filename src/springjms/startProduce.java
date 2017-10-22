package springjms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import springjms.jms.ProduceService;


public class startProduce {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/resource/produce.xml");
		ProduceService service = applicationContext.getBean(ProduceService.class);
		for (int i = 0; i < 100; i++) {
			service.sendMessage("测试数据："+i);
		} 
		applicationContext.close();
		
	}

}
