package moshi;

public class singlePattern {
	//  懒汉式
  private singlePattern(){}
  private static singlePattern si=null;
  // 双重锁
  public static final singlePattern getInstance(){
	  if(si==null){
		  synchronized (singlePattern.class) {
			if(si==null){
				si=new singlePattern();
			}
		}
	  }
	return si;
	
  }
  // 静态内部类
  private static class getSTA{
	  static singlePattern  INSTANCE=new singlePattern();
  }
  public static final singlePattern getInstance2(){
	return getSTA.INSTANCE;
	  
  }
  /*
   * 饿汉式
   * 
   */
  private static  final singlePattern si2= new singlePattern();
  public static final singlePattern getInstance3(){
	return si2;
	  
  }
}
