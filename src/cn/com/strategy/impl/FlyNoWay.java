package cn.com.strategy.impl;

import cn.com.strategy.dao.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("不会飞，表尴尬");
	}

}
