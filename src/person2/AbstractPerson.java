package person2;

public abstract class AbstractPerson {
	
	abstract protected String getGender();
	
	public void speak() {
		System.out.println("I'm a " + getGender() );
	}
	
}
