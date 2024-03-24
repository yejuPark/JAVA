package Class;

public class CarExam3 {
  public static void main(String[] args) {
    Car2 c1 = new Car2("소방차");
    Car2 c2 = new Car2(); // 기본 생성자
    Car2 c3 = new Car2("구급차", 1111);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

  }
}
