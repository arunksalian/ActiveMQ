package com.mq.app.brocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.mq.app.AppMain;
import com.mq.app.bean.MessageBean;

public class MessageBrocker {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageBrocker.class);

	@Autowired
    private JmsTemplate jmsTemplate;
	public void send (MessageBean message) {
		LOGGER.info("sending with convertAndSend() to queue <" + message + ">");
		jmsTemplate.convertAndSend(AppMain.APP_QUEUE, message);		
	}
}
