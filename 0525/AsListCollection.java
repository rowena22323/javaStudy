package collectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class AsListCollection {
	public static void main(String[]args) {
		//배열을 대신하는 컬렉션 인스턴스의 생성 
		List<String> list = Arrays.asList("Toy","Box","Robot","Box");
		list = new ArrayList<>(list);
		
		//ArrayList<E>인스턴스의 순환 
		for(Iterator<String>itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		//ArrayList<E>인스턴스 기반으로 LinkedList<E>인스턴스 생성 
		list = new LinkedList<>(list);
		
		//LinkedList<E>인스턴스의 순환 
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		//for문 기반의 반복자 획득과 순차적 참
		for(Iterator<String>itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		//"Box"를 모두 삭제하기 위한 반복
		for(Iterator<String>itr = list.iterator(); itr.hasNext();)
			if(itr.next().equals("Box"))
				itr.remove();
		
		for(Iterator<String>itr = list.iterator();itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}
