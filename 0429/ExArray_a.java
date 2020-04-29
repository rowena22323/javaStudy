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
	public static int maxValue(int[]srr) { //enhanced-for!!!!
		int max = srr[0];
		for(int ii=0; ii<srr.length;ii++)
			if(max<srr[ii]) {
				max = srr[ii];
			}
		return max;
	}
	
	public static void main(String[]args) {
		System.out.println(minValue(srr));
		System.out.println(maxValue(srr));
	}

}


http://www.pythontutor.com/java.html#code=public%20class%20ExArray_a%7B%0A%20%20%20%20static%20int%20%5B%5D%20srr%20%3D%20%7B30,60,90%7D%3B%0A%20%20%20%20%0A%20%20%20%20public%20static%20int%20maxValue%28int%5B%5Dsrr%29%20%7B%0A%20%20%20%20%20%20%20%20int%20max%20%3D%20srr%5B0%5D%3B%0A%20%20%20%20%20%20%20%20for%28int%20i%20%3A%20srr%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%28max%3Ci%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20max%20%3D%20i%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20max%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%20%20%20%20public%20static%20void%20main%28String%5B%5Dargs%29%20%7B%0A%20%20%20%20%20%20%20%20System.out.println%28maxValue%28srr%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&curInstr=19&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
