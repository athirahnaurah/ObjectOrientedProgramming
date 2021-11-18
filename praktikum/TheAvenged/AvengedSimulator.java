package praktikum.TheAvenged;

import java.util.*;

public class AvengedSimulator {

	public static void main(String[] args) {
		List<SuperHero> heroes = new ArrayList<SuperHero>();
		
		heroes.add(new FlyingDutchMan(225, "Shirai"));
		heroes.add(new DirtyBubble(666, "Arnastria"));
		heroes.add(new ManRay(0, "Gennichiro"));
		heroes.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
		heroes.add(new FlyingDutchMan(36556 , "Tatenari"));
		
		Collections.sort(heroes);
	
		for (SuperHero s: heroes) {
			System.out.println("===========================================================================");
			s.identity();
			s.showPowers();
			System.out.println("===========================================================================");
		}


	}

}
