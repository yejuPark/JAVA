package Extends;

public class Truck extends Car2 {
  public Truck(){
    super("소방차"); // super : 부모 객체 , this : 자기자신
    System.out.println("Truck의 기본 생성자 입니다.");
  }  
}
