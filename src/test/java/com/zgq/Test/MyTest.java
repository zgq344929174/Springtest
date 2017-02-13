package com.zgq.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleLoad(){
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-bean.xml");
		MyTestBean myTestBean = (MyTestBean)ac.getBean("myTestBean");
		//MyTestBean myTestBean = (MyTestBean)bf.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
		assertEquals("testStr",myTestBean.getTestStr());
	}
}
