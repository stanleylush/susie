package com.susie.stanley.thinking.typeinfo.pets.creator;

import java.util.LinkedHashMap;

import com.susie.stanley.thinking.typeinfo.pets.Pet;

public class PetCount3 {
	
	public static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter(){
			super();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
