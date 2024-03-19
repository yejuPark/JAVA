package ClassObject;

public class CarExam {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();
    // new 연산자 : new연산자 뒤에 나오는 생성자를 이용해 메모리에 객체 생성
    // 메모리에 만들어진 객체 : 인스턴스(instance)
    // c1, c2 : (참조)변수
    // Car() : 객체
    // 위 코드는 Car() 라는 객체가 생성되고, 각각의 객체를 참조하는 c1, c2 변수가 선언됨.
    
    c1.name = "소방차";
    c1.number = 1234;

    c2.name = "구급차";
    c2.number = 1111;

    System.out.println(c1.name);
    System.out.println(c1.number);

    System.out.println(c2.name);
    System.out.println(c2.number);
  }
}
