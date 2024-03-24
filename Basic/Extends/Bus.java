package Extends;
// extends = is a
public class Bus extends Car {
  public void ppangppang(){
    System.out.println("빵빵");
  }
  
  public void run(){
    super.run(); // 부모 메소드 호출
    System.out.println("Bus의 run 메소드");
  }
}
