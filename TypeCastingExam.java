public class TypeCastingExam {
  public static void main(String[] args) {
    int x = 50000;
    long y = x ;
  /* 묵시적 형변환
   * 작은 > 큰 타입
   * 암묵적 형변환
   */

    long x2 = 5;
    int y2 = (int) x2;
  /* 명시적 형변환
   * 큰 > 작은 타입
   * 반드시 (타입) 으로 명시해야함
   * 강제 형변환
   */

    System.out.println(y);
    System.out.println(y2);
    
  }
}
