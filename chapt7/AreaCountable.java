/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.2 AreaCountable接口，接口一般说明具有某种能力（或者具有某种方法）
 *  
 *  */

package cn.sdu.edu.sc.java.chapt7;

public interface AreaCountable {
	// private int edge;//接口不能有属性
	public double getArea();
}

/*
 * 以上定义与如下定义等同：
 *  public abstract class AreaCountable { 
 *  	public abstract double getArea(); 
 *  }
 */
