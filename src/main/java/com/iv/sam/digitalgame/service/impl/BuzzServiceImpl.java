package com.iv.sam.digitalgame.service.impl;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DispatchService;

/**
 * @ClassName: BuzzServiceImpl 
 * @Description: The implements of DispatchService, which use to Realize:
 * (1) A number multiples of three print "Buzz";
 * (2) A number is Buzz if it is divisible by 5 of if it has a 5 in it.
 * @author Sam
 * @date 2019-05-15 17:40:00 
 *
 */
public class BuzzServiceImpl implements DispatchService {

	public String getString(int n, String stage) {
		if(match(n, stage)) 
			return Constant.BUZZ;
		return "";
	}

	public boolean match(int n, String stage) {
		
		if(Constant.STAGE_1.equalsIgnoreCase(stage))
			return 0 == n%Constant.BUZZ_NUMBER;
		return 0 == n%Constant.BUZZ_NUMBER || String.valueOf(n).contains(Constant.BUZZ_NUMBER + "");
	}

}
