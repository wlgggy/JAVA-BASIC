package chap_01;

public class _03_Variables {
    public static void main(String[] args){
        String name = "얍";
        // name = "얍";
        int hour = 15;
        System.out.println(name + "님 " + hour + "시 결과가 나온다고 ㅅㅂ!");
        System.out.println(name + "님");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        System.out.println(l);

        // int, long, float, double, char, String, ture, flase, boolean
    }
}
