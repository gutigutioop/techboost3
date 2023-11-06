package person;

public class Person {

	public enum Gender{Man,Woman}
	private Gender gender;  //フィールド
	
	public Person(Gender gender){ //コントラクタ
		this.gender = gender;
	}
	
	public void speak() {   //出力メソッド
		switch(gender) {
		case Man:
			System.out.println("I'm a man");
			break;
		case Woman:
			System.out.println("I'm a woman");
			break;
		default:
		}
		
	}
	
	public static void main(String[] args) { //実行用メソッド
		Person man = new Person(Gender.Man);
		man.speak();
		
		Person woman = new Person(Gender.Woman);
		woman.speak();
	}

}
