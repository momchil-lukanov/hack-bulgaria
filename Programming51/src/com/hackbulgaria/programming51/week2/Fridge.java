package com.hackbulgaria.programming51.week2;

public class Fridge {
	public Food[] foods;
	public int capacity = 0;
	public int weight = 0;
	public int foodCounter = 0;

	public Fridge(int capacity) {
		this.capacity = capacity;
		this.weight = weight;
		this.foods = new Food[capacity];
	}

	public Fridge(int capacity, int weight) {
		this.capacity = capacity;
		this.weight = weight;
		this.foods = new Food[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public int getMaxWeight() {
		return weight;
	}

	public Food getHaviestFood() {
		Food result = null;
		int maxWeight = 0;
		for (Food food : foods) {
			if (food != null && food.weight > maxWeight) {
				maxWeight = food.weight;
				result = food;
			}
		}
		return result;
	}

	public boolean addFood(Food f) {
		if (foodCounter < capacity) {
			foods[foodCounter] = f;
			foodCounter += 1;
			return true;
		}
		return false;
	}

	public int getFoodsCount() {
		int result = 0;
		for (Food food : foods) {
			if (food != null) {
				result += 1;
			}
		}
		return result;
	}

	public int getWeight() {
		int result = 0;
		for (Food food : foods) {
			if (food != null) {
				result += food.weight;
			}
		}
		return result;
	}

	public String[] getProductsOfType(String type) {
		String[] result = new String[capacity];
		int counter = 0;
		for (Food food : foods) {
			if (food != null && food.type == type) {
				counter++;
				result[counter] = food.toString();
			}
		}
		String[] result2 = new String[counter];
		int counter2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (foods[i] != null && foods[i].type == type) {
				result2[counter2] = foods[i].toString();
				counter2++;
			}
		}
		
		return result2;
	}

	public String toString() {
		String result = "";
		for (Food food : foods) {
			if (food != null) {
				result += food + "\n";
			}
		}
		return result;
	}

}
