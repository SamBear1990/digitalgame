package com.iv.sam.digitalgame.service;

/**
 * @ClassName: DigitalGameService 
 * @Description: 
 * stage1:Print the numbers from 1 to 100.But for multiples of three print "Fizz" instead of the number and for the multiples
 * of five print "Buzz".For numbers which are multiples of both three and five print "FizzBuzz"
 * 
 * stage2:
 * (1) A number is Fizz if it is divisible by 3 of if it has a 3 in it
 * (2) A number is Buzz if it is divisible by 5 of if it has a 5 in it
 * (3) A number is FizzBuzz if it satisfy above 2 criterias together
 * @author Sam
 * @date 2019-05-15 17:05:00 
 *
 */
public interface DigitalGameService {

	void println(int digital, String stage, String sortType);
	
}
