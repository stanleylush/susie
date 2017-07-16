package com.susie.stanley.thinking.typeinfo.pets;

public class Individual implements Comparable<Individual> {

	private static long counter = 0;
	private final long id = counter++;
	private String name;
	
	public Individual(){
		
	}
	
	public Individual(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Individual o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
