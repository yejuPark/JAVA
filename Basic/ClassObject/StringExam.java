package ClassObject;

public class StringExam {
  // 가장 많이 사용하는 클래스 : String
  public static void main(String[] args) {
    // new 연산자 이용하지 않고 인스턴스 생성 가능
    String str1 = "hello";     // 상수 영역에 저장
    String str2 = "hello";     // str1과 str2는 같은 인스턴스를 참조함

    String str3 = new String("hello");   // 무조건 새롭게 생성
    String str4 = new String("hello");

    if(str1 == str2) // yes
      System.out.println("str1과 str2는 같은 레퍼런스입니다.");
    
    if(str1 == str3) // no
      System.out.println("str1과 str3는 같은 레퍼런스입니다.");
    
    if(str3 == str4) // no
      System.out.println("str3과 str4는 같은 레퍼런스입니다.");

    // 한번 생성되면 값 변하지 않음 (String 만)
    System.out.println(str1.substring(3)); // lo
    System.out.println(str1); // hello

    if(str1.equals(str3)){
      System.out.println("str1과 str3는 같은 값을 가지고 있습니다.");
    }else{
      System.out.println("str1과 str3는 다른 값을 가지고 있습니다.");
    }
      
  }
}
