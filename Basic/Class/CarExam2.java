package Class;

public class CarExam2 {
  public static void main(String[] args) {
    // Car2 c1 = new Car2(); // 기본 생성자
    Car2 c2 = new Car2("소방차");
    Car2 c3 = new Car2("구급차");
    
    System.out.println(c2.name);
    System.out.println(c3.name);

  }
}

// 생성자 선언
/* Public class 클래스명 {
     타입 field명;
     public 클래스명 (매개변수목록){
        ...
     }

     public 리턴타입method명 (매개변수목록){
        ...
     }
   }
 * 
 */