package Interface;

public class MyCalTest {
  public static void main(String[] args) {
    Calculator cal = new MyCal();
    cal.plus(3, 4);
    int i = cal.exec(5, 6);
    System.out.println(i);

    // static method 호출법
    Calculator.exec2(3, 4);
  }
}
