package ClassObject;

public class EnumExam {
  public static final String MALE="MALE";
  public static final String FEMALE="FEMALE";
  public static void main(String[] args) {
    String gender1;
    gender1 = EnumExam.MALE;
    gender1 = EnumExam.FEMALE;

    gender1 = "boy"; // 컴파일 에러 발생하지 않음

    // 열거형
    Gender gender2;
    gender2 = Gender.MALE;
    gender2 = Gender.FEMALE;

    // gender2 = "boy"; // 컴파일 에러 발생
  }
}

enum Gender{
  MALE, FEMALE;
}