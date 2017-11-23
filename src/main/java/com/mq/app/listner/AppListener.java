package com.mq.app.listner;


import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.mq.app.AppMain;
import com.mq.app.bean.MessageBean;

@Component
public class AppListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppListener.class);
	@JmsListener(destination = AppMain.APP_QUEUE)
    public void receiveMessage(@Payload MessageBean messageBean,
                               @Headers MessageHeaders headers,
                               Message message, Session session) {
		LOGGER.info("received <" + messageBean + ">");

		LOGGER.info("- - - - - - - - - - - - - - - - - - - - - - - -");
		LOGGER.info("######          Message Details           #####");
		LOGGER.info("- - - - - - - - - - - - - - - - - - - - - - - -");
		LOGGER.info("headers: " + headers);
		LOGGER.info("message: " + message);
		LOGGER.info("session: " + session);
		LOGGER.info("- - - - - - - - - - - - - - - - - - - - - - - -");
	}
}
