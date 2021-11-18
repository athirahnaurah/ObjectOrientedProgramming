package praktikum.TheAvenged;

public class ManRay extends SuperHero{
	public ManRay(int pwrLvl, String nm) {
		super(pwrLvl,nm);
		super.addPower(new LaserEye());
		super.addPower(new Strength());
	}
	

	public void identity() {
		System.out.print("Siap ! saya " + getName() + " siap menjadi pahlawan dengan kekuatan " );
		for (Power p:powerList) {
			//System.out.println(p.getClass().getName());
			System.out.print(p.NamePower() + " ");
		}
		System.out.println("\nIt's " + getName() + ",the DirtyBubble! It has the power level of " + getPowerLevel());
	}
}
