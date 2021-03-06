package com.susie.stanley.thinking.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class AdapterIterator extends TestIterator {

	public Iterable<String> reversed(){
		return new Iterable<String>(){
			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>(){
					int current = words.length;
					@Override
					public boolean hasNext() {
						return current > - 1;
					}
					@Override
					public String next() {
						return words[current--];
					}
					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
			
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>(){
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
}
