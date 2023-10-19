package com.neoxam;

/**
 * Calculator class.
 */
public class Calculator {

	/**
	 * Add numbers contained in string.
	 * 
	 * @param numbers
	 *            numbers string
	 * @return the sum
	 */
	public int add(String numbers) {
		String[] splittedNumbers = numbers.split(",");
		int sum = 0;
		for (String splittedNumber : splittedNumbers) {
			sum += getSum(splittedNumber);
		}
    	return sum;
	}

	private int getSum(String numberString) {
		try {
			return Integer.parseInt(numberString);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}
