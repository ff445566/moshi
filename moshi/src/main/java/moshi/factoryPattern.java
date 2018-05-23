package moshi;

import factorypa.createProductA;
import factorypa.createProductB;
import factorypa.createProductC;
import factorypa.product;

public class factoryPattern {
 //  多方法工厂
	public static product getProductA(){
		return new createProductA();
	}
	public static product getProductB(){
		return new createProductB();
	}
	public static product getProductC(){
		return new createProductC();
	}
}
