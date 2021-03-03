package database;

import model.Pet;

public class PetInfo {
	public Pet getpet (String breed) {
		if (breed.equals("Labrador Retriever")) {
			Pet Labrador= new Pet();
			Labrador.breed = "Labrador Retriever";
					Labrador.description= "The Lab makes his 25th straight appearance as the number one breed." ;
			return Labrador;
			
		}
		else if(breed.equals("German Shepherd")) {
			Pet German  = new Pet();
			German.breed = "German Shepherd";
			German.description = "A true dog lover’s pet, the German Shepherd Dog is intelligent and hardworking.";
			return German ;
		}
		else if(breed.equals("Golden Retriever")) {
			Pet  Golden = new Pet();
			 Golden.breed="Golden Retriever";
			 Golden.description=" A very athletic breed, the Golden Retriever is another family-friendly pet with a fantastic demeanor.";
			 return  Golden;
		}
		else if(breed.equals("Bulldog")) {
			Pet Bull = new Pet(); //Constructor//
				Bull.breed= "Bulldog";
			Bull.description= "One of the fastest-growing breeds in terms of popularity, Bulldogs are fun and loveable.";
			return Bull;
		}
		else if(breed.equals("Beagle")) {
		Pet Beagle= new Pet();
		Beagle.breed="Beagle Dog";
		Beagle.description= "Conveniently sized with short, low-maintenance coats, the Beagle is a peaceful and cheerful pet.";
		return Beagle;
		}else if (breed.equals("FrenchDog")) {
			Pet French = new Pet();
				French.breed = "FrenchDog";
			French.description ="French Bulldogs have mixed demeanors—sometimes they love to run and play.";
		}else {
		return null;
		}
		return null;
	}
}
