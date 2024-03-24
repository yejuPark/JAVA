package Extends;

  // 캡슐화 : 관련된 내용을 모아서 가지고 있는 것

public class AccessObj {
  public int p = 4;     // 전체 공개
  protected int p2 = 3; // 같은 패키지 or 상속받은 다른 패키지
  int k = 2; // default 접근 지정자 : 자기 자신과 같은 패키지 내에서만 접근 가능
  private int i = 1; // 자기 자신만 접근 가능
  
}
