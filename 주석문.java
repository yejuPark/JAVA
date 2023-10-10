import java.io.*;

/**
 * <h1> Add Two Numbers! </h1>
 * AddNum 프로그램은 주어진 두 정수를 단순히 더하고
 * 그 결과를 화면에 print 하는 기능을 구현한다.
 * <p>
 * <b>Note:</b> 
 * 프로그램에 적절한 주석을 제공하면 사용자가 사용하기 쉽고
 * 고품질 코드로 간주된다.
 */


 public class AddNum {
  /**
   * 이 method는 두 개의 정수를 더하는데 사용된다.
   * 다양한 javadoc Tags의 사용법을 보여주기 위한
   * 가장 간단한 형태의 Class method 이다.
   * @param numA 첫번째 parameter
   * @param numB 두번쨰 parameter
   * @return int numA와 numB의 합
   */
  public int AddNum(int numA, int numB) {
    return numA + numB;
  }

  /**
   * addNum method를 활용하는 main method
   * @param args Unused
   * @return Nothing
   * @exception IOExcept On input error
   * @see IOExcept
   */
  public static void main(String args[]) throws IOException
  {

    AddNum obj = new AddNum();
    int sum = obj.addNum(10, 20);

    System.out.println("Sum of 10 and 20 is :" + sum);
  }
 }