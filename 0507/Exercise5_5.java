package studyJava.ArrayEx;

public class Exercise5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			/* */
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다.
		/* */
		for (int i=0; i<ball3.length;i++) {
			System.out.println(ball3[i]);
		}
	}//main

}//class