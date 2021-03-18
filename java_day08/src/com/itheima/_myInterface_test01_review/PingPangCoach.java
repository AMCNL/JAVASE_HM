package com.itheima._myInterface_test01_review;

public class PingPangCoach extends Coach implements SpeakEnglist{

	
	public PingPangCoach(String name, int age) {
		super(name, age);

	}

	public PingPangCoach() {
		super();
	}
	@Override
	public void speakEnglish() {
		System.out.println("∆π≈“«ÚΩÃ¡∑Àµ”¢”Ô");
		
	}

	@Override
	public void teach() {
		System.out.println("∆π≈“«ÚΩÃ¡∑ΩÃ ⁄¥Ú∆π≈“«Ú");
		
	}

	@Override
	public void eat() {
		System.out.println("∆π≈“«ÚΩÃ¡∑»•∆π≈“«Ú ≥Ã√≥‘∑π");
		
	}

}
