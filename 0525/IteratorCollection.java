package collectionFramework;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorCollection {
	public static void main(String[]args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robbot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator(); //반복자 획득1
		
		//저장된 인스턴스에 차례로 접근 
		while(itr.hasNext()) //next가 반환할 대상이 있다면 메소드 호출 (반환대상이 있는지 미리 확인) 
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		itr = list.iterator(); //반복자 획득2 
		
		String str;
		//반복자를 이용한 참조 과정 중 인스턴스의 삭제 
		while(itr.hasNext()) {
			str=itr.next();
			if(str.equals("Box"))
				itr.remove();
		}
		
		itr = list.iterator(); //반복자 획득3  
		
		while(itr.hasNext()) //삭제 후 결과 확인 
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}
