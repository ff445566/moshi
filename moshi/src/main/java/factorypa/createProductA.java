package factorypa;

public class createProductA  implements product{
  private String a;
  public void methodA(){
	  System.out.println("产品A的A方法");
  }
public void methodFromFather() {
	// TODO Auto-generated method stub
	System.out.println("产品A的继承方法");
}
}
