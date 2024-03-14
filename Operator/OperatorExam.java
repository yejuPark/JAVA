package Operator;
public class OperatorExam {
  public static void main(String[] args) {
    /* 연산자
     * 부호 연산자 (+ -)
     * 산술 연산자 (+ - * / %)
     * 증감 연산자 (++ --)
     */

     /* = : 대입연산자
      * + : 산술연산자
      * x, y, z : 피연산자
      * 단항 연산자 : 부호, 증감
      * 이항 연산자
      */
    
    int i1 = -5;
    // - : 부호 연산자, 5 : 피연산자

    int i2 = +i1;
    int i3 = -i1;
    // + : 부호 그대로 유지, - : 부호 반대로

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);

    int i4 = ++i3; // i3 = i3+1;
    System.out.println(i4); // i4 = 6
    System.out.println(i3); // i3 = 6

    int i5 = i3++; // i3 = i3 + 1;
    System.out.println(i5); // i5 = 6
    System.out.println(i3); // i3 = 7
  

    int i = 5;
    int j = 2;
    
    System.out.println(i+j);
    System.out.println(i-j);
    System.out.println(i*j);
    System.out.println(i/j); 
    // 정수끼리의 연산값은 정수. 실수를 얻고싶다면 피연산자 둘 중 하나는 실수여야함.
    System.out.println(i/(double)j);
    System.out.println(i%j); // 나머지

  }

}