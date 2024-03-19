package Array;

public class ArraywithFor {
  
  public static void main(String[] args) {
    int [] iarray = new int[100];
    iarray[0] = 1;
    iarray[1] = 2;
    System.out.println(iarray.length);

    for(int i = 0; i < iarray.length; i++) { // 여기서 i는 index
      iarray[i] = i+1;
    } // for 문 끝나면 i 변수 사라짐 : 변수의 scope은 변수가 선언된 block


    // 합 구하기
    int sum = 0;
    for(int i = 0; i<iarray.length; i++) {
      sum = sum + iarray[i];
    }

    System.out.println(sum);
  }
}
