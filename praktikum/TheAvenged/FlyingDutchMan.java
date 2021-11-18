package praktikum.TheAvenged;


public class FlyingDutchMan extends SuperHero {
	
	public FlyingDutchMan(int pwrLvl, String nm) {
		super(pwrLvl,nm);
		super.addPower(new Flying());
		super.addPower(new LaserEye());
	}
	

	public void identity() {
		System.out.print("Siap ! saya " + getName() + " siap menjadi pahlawan dengan kekuatan " );
		for (Power p:powerList) {
			//System.out.println(p.getClass().getName());
			System.out.print(p.NamePower() + " ");
		}
		System.out.println("\nIt's " + getName() + ",the FlyingDutchMan! It has the power level of " + getPowerLevel());
	}
	
}
