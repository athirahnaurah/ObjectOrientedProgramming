package praktikum.TheAvenged;

public class LaserEye implements Power{
	@Override
	public void doPower() {
		System.out.println("SUPERIOR SIGHT, BEHOLD LASER EYE!");
	}
	
	@Override
	public String NamePower() {
		return "laser eye";
	}
}
