package kcci.java;

/***
 * 	다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
 *  1행 1  2  3  
 *  2행 4  5  6  
 *  3행 7  8  9
 *  이러한 형태를 갖는 int형2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를
 *  변경시키는 메소드를 정의하자 
 *  3 -> 1  7  8  9   
 *  1 -> 2  1  2  3  
 *  2 -> 3  4  5  6  
 *  배열의 가로와 세로길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다. 
 */ 

public class pp{
	public static void main(String[]args){
		int [][]ar={
			{1,2,3},(4,5,6},{7,8,9}};
				 
	int[] tmp;
	for(int=0;i<ar.length-1;i--);
	tmp=ar[2];
	ar[2] = ar[1];
	ar[1] = ar[0];
	ar[0] = tmp;
				 
	for(int i=0; i<ar.length;i++){
		for(int j=0;j<ar[i].length;j++){
			System.out.println();
		}
	}
	
