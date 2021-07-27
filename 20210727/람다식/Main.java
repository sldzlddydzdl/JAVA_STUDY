package 람다식;

public class Main {
	public static void main(String[] args) {
		
//		Add addL = (x, y) -> {return x+y;};
		Add addL = (x, y) -> x+y; // return 과 중괄호를 생략가능
		System.out.println(addL.add(2, 3));
		
	}

}
