package com.cg.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class Triangle {

	private Point pointA;
	 private Point pointB;
	 private Point pointC;
	 private ApplicationContext context = null;
	 
	 /**
	  * @param pointA the pointA to set
	  */
	 public void setPointA(Point pointA) {
	  this.pointA = pointA;
	 }

	 /**
	  * @param pointB the pointB to set
	  */
	 public void setPointB(Point pointB) {
	  this.pointB = pointB;
	 }

	 /**
	  * @param pointC the pointC to set
	  */
	 public void setPointC(Point pointC) {
	  this.pointC = pointC;
	 }

	 public void draw()
	 {
	System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
	System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
	System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
	 }

	 //@Override
	 public void setApplicationContext(ApplicationContext context) throws BeansException
	 {
	  this.context = context;
	 }

	 //@Override
	 public void setBeanName(String beanName)
	 {
	  System.out.println("Bean name is: "+beanName);
	 }
	}

