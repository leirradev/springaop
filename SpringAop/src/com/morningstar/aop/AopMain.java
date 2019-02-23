package com.morningstar.aop;

import com.morningstar.aop.service.FactoryService;
import com.morningstar.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//			ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
//			shapeService.getCircle();
		
			FactoryService factoryService = new FactoryService();
			ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
			shapeService.getCircle();
			
//			shapeService.getCircle().setName("Dummy name");
//			shapeService.getCircle().setNameandReturn("Dummy name");
//			System.out.println(shapeService.getCircle().getName());
	}
}
