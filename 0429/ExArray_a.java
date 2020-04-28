package studyJava;
/* 배열과 메소드 
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 최소값을
 * 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하자
 * public static int minValue(int[]arr)
 * public static int maxValue(int[]arr)
 * 단 반복문을 사용할 때 minValue 정의에서는 일반적인for문을 사용하고
 * maxValue의 정의에서는 enhanced for문을 사용하기로 하자*/

class ExArray_a{
	static int [] srr = {30,60,90};
	
	public static int minValue(int[]srr) {
		int min = srr[0];
		for(int i=0; i<srr.length;i++)
			if(min>srr[i]) {
				min = srr[i];
				}
		return min;
	}
//	public static int maxValue(int[]srr) { //enhanced-for 
//		
//		for( int ii : srr) {
//			int max = srr[0];
//			if(max < srr[ii]) {
//				max = srr[ii];
//				ii++;
//			} 
//		return max;
//		}
//		
//	}
	
	public static void main(String[]args) {
		System.out.println(minValue(srr));
//		System.out.println(maxValue(srr));
	}

}