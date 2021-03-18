package com.itheima._myInterface_test01_review;

public class BasketballCoach extends Coach{

	
	public BasketballCoach(String name, int age) {
		super(name, age);

	}

	public BasketballCoach() {
		super();
	}

	@Override
	public void teach() {
		System.out.println("¿∫«ÚΩÃ¡∑ΩÃ ⁄¥Ú¿∫«Ú");
		
	}

	@Override
	public void eat() {
		System.out.println("¿∫«ÚΩÃ¡∑»•¿∫«Ú ≥Ã√≥‘∑π");
		
	}

}
