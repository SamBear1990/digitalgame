package com.iv.sam.digitalgame.service.impl;

import org.junit.BeforeClass;
import org.junit.Test;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DigitalGameService;

public class DigitalGameServiceImplTest {

	private static DigitalGameService digitalGameService = null;
	
	@BeforeClass
	public static void before() {
		digitalGameService = new DigitalGameServiceImpl();
	}
	
	@Test
	public void digitalGameTest01() {
		int n = 3;
		String stage = Constant.STAGE_1;
		String sortType = Constant.ASC;
		digitalGameService.println(n, stage, sortType);
	}
	
	@Test
	public void digitalGameTest02() {
		int n = 3;
		String stage = Constant.STAGE_1;
		String sortType = Constant.DESC;
		digitalGameService.println(n, stage, sortType);
	}
	
	@Test
	public void digitalGameTest03() {
		int n = 5;
		String stage = Constant.STAGE_1;
		String sortType = Constant.ASC;
		digitalGameService.println(n, stage, sortType);
	}
	
	@Test
	public void digitalGameTest04() {
		int n = 5;
		String stage = Constant.STAGE_1;
		String sortType = Constant.DESC;
		digitalGameService.println(n, stage, sortType);
	}
	
	@Test
	public void digitalGameTest05() {
		int n = 13;
		String stage = Constant.STAGE_1;
		String sortType = Constant.ASC;
		digitalGameService.println(n, stage, sortType);
	}
	
	@Test
	public void digitalGameTest06() {
		int n = 13;
		String stage = Constant.STAGE_2;
		String sortType = Constant.ASC;
		digitalGameService.println(n, stage, sortType);
	}
	
	
}
