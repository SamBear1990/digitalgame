package com.iv.sam.digitalgame.service;

/**
 * @ClassName: DispatchService 
 * @Description: The interface use to switch BuzzServiceImpl Or FizzServiceImpl
 * @author Sam
 * @date 2019-05-15 17:15:00 
 *
 */
public interface DispatchService {
	/**
	 * Transfer the gived integer n to string.
	 * @param n
	 * @return
	 */
	public String getString(int n, String stage);
	
	/**
	 * Match the input integer n and String stage, and then output the data based on the results.
	 * @param n
	 * @return
	 */
	public boolean match(int n, String stage);
}
