package com.tryicy;

import org.archive.crawler.framework.Engine;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Desc
 * @author: zhangjunwei
 * @Date: 2015年11月3日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-test.xml")
public class SpringCollectorTester extends AbstractJUnit4SpringContextTests{
	
	private static final Logger logger = LoggerFactory.getLogger(SpringCollectorTester.class); 
	
	@Autowired
	private ApplicationContext appContext;
	
	@Autowired
	private Engine crawlerEngine;
	
	@Test
	public void testApplicationContextIsNotNull(){
		Assert.assertNotNull(appContext);
		logger.info("appContext is not null : {}", appContext);
		Assert.assertNotNull(crawlerEngine);
		logger.info("crawlerEngine is not null : {}", crawlerEngine);
	}
	
}
