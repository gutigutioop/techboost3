package person2;

public class GenderSpeaker {

	public static void main(String[] args) {
			Man man = new Man();
			doSpeak(man);         //6～７行目＝dospeak(new man());
			doSpeak(new Woman());
		}

		private static void doSpeak(AbstractPerson person) {
			person.speak();
	}
	}

