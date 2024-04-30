package com.rts.JenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {
	WorkLog w1 = new WorkLog();

	@Test
	public void testAddToLog1() {

		assertEquals("Added log for Remo", w1.addToLog("Remo"));

	}

	@Test
	public void testAddToLog2() {
		assertEquals("Added log for Remo", w1.addToLog("Remo"));
	}

	@Test

	public void testAddLogin1() {
		assertEquals("Added log for Lokesh", w1.addToLog("Lokesh"));

	}

	@Test

	public void testAddLogin2() {
		assertEquals("Added log for Dharshsun", w1.addToLog("Dharshsun"));
	}

}
