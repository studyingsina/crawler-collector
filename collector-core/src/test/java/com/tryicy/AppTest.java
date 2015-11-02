package com.tryicy;

import org.archive.crawler.Heritrix;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) {
		try {
			String[] self = { "-a", "admin:admin" };
			new Heritrix().instanceMain(self);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
