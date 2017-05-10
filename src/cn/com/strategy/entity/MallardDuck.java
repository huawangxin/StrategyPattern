package cn.com.strategy.entity;

import cn.com.strategy.impl.FlyWithWings;
import cn.com.strategy.impl.Quack;

/**
 * 绿头鸭
 * @author huawangxin
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void dispaly() {
		System.out.println("绿色外观");
	}

}
