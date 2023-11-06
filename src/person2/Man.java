package person2;

public class Man extends AbstractPerson{
	
	
	protected String  getGender() {  //サブクラスは抽象メソッドを記入（オーバーライト）しないとエラーになる。アクセス修飾子は、protected使う。
		return "Man";
	}

	

}
