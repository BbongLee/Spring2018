package com.exam.test5;

public class BeanFactory { //��ü����!!!!!
	public Object getBean(String beanName){
		if(beanName.equals("samsung")){
			return new SamsungTV();
		}else if(beanName.equals("lg")){
			return new LgTV();
		}
		return null;
	}
}
