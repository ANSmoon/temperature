package class05;

public class Person {
    String name;
    int age;
    String hobby;

    void study(int time) {
    	System.out.println(time + "시간 공부(int)");
    }
    
    void study(long time) {
    	System.out.println(time + "시간 공부(long)");
    }
    
    void study(String subject, int time) {
    	System.out.println(subject + "를 " + time + "시간 공부(1)");
    }
    
    void study(int time, String subject) {
    	System.out.println(subject + "를 " + time + "시간 공부(2)");
    }
    
//    void study(String subject2, int time2) {
//    	System.out.println(subject2 + "를 " + time2 + "시간 공부(1)");
//    }
    
    
}
