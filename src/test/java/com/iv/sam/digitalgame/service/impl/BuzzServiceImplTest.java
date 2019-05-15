package com.iv.sam.digitalgame.service.impl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.iv.sam.digitalgame.constant.Constant;
import com.iv.sam.digitalgame.service.DispatchService;

public class BuzzServiceImplTest {
	
	private static DispatchService buzzService;
	
	@BeforeClass
	public static void befor() {
		buzzService = new BuzzServiceImpl();
	}
	
	@Test
	public void testTrueStage1() {
		int n = 5;
		String stage = Constant.STAGE_1;
		Assert.assertTrue(buzzService.match(n, stage));
	}
	
	@Test
	public void testTrueStage2() {
		int n = 51;
		String stage = Constant.STAGE_2;
		Assert.assertTrue(buzzService.match(n, stage));
	}
	
	@Test
	public void testFalseStage1() {
		int n = 52;
		String stage = Constant.STAGE_1;
		Assert.assertFalse(buzzService.match(n, stage));
	}
	
	@Test
	public void testFalseStage2() {
		int n = 12;
		String stage = Constant.STAGE_2;
		Assert.assertFalse(buzzService.match(n, stage));
	}
	
	@Test
	public void testGetStringStage1() {
		int n = 5;
		String stage = Constant.STAGE_1;
		String result = buzzService.getString(n, stage);
		Assert.assertArrayEquals(new String[] {Constant.BUZZ}, new String[] {result});
	}
	
	@Test
	public void testGetStringStag2() {
		int n = 51;
		String stage = Constant.STAGE_2;
		String result = buzzService.getString(n, stage);
		Assert.assertArrayEquals(new String[] {Constant.BUZZ}, new String[] {result});
	}
}
