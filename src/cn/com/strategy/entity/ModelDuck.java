package cn.com.strategy.entity;

import cn.com.strategy.impl.FlyNoWay;
import cn.com.strategy.impl.Quack;

/**
 * 模型鸭
 * @author huawangxin
 * 2017年5月11日 上午12:30:34
 */
public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void dispaly() {
		System.out.println(" model duck");
	}

}
