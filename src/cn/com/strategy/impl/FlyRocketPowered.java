package cn.com.strategy.impl;

import cn.com.strategy.dao.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println(" fly with RocketPowered ");
	}
	
}
