package Operator;
public class VariableExam {
  public static void main(String[] args) {
    /* 변수의 선언
     * 타입 변수 이름;
     * int count; (정수)
     * double avg; (실수)
     * String name; (문자)
     */

    /* 식별자 명명 규칙
     * 식별자 : 클래스, 메소드, 변수 등  다양한 대상에 대해 붙이는 이름
     * 첫번째 글자 : 문자 또는 '$' 또는 '_'
     * 두번째 이후의 글자는 숫자, 문자, '$', '_'
     * '$', '_' 이외 특수문자 사용 불가능
     * 키워드는 식별자로 사용 불가능
     * 상수 값을 표현하는 단어 true, false, null은 식별자로 사용 불가능
     */

    /* 변수 명명 관례
     * 소문자로 시작하는 명사
     * 두 단어 이상으로 이루어진 경우 두번째 단어 첫글자가 대문자
     * '_' 을 사용하지 않음
     */

    int count;

    count = 10;

    count = 20;
// 가장 마지막, 최근에 선언된 값을 담음. 

    System.out.println(count);

    // count = 11.1;

    double avg = 11.1;

    String name = "carami";

    int totalCount = 500;

    System.out.println(avg);
    System.out.println(name);
    System.out.println(totalCount);

  }
}
