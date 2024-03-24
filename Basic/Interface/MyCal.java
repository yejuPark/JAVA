package Interface;

public class MyCal implements Calculator{
  public int plus(int i, int j){
    return i + j;
  }
  public int multiple(int i, int j){
    return i * j;
  };

  public int exec(int i, int j){
    return i + j;
  }
  
  // default int exec(int i, int j){
  //   return i + j;
  // }
  
}
