package com.susie.stanley.thinking.typeinfo.pets.creator;

import java.util.HashMap;

import com.susie.stanley.thinking.typeinfo.pets.Pet;

public class PetCount {
	
	/**
	 * hashMap计数器
	 * @author lu
	 */
	static class PetCounter extends HashMap<String, Integer>{
		/**
		 * 归类计数，保存到map中
		 * @param type
		 */
		public void count(String type){
			Integer quantity = get(type);
			if(quantity == null){
				put(type, 1);
			}else{
				put(type, quantity+1);
			}
		}
	}
	
	public static void countPets(PetCreator creator){
		PetCounter counter = new PetCounter();
		for(Pet pet: creator.createArray(20)){
			System.out.print(pet.getClass().getSimpleName()+" ");
			if(pet instanceof Pet){
				counter.count("Pet");
			}
		}
		System.out.println();
		System.out.println(counter);
	}
	
	public static void main(String[] args){
		countPets(new ForNamePetCreator());
	}

}
