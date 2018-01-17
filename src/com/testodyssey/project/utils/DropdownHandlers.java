package com.testodyssey.project.utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlers {

	public static void selectByIndex(WebElement ddl,int index )
	{
		Select sct=new Select(ddl);
		sct.selectByIndex(index);
	}
	public static void selectByvalue(WebElement ddl, String value )
	{
Select sct=new Select(ddl);
sct.selectByValue(value);
}
	public static void selectByVisibleText(WebElement ddl, String text)
	{
		Select sct=new Select(ddl);
		sct.selectByVisibleText(text);
	}

	public static void deselectByIndex(WebElement ddl,int index )
	{
		Select sct=new Select(ddl);
		sct.deselectByIndex(index);
	}
	public static void deselectByvalue(WebElement ddl, String value )
	{
Select sct=new Select(ddl);
sct.deselectByValue(value);
}
	public static void deselectByVisibleText(WebElement ddl, String text)
	{
		Select sct=new Select(ddl);
		sct.deselectByVisibleText(text);
	}
}
