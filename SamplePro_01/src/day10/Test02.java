package day10;

import day09.Animal;
import day09.Dog;
import day09.Fish;

public class Test02 {

	public static void main(String[] args) {

		Animal a = new Dog("삽살개","쫑");
		a.breath();
		
		Animal b = new Fish("물고기","금붕어");
		b.breath();
		
		Animal[] animals ={a,b};
		
		animals[0].breath();
		animals[1].breath();
	}

}
