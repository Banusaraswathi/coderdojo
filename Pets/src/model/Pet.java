package model;

import database.PetInfo;

public class Pet {
	public String breed;
	public String description;

	public static void main(String[] args) {
		PetInfo Pet1 = new PetInfo();
		Pet GS =Pet1.getpet("German Shepherd");
		
		System.out.println(GS.breed);
		System.out.println(GS.description);
		
		Pet GR =Pet1.getpet("Golden Retriever");
		System.out.println(GR.breed);
		System.out.println(GR.description);
		
	//	System.out.println(Pet1.getpet("German Shepherd").breed);
	//	System.out.println(Pet1.getpet("German Shepherd").description);
		
        
	}
	
}
