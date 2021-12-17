package br.com.tricentis.paginas;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.tricentis.driver.Driver;

public class AutomovelPage {

	WebDriverWait espera = new WebDriverWait(driver, Duration.ofSeconds(10));

	static WebDriver driver = Driver.getDriver();

	public static void acessaPagina(String url) {
		driver.get(url);

	}

	public AutomovelPage verificarObjetoSelecionado() {
		WebElement objetoSelecionado = espera
				.until(ExpectedConditions.presenceOfElementLocated(By.id("nav_automobile")));
		objetoSelecionado.click();
		return this;

	}

	// Dados do Veículo

	public AutomovelPage informarMake(String make) {
		WebElement selectMake = driver.findElement(By.id("make"));
		Select comboMake = new Select(selectMake);
		comboMake.selectByVisibleText(make);
		return this;
	}

	public AutomovelPage informarEnginePerformance(String enginePerformance) {
		driver.findElement(By.id("engineperformance")).sendKeys(enginePerformance);
		return this;
	}

	public AutomovelPage informarDateOfManufacture(String dateOfManufacture) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(dateOfManufacture);
		return this;
	}

	public AutomovelPage informarNumberOfSeats(String numberOfSeats) {
		WebElement selectSeats = driver.findElement(By.id("numberofseats"));
		Select comboSeats = new Select(selectSeats);
		comboSeats.selectByVisibleText(numberOfSeats);
		return this;
	}

	public AutomovelPage informarFuelType(String fuelType) {
		driver.findElement(By.id("fuel")).sendKeys(fuelType);
		return this;
	}

	public AutomovelPage informarListPrice(String listPrice) {
		driver.findElement(By.id("listprice")).sendKeys(listPrice);
		return this;
	}

	public AutomovelPage informarLicensePlateNumber(String licensePlateNumber) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(licensePlateNumber);
		return this;
	}

	public AutomovelPage informarAnnualMileage(String annualMileage) {
		driver.findElement(By.id("annualmileage")).sendKeys(annualMileage);
		return this;
	}

	public AutomovelPage nextVehicleData() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
		return this;
	}

	// Dados do Seguro

	public AutomovelPage informarFirstName(String firstName) {
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		return this;
	}

	public AutomovelPage informarLastName(String lastName) {
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		return this;
	}

	public AutomovelPage informarDateOfBirth(String dateOfBirth) {
		driver.findElement(By.id("birthdate")).sendKeys(dateOfBirth);
		return this;
	}

	public AutomovelPage informarGender() {
		WebElement radioGender = espera.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@class='ideal-radiocheck-label' and text()='Female' ]")));
		radioGender.click();
		return this;

	}

	public AutomovelPage informarStreetAddress(String streetAddress) {
		driver.findElement(By.id("streetaddress")).sendKeys(streetAddress);
		return this;
	}

	public AutomovelPage informarCountry(String country) {
		WebElement selectCountry = driver.findElement(By.id("country"));
		Select comboCountry = new Select(selectCountry);
		comboCountry.selectByVisibleText(country);
		return this;
	}

	public AutomovelPage informarZipCode(String zipCode) {
		driver.findElement(By.id("zipcode")).sendKeys(zipCode);
		return this;
	}

	public AutomovelPage informarCity(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
		return this;
	}

	public AutomovelPage informarOccupation(String occupation) {
		driver.findElement(By.id("occupation")).sendKeys(occupation);
		return this;
	}

	public AutomovelPage informarHobbies() {
		WebElement radioHobbies = espera.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@class='ideal-radiocheck-label' and text()=' Other' ]")));
		radioHobbies.click();
		return this;
	}

	public AutomovelPage nextInsurantData() {
		driver.findElement(By.id("nextenterproductdata")).click();
		return this;
	}

	// Dados do Produto

	public AutomovelPage informarStartDate(String startDate) {
		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys(startDate);
		return this;
	}

	public AutomovelPage informarInsuranceSum(String insuranceSum) {
		WebElement selectInsuranceSum = driver.findElement(By.id("insurancesum"));
		Select comboInsuranceSum = new Select(selectInsuranceSum);
		comboInsuranceSum.selectByVisibleText(insuranceSum);
		return this;
	}

	public AutomovelPage informarMeritRating(String meritRating) {
		WebElement selectMeritRating = driver.findElement(By.id("meritrating"));
		Select comboMeritRating = new Select(selectMeritRating);
		comboMeritRating.selectByVisibleText(meritRating);
		return this;
	}

	public AutomovelPage informarDamageInsurance(String damageInsurance) {
		WebElement selectDamageInsurance = driver.findElement(By.id("damageinsurance"));
		Select comboDamageInsurance = new Select(selectDamageInsurance);
		comboDamageInsurance.selectByVisibleText(damageInsurance);
		return this;
	}

	public AutomovelPage informarOptionalProducts() {
		WebElement radioProducts = espera.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@class='ideal-radiocheck-label' and text()='Legal Defense Insurance' ]")));
		radioProducts.click();
		return this;
	}

	public AutomovelPage informarCourtesyCar(String courtesyCar) {
		WebElement selectCourtesyCar = driver.findElement(By.id("courtesycar"));
		Select comboCourtesyCar = new Select(selectCourtesyCar);
		comboCourtesyCar.selectByVisibleText(courtesyCar);
		return this;
	}

	public AutomovelPage nextProductData() {
		driver.findElement(By.id("nextselectpriceoption")).click();
		return this;
	}

	// Preço

	public AutomovelPage informarPriceOption() {
		WebElement radioPriceOption = espera.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]")));
		radioPriceOption.click();
		return this;
	}

	public AutomovelPage nextPriceOption() {                  
		
		WebElement nextPriceOption = espera.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[@id='nextsendquote']")));
		nextPriceOption.click();
		
		return this;
	}

	// Enviar Cotação

	public AutomovelPage informarEMail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}

	public AutomovelPage informarUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}

	public AutomovelPage informarPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public AutomovelPage informarConfirmpassword(String confirmpassword) {
		driver.findElement(By.id("confirmpassword")).sendKeys(confirmpassword);
		return this;
	}

	public AutomovelPage sendQuote() {
		driver.findElement(By.xpath("//*[@id='sendemail']")).click();
		return this;
	}

	public boolean verificarMensagemSucesso() {

		String textMessage = espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Sending e-mail success!')]")))
				.getText();

		if (textMessage.contains("Sending e-mail success!")) {
			return true;
		} else {
			return false;
		}

	}
	
	public void alertFinish() {
		driver.findElement(By.xpath("//*[@class='confirm']")).click();
		driver.quit();
	}

}
