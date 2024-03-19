package ClassObject;

public class VariableScopeExam {
  int globalScope = 10;
  static int staticVal = 7;
  
  public void scopeTest (int value){
    int localScope = 20;
    System.out.println(globalScope);
    System.out.println(localScope);
    System.out.println(value);
  }

  public void scopeTest2 (int value2){
    System.out.println(globalScope);
    // System.out.println(localScope);
    // System.out.println(value);
    System.out.println(value2);
  }
  

  public static void main(String[] args) {
    /* main은 static한 메소드
       - static한 메서드에서는 static 하지 않은 필드를 사용 할 수 없음
     * static : 클래스가 인스턴스화 되지 않아도 사용가능
       - 같은 클래스 내에 있음에도 해당 변수들을 사용할 수 없음
       - static한 필드(필드 앞에 static 키워드를 붙힘)나, 
         static한 메소드는 Class가 인스턴스화 되지 않아도 사용할 수 있음
     */

    // System.out.println(globalScope);
    // System.out.println(localScope);
    // System.out.println(value);
    System.out.println(staticVal);

    VariableScopeExam v1 = new VariableScopeExam();
    System.out.println(v1.globalScope);
    VariableScopeExam v2 = new VariableScopeExam();
    v1.globalScope = 10;
    v2.globalScope = 20;
    System.out.println(v1.globalScope);
    System.out.println(v2.globalScope);

    // v1.staticVal = 50;
    // v2.staticVal = 100;
    // System.out.println(v1.staticVal);
    // System.out.println(v2.staticVal);
    System.out.println(VariableScopeExam.staticVal);

  }
}
