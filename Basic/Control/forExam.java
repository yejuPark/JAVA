package Control;

public class forExam {
  
  // for 구문 자체에 변수 초기화(한번만 수행), 조건식, 증감식이 한줄로 표현됨
  /*for(초기화식; 조건식; 증감식){
    실행문;
    } */

  public static void main(String[] args) {
    int total = 0;
    for(int i = 1; i <= 100; i++){
      // if(i%2 != 0){ // 짝수만 더하기
      //   continue;
      // }
      total = total + i;
      if(i == 50){ // 50까지만 누적
        break;
      }
    }
    System.out.println(total);
  }
}
