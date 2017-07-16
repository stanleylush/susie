package com.susie.stanley.thinking.typeinfo.pets.creator;

import java.util.ArrayList;
import java.util.List;

import com.susie.stanley.thinking.typeinfo.pets.Pet;

public class ForNamePetCreator extends PetCreator {
	
	private static List<Class<? extends Pet>> petClassList = new ArrayList<Class<? extends Pet>>();
	private static String[] petNames = {"com.susie.stanley.interview.typeinfo.pets.Mutt",
			"com.susie.stanley.interview.typeinfo.pets.Pug",
			"com.susie.stanley.interview.typeinfo.pets.EgyptianMau",
			"com.susie.stanley.interview.typeinfo.pets.Manx",
			"com.susie.stanley.interview.typeinfo.pets.Cymric",
			"com.susie.stanley.interview.typeinfo.pets.Rat",
			"com.susie.stanley.interview.typeinfo.pets.Mouse",
			"com.susie.stanley.interview.typeinfo.pets.Hamster"};
	
	static{
		loaderTypes();
	}

	private static void loaderTypes() {
		try {
			for(String name: petNames){
				petClassList.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Class<? extends Pet>> getTypes() {
		return petClassList;
	}

}
