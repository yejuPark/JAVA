package Interface;

public interface TV {
  public int MIN_VOLUME = 0;    // 상수
  public int MAX_VOLUME = 100;  // 상수

  public void turnOn();
  public void turnOff();
  public void changeVolume(int volume);
  public void changeChannel(int channel);
}


/* 인터페이스 메소드
 * default method
 * static method
 */
