import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.DepositPage;
import pages.MainPage;
import steps.BaseSteps;

/*
 * + 1. ������� �� ������ - https://rencredit.ru 
 * + 2. ������� � ���� � ������ 
 * 3. ������� � ����� 
 * 4. ����� ������ � 300 000 
 * 5. ���� � 6 ������� 
 * 6. ����������� ���������� � 50 000 
 * 7. �������� � ����������� ������������� 
 * 8. ��������� ������� �� ������: 
 * 		a. ������ � 6,75% 
 * 		b. � ������ ����� ����� � 564 398, 21 
 * 		c. ���������� �� 6 ������� � 250 000 
 * 		d. ��������� � 14 398, 21 
 */

public class BankTest {
	
	@BeforeClass
	public static void setUp() {
		try {
			BaseSteps.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void startTest() {
		MainPage mainPage = new MainPage();
		mainPage.selectMainMenuItem("������");
		
		DepositPage depositPage = new DepositPage();
		depositPage.selectCurrency("USD");
		depositPage.selectCurrency("EUR");
		depositPage.selectCurrency("RUB");
	}
	
	@AfterClass
	public static void end() {
		try {
			//BaseSteps.tearDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
