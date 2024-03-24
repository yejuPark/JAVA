package Extends;

public class TruckExam {
  public static void main(String[] args) {
    Truck t = new Truck(); // Car, Truck 생성자 둘 다 실행됨.
    // 부모 먼저 생성됨

    // Car c = new Car(); // Car 생성자만 실행됨.

    System.out.println(t);
  }
}