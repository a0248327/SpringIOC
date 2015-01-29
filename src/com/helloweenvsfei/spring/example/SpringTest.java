package com.helloweenvsfei.spring.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("applicationContext.xml"); // 获取配置资源
		
		XmlBeanFactory factory = new XmlBeanFactory(res); // 获取对象工厂，Spring Bean 工程，加载配置文件

		IService hello = (IService) factory.getBean("service"); // 从配置文件中获取对象
		
		hello.service("Han Dian !"); // 执行service方法

		factory.destroySingletons(); // 销毁生成的Bean
	}

}
