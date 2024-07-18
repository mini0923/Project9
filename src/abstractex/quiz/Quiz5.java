package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (Animal ani : list) {
			if(ani instanceof Human) {
				Human h = new Human();
				h.sleep();
				h.move();
				h.readBook();

				System.out.println();
			}else if (ani instanceof Tiger) {
				Tiger t = new Tiger();
				t.sleep();
				t.move();
				t.hunting();
			}
			
		}
		
	}

}

