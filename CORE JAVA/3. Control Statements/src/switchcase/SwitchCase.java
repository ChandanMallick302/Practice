package switchcase;

public class SwitchCase {

	public static void main(String[] args) {
		int instrument = 4;
		String musicinstrument=null;

		switch (instrument) {
		case 1:
			musicinstrument= "Piano";
			break;
		case 2:
			musicinstrument="Guitar";
			break;
		case 3:
			musicinstrument="tabla";
			break;
		case 4:
			musicinstrument="Violin";
			break;
		case 5:
			musicinstrument="Flute";
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		System.out.println(musicinstrument); //Violin
	}
}
