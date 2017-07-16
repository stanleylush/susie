package com.susie.stanley.thinking.typeinfo.pets.creator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.susie.stanley.thinking.typeinfo.pets.Pet;

public abstract class PetCreator {

	private Random rand = new Random(47);
	/**
	 * 将.class文件转换为Class对象
	 * @return
	 */
	public abstract List<Class<? extends Pet>> getTypes();
	
	public Pet randomPet(){
		int n = rand.nextInt(getTypes().size());
		Pet pet = null;
		try {
			pet = getTypes().get(n).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return pet;
	}
	
	public Pet[] createArray(int size){
		Pet[] petArray = new Pet[size];
		for(int i = 0; i < size; i++){
			petArray[i] = randomPet();
		}
		return petArray;
	}
	
	public ArrayList<Pet> createArrayList(int size){
		ArrayList<Pet> petList = new ArrayList<Pet>();
		Collections.addAll(petList, createArray(size));
		return petList;
	}
	
}
