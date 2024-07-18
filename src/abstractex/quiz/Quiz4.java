package abstractex.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<Car2>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for (Car2 c : list ) {
			if(c instanceof Bus) {
				Bus b = new Bus();
				b.run();
				b.refuel();
				b.takePassenger();
				
				System.out.println();
				
			}else if(c instanceof AutoCar) {
				AutoCar a = new AutoCar();
				a.run();
				a.refuel();
				a.load();
			}
		}
		
	}

}


