package Interface;

public class LedTV implements TV {
  public void turnOn(){
    System.out.println("켜다");
  }

  public void turnOff(){
    System.out.println("끄다");
  }

  public void changeVolume(int volume){
    System.out.println(volume + "로 볼륨 조정하다");
  }

  public void changeChannel(int channel){
    System.out.println(channel + "로 채널 조정하다");
  }
}
