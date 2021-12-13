package Steps;

import Pages.*;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Auto_01_PreencherFormularioECadastrarAutomobile {

	public WebDriver driver;
    @Before
    public void IniciaNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
    }
	
	@Dado("^que o usuario esteja na pagina principal do sistema$")
	public void queOUsuarioEstejaNaPaginaPrincipalDoSistema() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}
	
	@Quando("^eu preencher o formulario presente na aba Enter Vehicle Data e pressionar next$")
    public void euPreencherOFormularioPresenteNaAbaEnterVehicleDataEPressionarNext() {
        AutomobileEnterVehicleDataPage enterVehicleDataPage = new AutomobileEnterVehicleDataPage(driver);
        enterVehicleDataPage.preencherFormularioEnterVehicleData();;
    }

    @Quando("^eu preencher o formulario presente na aba Enter Insurant Data e pressionar next$")
    public void euPreencherOFormularioPresenteNaAbaEnterInsurantDataEPressionarNext() {
        AutomobileEnterInsurantDataPage enterInsurantDataPage = new AutomobileEnterInsurantDataPage(driver);
        enterInsurantDataPage.preencherFormularioEnterInsurantData();
    }

    @Quando("^eu preencher o formulario presente na aba Enter Product Data e pressionar next$")
    public void euPreencherOFormularioPresenteNaAbaEnterProductDataEPressionarNext() {
        AutomobileEnterProductDataPage enterProductDataPage = new AutomobileEnterProductDataPage(driver);
        enterProductDataPage.preencherFormularioProductData();
    }

    @Quando("^eu selecionar uma das opcoes presentes na aba Select Price Option e pressionar next$")
    public void euSelecionarUmaDasOpcoesPresentesNaAbaSelectPriceOptionEPressionarNext() {
        AutomobileSelectPriceOption selectPriceOption = new AutomobileSelectPriceOption(driver);
        selectPriceOption.preencherFormSelectPriceOption();;
    }

    @Quando("^eu preencher o formulario presente na aba Send Quote e pressionar Send$")
    public void euPreencherOFormularioPresenteNaAbaSendQuoteEPressionarSend() {
        AutomobileSendQuotePage sendQuotePage = new AutomobileSendQuotePage(driver);
        sendQuotePage.preencherFormSendQuotePage();
    }

    @Entao("^o sistema retorna que o e-mail foi enviado com sucesso$")
    public void oSistemaRetornaQueOEMailFoiEnviadoComSucesso() {
        AutomobileSendQuotePage sendQuotePage = new AutomobileSendQuotePage(driver);
        sendQuotePage.setValidaMensagem();
    }

}
