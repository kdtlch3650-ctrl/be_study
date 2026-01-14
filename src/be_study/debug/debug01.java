package be_study.debug;

public class debug01 {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        
        if (a == b) {
            System.out.println("같다!");
        } else {
            System.out.println("다르다!");
        }
    }
}
