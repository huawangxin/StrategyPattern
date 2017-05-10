package cn.com.strategy.impl;

import cn.com.strategy.dao.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("不会做，表尴尬");
	}

}
