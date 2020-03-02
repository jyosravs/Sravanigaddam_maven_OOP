package com.taskepam.maven_OOP;

		public class gifts extends chocolates {
		public int quantity;
        public gifts() {
			super();
		}
     public gifts(String name, double price) {
			super(name, price);
		}



		public gifts(String name, double price, int quantity) {
			super(name, price);
			this.quantity = quantity;
		}
      @Override
		public String toString() {
			return "Gifts [name = " + this.name + ", price = " + price + " quantity=" + quantity + "]";
		}
		
		
		
	}

