
public class Main {

	public static void main(String[] args) {

		dice Dice = new dice(3,4);
		TripleDice Dice2 = new TripleDice(4,5);
		System.out.println(Dice.Throw());	
		System.out.println(Dice2.Throw());
	}
}