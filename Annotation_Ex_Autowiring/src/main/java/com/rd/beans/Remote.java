package com.rd.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Remote {
	@Autowired
public Tv tv;

public Tv getTv() {
	return tv;
}

public void setTv(Tv tv) {
	this.tv = tv;
}

public void perform() {
	tv.turnOn();
	tv.changeChennal();
	
}

}
