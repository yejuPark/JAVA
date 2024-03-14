package p3;

public class WhileExam {
  
  // 반복문 : while, do while, for
  public static void main(String[] args) {
    int i = 0;

    while (i<10) {
      System.out.println(i);
      i++; // i = i+1  
    }

    int total = 0;
    int i2 = 1;
    while (i2<=100) {
      total = total + i2;
      i2++;
    }
    System.out.println(total);

    // while (true) {
    //   System.out.println("hello");
    // }

    // 예제
    int e = 1;
    while (e < 11) {
      // i가 짝수일때만 출력
      if(e%2 == 0){
        System.out.println(e);
      }
      e++;
    }
  }
}
