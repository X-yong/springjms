package springjms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import springjms.jms.ProduceService;


public class startConsumeer {

	public static void main(String[] args) {
	   
		//初始化bean
		new ClassPathXmlApplicationContext("/resource/comsumer.xml");
	}

}
