package cn.com.strategy.entity;

import cn.com.strategy.dao.FlyBehavior;
import cn.com.strategy.dao.QuackBehavior;

/**
 * 鸭子超类
 * @huawangxin
 * 2017年5月10日 下午11:22:59
 */
public abstract class Duck {
	//申明行为变量为行为“接口”类型
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("游泳了");
	};
	
	public abstract void dispaly();
	
	public void performFly() {
		flyBehavior.fly();
	}
}
