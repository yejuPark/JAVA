public class PrimitiveDataTypeExam {

  public static void main(String[] args) {
    // 논리형 : 1byte
    boolean isFun = false;
    System.out.println(isFun);

    // 문자형 : 2byte, 한글자만 가능
    char c = 'f';

    // 정수형 : int, long
    // int : 4byte
    int x = 59;
    // long : 8byte, 맨 뒤에 소문자 또는 대문자 L
    long big = 345463524L;

    // 실수형 : float, double
    // float : 4byte, 맨 뒤에 소문자 또는 대문자 F 
    float f = 32.4f;
    // double : 8byte 
    double d = 3425443.2;

    /* 리터럴
     * CS 분양에서 리터럴이란, 소스 코드의 고정된 값을 대표하는 용어
     * true, false, 10, 11.1, a 등 일종의 값 자체를 리터럴이라고 함
     */

    System.out.println(c);
    System.out.println(x);
    System.out.println(big);
    System.out.println(f);
    System.out.println(d);


  }
}