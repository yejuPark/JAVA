package ClassObject;

public class MyClassExam {
  public static void main(String[] args) {
    // 객체 생성
    MyClass myclass = new MyClass();
    myclass.method1();
    myclass.method2(10);
    int value = myclass.method3();
    System.out.println("m3이 리턴한 값" + value);

    myclass.method4(5, 10);
    
    int value2 = myclass.method5(55);
    System.out.println("m5가 리턴한 값 : " + value2);

  }
}
