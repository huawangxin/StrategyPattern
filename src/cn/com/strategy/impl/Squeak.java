package cn.com.strategy.impl;

import cn.com.strategy.dao.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("吱吱叫");
	}

}
