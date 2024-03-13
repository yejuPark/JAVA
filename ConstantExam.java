public class ConstantExam {
  public static void main(String[] args) {
    /* 상수의 선언
     * final 상수타입 상수명;
     */

    /* 상수 명명 관례
     * 대문자로만 구성된 명사로 정함
     * 여러 단어로 구성된 이름의 경우 단어 사이에 '_'을 써서 구분
     */

    /* 상수 사용하는 경우
     * 값 변하면 위험한 경우
     * 값만 봤을때 무엇을 의미하는지 쉽게 파악할 수 없을때 값 자체 보다 상수 이름을 사용해 의미 파악 용이
     */
    
    int i;
    i = 10;
    i = 5;
    
    final int J;
    J = 10;

    // J = 5;

    double circleArea;
    final double PI = 3.14159;
    circleArea = 3 * 3 * PI;

    final int OIL_PRICE = 1450;

    int totalPrice = 50 * OIL_PRICE;

    System.out.println(i);
    System.out.println(J);
    System.out.println(circleArea);
    System.out.println(totalPrice);


  }
}
