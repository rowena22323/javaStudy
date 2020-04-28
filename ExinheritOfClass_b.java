package studyJava;
/***
 * 예제 Wrapping.java를 instanceof연산자를 사용하지 않는 형태로 변경해 보자. 
 * 이를 위해서는 클래스의 상속관계를 그대로 유지하면서 메소드 오버라이딩 기반으로 
 * 예제가 동작하도록 코드를 수정해야 한다. 즉 필요하다면 메소드의 이름을 수정해야 한다.
 * @author kate
 */
class Box{
	public void boxWrap() { //메소드 수정 boxWrap()
		System.out.println("Simple Wrapping");
	}
}
class PaperBox extends Box{
	public void boxWrap() {//override
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends PaperBox{
	public void boxWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class ExinheritOfClass_b {

	public static void main(String[] args) {
		Box box1 = new GoldPaperBox();
		box1.boxWrap();
		//if(box instanceof GoldPaperBox){(GPB)box.goldwrap();}
		Box box2 = new PaperBox();
		box2.boxWrap();
		//if(box instanceof PaperBox){(PB)box.paperwrap();}
		Box box3 = new Box();
		box3.boxWrap();
		
	}
}

