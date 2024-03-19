package Control;
import java.util.Scanner;

public class doWhileExam {
  public static void main(String[] args) {
    int value = 0;

    // Scanner : 키보드로부터 값을 입력받을 수 있는 Scanner 객체 생성
    Scanner scan = new Scanner(System.in);

    do{
      //반복할 문장들
      value = scan.nextInt();
      System.out.println("입력받은 값 :"+value);

    }while(value != 10); // 10이 아닐 경우 계속 반복

    System.out.println("반복문 종료");
  }
}
