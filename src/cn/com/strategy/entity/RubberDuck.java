package cn.com.strategy.entity;

import cn.com.strategy.impl.FlyWithWings;
import cn.com.strategy.impl.Quack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void dispaly() {
		System.out.println("橡皮鸭");
	}

}
