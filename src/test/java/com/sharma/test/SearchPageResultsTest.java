package com.sharma.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sharma.base.BaseTest;
import com.sharma.pages.HomePage;
import com.sharma.pages.SearchPage;
import com.sharma.pages.SearchResultsPage;

public class SearchPageResultsTest extends BaseTest{

	HomePage hm;
	
	@Test
	public void searchTest() throws InterruptedException{
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		SearchResultsPage spr = sp.search();
		assertTrue(spr.searchResultsMessage().contains("results found"));
		
	}
	
}
