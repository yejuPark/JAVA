package p4;
public class ArrayExam {
  // 1차원 배열
  public static void main(String[] args) {
    
    // 배열 생성하기
    int[] array1 = new int[100];
    // [갯수] : 불변
    
    // 배열에 값 저장하기
    array1[0] = 50;
    array1[10] = 100;
    // index는 0부터 시작

    // 선언과 동시에 초기화
    int[] array2 = new int[]{1,2,3,4};

    int[] array3 = {1,2,3,4};

    // 배열에서 값 꺼내기
    System.out.println(array3[3]);
    int value = array2[0];

    System.out.println(value);
  }
}