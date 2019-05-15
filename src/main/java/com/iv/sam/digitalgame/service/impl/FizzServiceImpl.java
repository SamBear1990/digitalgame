package com.iv.sam.digitalgame.service.impl;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DispatchService;

/**
 * @ClassName: FizzServiceImpl 
 * @Description: The implements of DispatchService, which use to Realize:
 * (1) A number multiples of three print "Fizz";
 * (2) A number is Fizz if it is divisible by 3 of if it has a 3 in it.
 * @author Sam
 * @date 2019-05-15 17:25:00 
 *
 */
public class FizzServiceImpl implements DispatchService {

	public String getString(int n, String stage) {
		if(match(n, stage))
			return Constant.FIZZ;
		return "";
	}

	public boolean match(int n, String stage) {
		if(Constant.STAGE_1.equalsIgnoreCase(stage))
			return 0 == n%Constant.FIZZ_NUMBER;
		return 0 == n%Constant.FIZZ_NUMBER || String.valueOf(n).contains(Constant.FIZZ_NUMBER + "");
	}

}
