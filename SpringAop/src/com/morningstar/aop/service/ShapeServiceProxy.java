package com.morningstar.aop.service;

import com.morningstar.aop.aspect.LoggingAspect;
import com.morningstar.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
