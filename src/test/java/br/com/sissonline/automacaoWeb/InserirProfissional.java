package br.com.sissonline.automacaoWeb;

import br.com.sissonline.core.Driver;
import br.com.sissonline.enums.Browser;
import br.com.sissonline.pages.EstabelecimentoPage;
import br.com.sissonline.pages.MenuPrincipalPage;
import br.com.sissonline.pages.PrincipalSissPage;
import br.com.sissonline.pages.SelecionarUnidadePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedHashMap;

public class InserirProfissional {
    Driver driverWeb;
    WebDriver driver;
    PrincipalSissPage principalSissPage;
    SelecionarUnidadePage selecionarUnidadePage;
    MenuPrincipalPage menuPrincipalPage;
    EstabelecimentoPage estabelecimentoPage;

    //Abrindo o Navegador para iniciar o teste
    @Before
    public void inicializaTeste() {
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("http://qualidade.manutencao.sissonline.com.br");
        principalSissPage = new PrincipalSissPage(driver);
    }


    @Test
    public void insereProfissional() throws InterruptedException {
//Definindo Cartão e Senha a ser utilizado
        String usuarioTexto = "985785826";
        String senhaTexto = "Luiza7anos";
        WebElement campoCard = driver.findElement(By.id("txtCardNumber"));
        campoCard.sendKeys(usuarioTexto);
        WebElement campoSenha = driver.findElement(By.id("txtSenha"));
        campoSenha.sendKeys(senhaTexto);
        principalSissPage.getBtnEntrar();

//Finalizando o login com o Challenge
        String xpathChallenge = "//*[@id=\"ChallengeFields\"]/div/span";
        Thread.sleep(5000);
        WebElement idChallenge = driver.findElement(By.xpath(xpathChallenge));
        WebElement result = driver.findElement(By.id("txt_:_0"));
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1:A", "v");map.put("1:B", "6");map.put("1:C", "E");map.put("1:D", "8");
        map.put("2:A", "V");map.put("2:B", "T");map.put("2:C", "j");map.put("2:D", "7");
        map.put("3:A", "M");map.put("3:B", "v");map.put("3:C", "N");map.put("3:D", "1");
        map.put("4:A", "q");map.put("4:B", "A");map.put("4:C", "1");map.put("4:D", "n");
        result.sendKeys(map.get(idChallenge.getText()));

//Após inserir o Challenge clicar em Entrar
        principalSissPage.getBtnEntrar();
        Thread.sleep(5000);

//Selecionar Unidade
        selecionarUnidadePage = new SelecionarUnidadePage(driver);
        selecionarUnidadePage.inpUnidade();

//Menu Estabelecimento - Usuário do Sistema
        menuPrincipalPage = new MenuPrincipalPage(driver);
        menuPrincipalPage.clickEstabelecimento();
        estabelecimentoPage = new EstabelecimentoPage(driver);
        estabelecimentoPage.clickUsuarioSistema();

//Escolher Usuário Para Inserir Novo Vínculo
        String cpf = "11726877817";
        //String cns = "835503010220455";
        menuPrincipalPage.clickCPF();
        //menuPrincipalPage.clickCNS();
        WebElement campoCPF = driver.findElement(By.id("txtIdentificacao"));
        campoCPF.sendKeys(cpf);
       // menuPrincipalPage.clickConfirmarBusca();
        Thread.sleep(5000);
        String xpathUsuario = "//*[@id=\"564\"]";
        WebElement usuarioEscolhido = driver.findElement(By.xpath(xpathUsuario));
        usuarioEscolhido.click();
        //menuPrincipalPage.clickbtnConfirmarPopUp();

//Inserindo Vinculo
        String dataentrada = "01/01/2021";
        String conselho = "147852";
        String matricula = "36985";
        String qtdamb = "30";
        String qtdhosp = "0";
        String qtdoutros = "0";
        String qtdagendamento = "24";
        String qtdatende = "4";
        String vigenciainicial = "01/01/2021";
        String datainicial = "01/01/2021";
        //String selectObject = "UBS PONTE GRANDE";
        estabelecimentoPage.clickVinculo();
        estabelecimentoPage.clickBotaoAdicionar();
        estabelecimentoPage.selecioneEstabelecimento("4096");

        WebElement selectEstabelecimento = driver.findElement(By.id("//*[@id=\"ddlEstabelecimento\"]"));
        Select selectObject = new Select(selectEstabelecimento);

        estabelecimentoPage.selecioneOcupacao();  //2445

        WebElement campoDataEntrada = driver.findElement(By.id("//*[@id=\"txtDataEntrada]"));
        campoDataEntrada.sendKeys(dataentrada);

        WebElement campoConselho = driver.findElement(By.id("//*[@id=\"txtRegistroConselho\"]"));
        campoConselho.sendKeys(conselho);

        WebElement campoMatricula = driver.findElement(By.id("//*[@id=\"txtMatricula\"]"));
        campoMatricula.sendKeys(matricula);
        estabelecimentoPage.selecioneConselho();  //17
        estabelecimentoPage.selecioneVinculoCategoria();  //1
        estabelecimentoPage.selecioneVinculoTipo();   //0
        estabelecimentoPage.selecioneVInculoSubTipo();  //0
        WebElement campoQtdAmb = driver.findElement(By.id("//*[@id=\"txtAmbulatorial\"]"));
        campoQtdAmb.sendKeys(qtdamb);

        WebElement campoQtdHosp = driver.findElement(By.id("//*[@id=\"txtHospitalar\"]"));
        campoQtdHosp.sendKeys(qtdhosp);

        WebElement campoQtdOutros = driver.findElement(By.id("//*[@id=\"txtCargaOutros\"]"));
        campoQtdOutros.sendKeys(qtdoutros);

        WebElement campoQtdAgendamento = driver.findElement(By.id("//*[@id=\"txtCargaAgendamento\"]"));
        campoQtdAgendamento.sendKeys(qtdagendamento);

        WebElement campoQtdAtende = driver.findElement(By.id("//*[@id=\"txtCargaAtendimento\"]"));
        campoQtdAtende.sendKeys(qtdatende);

        estabelecimentoPage.selecioneEscala();
        estabelecimentoPage.selecioneUnidadeOrganizacional();
        WebElement campoVigenciaInicial = driver.findElement(By.id("//*[@id=\"txtVigenciaInicial\"]"));
        campoVigenciaInicial.sendKeys(vigenciainicial);

        WebElement campoDataInicial = driver.findElement(By.id("//*[@id=\"txtUODataInicial\"]"));
        campoDataInicial.sendKeys(datainicial);

        estabelecimentoPage.clickConfirmar();
    }

    @After
    public void finalizaTeste(){
        driver.quit();  // fechando o navegador e a sessão
    }

}
