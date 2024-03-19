package ClassObject;

public class ReferenceDataType {

  /* 자바의 변수 타입
기본형 타입 (Class 아님)
- 논리형 : boolean
- 문자형 : char
- 정수형 : byte, short, int, long
- 실수형 : float, double

참조형 타입
- 기본형 타입 제외한 모든 타입
- ex) 배열, 클래스 등등
*/

  public static void main(String[] args) {
    int i = 4;

    String str = new String("hello");
    // new : 클래스를 메모리에 올리기
    // String : 클래스 -(new)-> 인스턴스
    // str : 변수 - 인스턴스를 참조하는 참조형

  }
}
