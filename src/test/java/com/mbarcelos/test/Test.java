package com.mbarcelos.test;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

public class Test extends TestCase {

	public void testName() throws Exception {
		WebDriver driver = new RemoteWebDriver(new URL("http://test:test-password@localhost:4444/wd/hub"), DesiredCapabilities.firefox());

		String baseUrl = "http://google.com";
		String expectedTitle = "Google";
		driver.get(baseUrl);

		assertEquals(expectedTitle, driver.getTitle());
		driver.close();
	}
}
