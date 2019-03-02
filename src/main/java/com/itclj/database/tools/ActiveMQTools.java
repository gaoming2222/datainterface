package com.itclj.database.tools;


import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import com.itclj.database.service.SubcenterService;

@Component
public class ActiveMQTools {
	
	private static Logger logger = Logger.getLogger(SubcenterService.class);
	
	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
	
	
    public void sendMsg(String key,String msg) {
        jmsMessagingTemplate.convertAndSend(key, msg);
        logger.info(key + ":" + msg + "存入消息队列" );
    }

    
    public void sendMap(String key,Map<String,Object> data) {
        jmsMessagingTemplate.convertAndSend(key, data);
        logger.info(key + ":" + data + "存入消息队列" );
    }
    
    @SuppressWarnings("rawtypes")
	public void sendList(String key,List list) {
    	jmsMessagingTemplate.convertAndSend(key, list);
    	logger.info(key + ":" + list + "存入消息队列" );
    }
	

}
