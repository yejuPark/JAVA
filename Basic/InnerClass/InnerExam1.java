package InnerClass;

// 1. 중첩클래스 혹은 인스턴스 클래스 
// : 클래스 안에 인스턴스 변수, 즉 필드를 선언하는 위치에 선언되는 경우
public class InnerExam1 {
    class Cal {
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
