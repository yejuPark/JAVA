package Operator;
public class OperatorExam3 {
  /*연산자 우선순위
   * 최우선 연산자 : . [] ()
   * 단항 연산자 : ++ -- ! ~ +/-  (부정,bit변환 > 부호 > 증감)
   * 산술 연산자 : '* / %' > '+ -' > 'shift/시프트 연산자 (>> << >>>)'
   * 비교 연산자 : > < >= <= == !=
   * 비트 연산자 : & | ` ~
   * 논리 연산자 : && || !
   * 삼항 연산자 : 조건식 ? 
   * 대입 연산자 : = *= /= %= += -=
   */
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;
    
    System.out.println(a-b*c);
    System.out.println((a-b)*c);

    System.out.println(a>5 && b>5); // false && true = false
    System.out.println(a>5 || b>5); // false || true = true

    System.out.println(++a - 5); // a+1-5 = 1
    System.out.println(a); // a = 6

    System.out.println(a++ - 5); 
    System.out.println(a);
    // 후위 연산자인 ++이 후순위이므로 6-5 = 1이 위의 값으로 출력되고, 
    // a = a+1 이므로 7이 아래 값으로 출력됨
  }
}
