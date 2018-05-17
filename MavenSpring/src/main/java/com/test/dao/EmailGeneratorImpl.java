package com.test.dao;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorImpl implements EmailGenerator {

	@Override
	public String generator() {
		return "46@qq.com";
	}

}
