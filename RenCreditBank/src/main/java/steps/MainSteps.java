package steps;


import pages.MainPage;
import io.qameta.allure.Step;

public class MainSteps {

		MainPage mainPage = new MainPage();

		@Step("������ ����� �������� ���� - {0}")
		public void stepSelectMenuItem(String item){
			mainPage.selectMainMenuItem(item);
		}


}