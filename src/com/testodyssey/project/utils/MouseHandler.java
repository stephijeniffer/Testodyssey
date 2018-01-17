package com.testodyssey.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseHandler {
	public static void mouseHoveOnElement(WebDriver driver,WebElement element)

	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();	
	}
	public static void doubleClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	public static void dragAndDrop(WebDriver driver, WebElement src, WebElement des)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des).perform();
				}
}
