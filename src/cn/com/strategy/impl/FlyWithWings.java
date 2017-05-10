package cn.com.strategy.impl;

import cn.com.strategy.dao.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("鸭子飞行");
	}

}
