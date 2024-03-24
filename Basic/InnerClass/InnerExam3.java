package InnerClass;

// 3. 지역 중첩 클래스 또는 지역 클래스
// : 메소드 안에 클래스 선언
public class InnerExam3 {
    public void exec(){
        class Cal {
            int value = 0;
            public void plus(){
            value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}

// 4. 익명 클래스