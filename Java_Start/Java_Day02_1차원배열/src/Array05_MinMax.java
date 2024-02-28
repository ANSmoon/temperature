

public class Array05_MinMax {
	public static void main(String[] args) {
		int [] test = {100,20,31,45,50,6,700,89,999,1000};
		
		int min = 10000;
		int max = 0;
		
		// 파이썬과 비슷한 문법
		for(int i : test) {
			if(min > i)
				min = i;
			if(max < i)
				max = i;
		}
		
		System.out.println(min + " , " + max);
		
		// 제공되는 class 사용
		
		int min1 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		
		for(int i : test) {
			min1 = Math.min(min1, i);
			max1 = Math.max(max1, i);
		}
		
		System.out.printf("min = %d, max = %d\n",min1, max1);
		
	}
}
