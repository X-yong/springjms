package springjms.jmsImpl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * 消息监听者
 * @author soonsmile
 *
 */
public class ConsumerMessageListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out.println("接收到的的消息:"+textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
