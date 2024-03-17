package ClassObject;

public class StringMethodExam {
  public static void main(String[] args) {
    // String str = new String("hello");
    String str = "hello"; 
    System.out.println(str.length()); // 공백도 포함
    System.out.println(str.concat(" world"));
    System.out.println(str); // 원본은 그대로 -> String은 불변 클래스
    str = str.concat(" world");
    System.out.println(str);

    System.out.println(str.substring(3));
    System.out.println(str.substring(3, 7));
  }
}
