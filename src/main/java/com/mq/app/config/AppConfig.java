package com.mq.app.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import com.mongodb.Mongo;
import com.mq.app.brocker.MessageBrocker;

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

@Configuration
public class AppConfig {
	
	private static final String MONGO_DB_URL = "localhost";
    private static final String MONGO_DB_NAME = "embeded_db";

	@Bean
    public JmsListenerContainerFactory<?> queueListenerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setMessageConverter(messageConverter());
        return factory;
    }

    @Bean
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
    
    @Bean
    public MessageBrocker getMessageBrocker () {
    	return new MessageBrocker();
    }
    
    /*
    public AppListener getAppListener () {
    	return new AppListener();
    }*/
    
    @Bean
    public MongoTemplate mongoTemplate () throws IOException {
    	EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
        mongo.setBindIp(MONGO_DB_URL);
        Mongo mongoDB = mongo.getObject();
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDB, MONGO_DB_NAME);
        return mongoTemplate;
    }
}
