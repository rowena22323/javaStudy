package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/***
 * Collection<E>를 구현하는 클래스의 인스턴스는 iterator메소드의 호출을 통해서 반복자를 
 * 얻을 수 있다. List<E>를 구현하는 클래스들의 인스턴스들만 얻을 수 있는 양방향반복자는 
 * List<E>의 다음 메소드 호출을 통해서 얻을 수 있다. 
 * 
 * public ListIterator<E> listIterator()
 * 
 * 양방향 반복자 - 양쪽 방향으로 이동이 가능(배열, 연결리스트와 같은 자료구조)
 * 
 * <Ex> 양방향 반복자 사용의 예 : 왼쪽>오른쪽, 오른쪽>왼쪽 이동 + add메소드를 호출하여 
 * 인스턴스를 추가로 저장 
 * @author kate
 */

public class ListIteratorCollection {
	public static void main(String[]args) {
		List<String> list = Arrays.asList("Toy","Box","Robot","Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		
		String str;
		while(litr.hasNext()) {
			str=litr.next();
			System.out.print(str+'\t');
			if(str.equals("Toy"))
				litr.add("Toy2");
		}
		System.out.println();
		
		while(litr.hasPrevious()) {
			str=litr.previous();
			System.out.print(str+'\t');
			if(str.equals("Robot"))
				litr.add("Robot2");
		}
		System.out.println();
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}
