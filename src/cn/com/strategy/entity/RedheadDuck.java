package cn.com.strategy.entity;

import cn.com.strategy.impl.FlyWithWings;
import cn.com.strategy.impl.Quack;

/**
 * 红头鸭
 * @author huawangxin
 * 2017年5月10日 下午11:33:58
 */
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void dispaly() {
		System.out.println("红色外观");
	}

}
