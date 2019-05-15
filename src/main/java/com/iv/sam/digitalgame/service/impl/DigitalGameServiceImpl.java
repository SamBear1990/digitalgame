package com.iv.sam.digitalgame.service.impl;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DigitalGameService;
import com.iv.sam.digitalgame.service.DispatchService;

public class DigitalGameServiceImpl implements DigitalGameService {
	
	public void println(int n, String stage, String sortType) {
		DispatchService buzzServiceImpl = new BuzzServiceImpl();
		DispatchService fizzServiceImpl = new FizzServiceImpl();
		
		if(null == stage || "".equals(stage)) {
			stage = Constant.STAGE_1;
		}
		
		if(null == sortType || "".equals(sortType)) {
			sortType = Constant.ASC;
		}
		
		StringBuffer result = new StringBuffer();
		if(Constant.ASC.equals(sortType)) {
			for(int i=1; i<(n + 1); i++) {
				result.setLength(0);
				result.append(fizzServiceImpl.getString(i, stage));
				result.append(buzzServiceImpl.getString(i, stage));
				if(0 == result.length()) {
					result.append(i + "");
				}
				System.out.println(result);
			}
		} else if(Constant.DESC.equals(sortType)) {
			for(int i=n; i>0; i--) {
				result.setLength(0);
				result.append(fizzServiceImpl.getString(i, stage));
				result.append(buzzServiceImpl.getString(i, stage));
				if(0 == result.length()) {
					result.append(i + "");
				}
				System.out.println(result);
			}
		}
		
	}

	
}
