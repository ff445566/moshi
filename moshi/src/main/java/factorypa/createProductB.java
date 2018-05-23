package factorypa;

public class createProductB implements product{
  private String a;
  public void methodB(){
	  System.out.println("产品B的B方法");
  }
public void methodFromFather() {
	// TODO Auto-generated method stub
	System.out.println("产品B的继承方法");
}
}
