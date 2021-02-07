package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] list = {
			"iisajd asdj0d a asd asjd asd j0sajd",
			"123129 031920312938 129381923 12 ",
			"IJSIJ!@#I ASDJ O!@#(I ASDMAL",
			"!@#%!(@#*(%(!(@)#%*!@#"
	};
	
	Random myRadom = new Random();
	
	@Override
	public String getFortune() {
		int random = myRadom.nextInt(list.length);
		return list[random];
	}
}
