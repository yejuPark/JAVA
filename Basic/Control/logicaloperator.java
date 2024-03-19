package Control;

public class logicaloperator {
  public static void main(String[] args) {
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;

    // 논리 곱
    System.out.println(b1 && b2); //false
    System.out.println(b1 && b3); //true

    // 논리 합
    System.out.println(b1 || b2); //true
    System.out.println(b1 || b3); //true
    // System.out.println(b2 || b2); //false

    int score = 88;
    if(score <= 100 && score >= 70){
      System.out.println("성공");
    }else{
      System.out.println("실패");
    }

    // 배타적 논리합 : 다르면 true
    System.out.println(b1 ^ b3); //false
    System.out.println(b1 ^ b2); //true

    // 논리 부정
    System.out.println(!b1); //false

  }
}
