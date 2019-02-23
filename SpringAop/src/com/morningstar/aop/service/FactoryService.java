package com.morningstar.aop.service;

import com.morningstar.aop.model.Circle;
import com.morningstar.aop.model.Triangle;

public class FactoryService {
	public Object getBean(String beanType) {
		if (beanType.equals("shapeService")) {
			return new ShapeServiceProxy();
		} if (beanType.equals("circle")) {
			return new Circle();
		} if (beanType.equals("triangle")) {
			return new Triangle();
		}
		return null;
	}
}
