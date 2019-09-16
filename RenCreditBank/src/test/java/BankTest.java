import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.DepositPage;
import pages.MainPage;
import steps.BaseSteps;

/*
 * + 1. ѕерейти по ссылке - https://rencredit.ru 
 * + 2. ѕерейти в меню Ц ¬клады 
 * 3. ¬ыбрать Ц –убли 
 * 4. —умма вклада Ц 300 000 
 * 5. —рок Ц 6 мес€цев 
 * 6. ≈жемес€чное пополнение Ц 50 000 
 * 7. ќтметить Ц ≈жемес€чна€ капитализаци€ 
 * 8. ѕроверить расчеты по вкладу: 
 * 		a. —тавка Ц 6,75% 
 * 		b.   сн€тию через мес€ц Ц 564 398, 21 
 * 		c. ѕополнение за 6 мес€цев Ц 250 000 
 * 		d. Ќачислено Ц 14 398, 21 
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
		mainPage.selectMainMenuItem("¬клады");
		
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
