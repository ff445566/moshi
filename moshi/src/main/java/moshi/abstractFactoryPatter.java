package moshi;

import factorypa.createProductA;
import factorypa.product;
//   工厂和产品都抽象
public class abstractFactoryPatter  implements imFactoryPattern{

	public product createproduct() {
		// TODO Auto-generated method stub
		return new createProductA();
	}
	 

}
