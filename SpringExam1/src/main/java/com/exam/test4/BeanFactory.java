package com.exam.test4;

public class BeanFactory { //°´Ã¼°øÀå!!!!!
	public Object getBean(String beanName){
		if(beanName.equals("samsung")){
			return new SamsungTV();
		}else if(beanName.equals("lg")){
			return new LgTV();
		}
		return null;
	}
}
