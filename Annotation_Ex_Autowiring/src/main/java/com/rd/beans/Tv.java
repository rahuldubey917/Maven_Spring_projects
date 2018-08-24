package com.rd.beans;

import org.springframework.stereotype.Component;

@Component
public class Tv {
	public Tv() {
		System.out.println("tv is getting signal");
		
	}
	
	public void turnOn() {
		System.out.println("tv is on");
		
	}

	public void changeChennal() {
		System.out.println("chennal is changing");
	}
}
