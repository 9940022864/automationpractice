package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObjects extends BasePage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement productHeader;

	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;

	public DressesPageObjects() {
		PageFactory.initElements(driver, this);
		
	@FindBy(xpath="//div/ul/li/a[@title='Dresses']");
	}

	public int getProductCountFromHeader() {
	/*	String text = productHeader.getText();
		String[] air = txt.split(" ");
		String number = air[2];
		int numb = Integer.parseInt(number);
		return numb; */
		
		return Integer.parseInt(productHeader.getText().split(" ")[2]);
		
	}

	public int getProductCount() {
		return lstProducts.size();
	}

}
