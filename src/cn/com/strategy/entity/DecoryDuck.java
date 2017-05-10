package cn.com.strategy.entity;

import cn.com.strategy.impl.FlyNoWay;
import cn.com.strategy.impl.MuteQuack;

public class DecoryDuck extends Duck {

	public DecoryDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void dispaly() {
		System.out.println("诱导鸭");
	}

}
