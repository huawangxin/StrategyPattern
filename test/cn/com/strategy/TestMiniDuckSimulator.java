package cn.com.strategy;

import cn.com.strategy.entity.Duck;
import cn.com.strategy.entity.MallardDuck;
import cn.com.strategy.entity.ModelDuck;
import cn.com.strategy.impl.FlyRocketPowered;

/**
 * 对应测试类
 * @author huawangxin
 * 2017年5月11日 上午12:36:30
 */
public class TestMiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		//动态改变鸭子的飞行行为
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
