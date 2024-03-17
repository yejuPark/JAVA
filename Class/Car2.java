package Class;

public class Car2 {
  String name;
  int number;

  public Car2(String name){
    this.name = name;
    // this : 현재 객체, 자기 자신
  }

  public Car2(){
    // 기본 생성자 : 매개변수를 받지 않음
    // this.name = "이름없음";
    // this.number = 0;
    this("이름없음",0);
  }

  public Car2(String name, int number){
    this.name = name;
    this.number = number;
  }

}
