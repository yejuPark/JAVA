package Extends;

public class BusExam {
  public static void main(String[] args) {
    Car c = new Bus();
    c.run();
    // c.ppangppang(); 부모 메소드만 사용 가능
    
    // 형변환 시 부모가 더 큰 그릇
    Bus bus = (Bus)c;
    bus.run();
    bus.ppangppang();

    // Bus bus = new Bus();
    // bus.run(); // 메소드 오버라이딩 때문에 자식클래스 메소드만 호출

    // bus.ppangppang();

    // Car car = new Car();
    // car.run();
    // car.ppangppang();
  }
}
