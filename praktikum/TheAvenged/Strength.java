package praktikum.TheAvenged;

public class Strength implements Power {
	
	@Override
	public void doPower() {
		System.out.println("DISGUST ME, BEHOLD SUPER STRENGTH!");
	}
	
	@Override
	public String NamePower() {
		return "strength";
	}

}
