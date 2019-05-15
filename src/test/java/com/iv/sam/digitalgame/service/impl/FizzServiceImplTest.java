package com.iv.sam.digitalgame.service.impl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DispatchService;

public class FizzServiceImplTest {

	private static DispatchService fizzService;
	
	@BeforeClass
	public static void befor() {
		fizzService = new FizzServiceImpl();
	}
	
	@Test
	public void testTrueStage1() {
		int n = 3;
		String stage = Constant.STAGE_1;
		Assert.assertTrue(fizzService.match(n, stage));
	}
	
	@Test
	public void testTrueStage2() {
		int n = 13;
		String stage = Constant.STAGE_2;
		Assert.assertTrue(fizzService.match(n, stage));
	}
	
	@Test
	public void testFalseStage1() {
		int n = 2;
		String stage = Constant.STAGE_1;
		Assert.assertFalse(fizzService.match(n, stage));
	}
	
	@Test
	public void testFalseStage2() {
		int n = 2;
		String stage = Constant.STAGE_2;
		Assert.assertFalse(fizzService.match(n, stage));
	}
	
	@Test
	public void testGetStringStage1() {
		int n = 3;
		String stage = Constant.STAGE_1;
		String result = fizzService.getString(n, stage);
		Assert.assertArrayEquals(new String[] {Constant.FIZZ}, new String[] {result});
	}
	
	@Test
	public void testGetStringStag2() {
		int n = 13;
		String stage = Constant.STAGE_2;
		String result = fizzService.getString(n, stage);
		Assert.assertArrayEquals(new String[] {Constant.FIZZ}, new String[] {result});
	}
}
