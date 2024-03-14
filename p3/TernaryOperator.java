package p3;

public class TernaryOperator {
  
  public static void main(String[] args) {
    
    // (조건) ? 참일때 : 거짓일때;
    int b1 = (5 > 4) ? 50 : 40;
    System.out.println(b1);

    int b2 = (5 < 4) ? 50 : 40;
    System.out.println(b2);

    // if 문과 유사
    int b3 = 0;
    if(5 < 4){
      b3 = 50;
    }else{
      b3 = 40;
    }
    System.out.println(b3);
  }
}
