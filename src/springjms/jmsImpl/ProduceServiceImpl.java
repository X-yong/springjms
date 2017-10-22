package springjms.jmsImpl;

import java.awt.font.TextMeasurer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import springjms.jms.ProduceService;

public class ProduceServiceImpl implements ProduceService {
    
	@Autowired
	private JmsTemplate jmsTemplate;
	@Resource(name="queueDestination")
	Destination destination;
	@Override
	public void sendMessage(String message) {
		//使用jmsTemplate发送消息
		jmsTemplate.send(destination,new MessageCreator() {
			//创建一个消息
			public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
			
				return textMessage;
			}
		});
		System.out.println("/*********************发送消息*******************************/");
		System.out.println("消息："+message);
		System.out.println("/**********************************************************/");
	}

	

}
