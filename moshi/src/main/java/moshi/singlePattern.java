package moshi;

public class singlePattern {
	//  ����ʽ
  private singlePattern(){}
  private static singlePattern si=null;
  // ˫����
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
  // ��̬�ڲ���
  private static class getSTA{
	  static singlePattern  INSTANCE=new singlePattern();
  }
  public static final singlePattern getInstance2(){
	return getSTA.INSTANCE;
	  
  }
  /*
   * ����ʽ
   * 
   */
  private static  final singlePattern si2= new singlePattern();
  public static final singlePattern getInstance3(){
	return si2;
	  
  }
}
