package com.iv.sam.digitalgame;

import com.iv.sam.digitalgame.service.DigitalGameService;
import com.iv.sam.digitalgame.service.impl.DigitalGameServiceImpl;

public class Main {

	public static void main(String[] args) {
		int n = 100;
		String sortType = "ASC";
		String stage = "stage1";
		DigitalGameService gameService = new DigitalGameServiceImpl();
		gameService.println(n, stage, sortType);
	}
}
