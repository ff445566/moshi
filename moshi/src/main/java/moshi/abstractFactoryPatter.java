package moshi;

import factorypa.createProductA;
import factorypa.product;
//   �����Ͳ�Ʒ������
public class abstractFactoryPatter  implements imFactoryPattern{

	public product createproduct() {
		// TODO Auto-generated method stub
		return new createProductA();
	}
	 

}
