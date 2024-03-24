package Extends;

public class DuckExam {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.sing();
    duck.fly();

    // Bird b = new Bird();
    // 추상 클래스는 객체로 사용할 수 없음.
  }
}
