package start;

import Javastudy.*; // 단축키 : ctr+shift+알파벳 오

public class HelloExam {
  public static void main(String[] args) {
    // 다른 패키지에 있는 클래스 사용시 import 필수
    Hello hello = new Hello();
    // Javastudy.Hello hello = new Javastudy.Hello();
    
    System.out.println(hello);

  }
}
