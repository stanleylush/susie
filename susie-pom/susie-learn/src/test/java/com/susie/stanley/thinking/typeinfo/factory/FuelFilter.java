package com.susie.stanley.thinking.typeinfo.factory;

public class FuelFilter extends Filter {

	public static class Factory implements com.susie.stanley.thinking.typeinfo.factory.Factory<FuelFilter> {

		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}

	}
}
