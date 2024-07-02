import java.util.Random;

public class FunctionTest3 {
    public static void main(String[] args) {

        System.out.println("아침에 일어난다.");
        이동("교육장","대중교통");
        boolean homework = 교육();
        이동("집","대중교통");
        
        if(homework)
        	System.out.println("과제를 해결한다.");
        else
        	System.out.println("잔다.");
        
        System.out.println("아침에 일어난다.");
        System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
        // 함수의 호출
        // 함수명(매개변수..)
        
        이동("교육장","대중교통");
        homework = 교육();
        이동("집","대중교통");
        
        if(homework)
        	System.out.println("과제를 해결한다.");
        else
        	System.out.println("잔다.");    
    }
    
    static void 이동(String 장소, String 탈것) {
        System.out.println(장소 + "(으)로 " + 탈것 +  "(을)를 이용하여 이동한다.");
    }
    
    static boolean 교육() {
        System.out.println("오전 수업을 듣는다.");
        System.out.println("점심을 먹는다.");
        System.out.println("오후 수업을 듣는다.");
        
        // 예를 들어 과제를 다 못했다면 => 숙제가 있고(true)
        // 오후 시간에 과제를 다했다면 => 숙제가 없다..(false)
        Random random = new Random();
        return random.nextBoolean();
    }
}
