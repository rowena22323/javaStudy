package collectionFramework;

import java.util.List;
import java.util.ArrayList;

public class ArrayListColloection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>(); 코드에 유연
		
		list.add("Toy"); //인스턴스 저장 
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i <list.size();i++)
			System.out.print(list.get(i)+'\t');
		//인스턴스 참조방식 
		System.out.println();
		
		list.remove(0);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();
	}
}
/* 컬렉션 프레임워크의 핵심(인스턴스의 저장, 참조, 삭제) 
   ArrayLixt<E> 내부적으로 배열을 생성해서 인스턴스를 저장하고 필요에따라 배열의 길이를 스스로 늘린다
   public ArrayList(int initialCapacity) > 인자로 전달된 수의 인스턴스를 저장할 수 있는 공간을 미리 확보
   public ArrayList() > 10개의 인스턴스를 저장할 수 있는 공간을 미리 확보 
*/