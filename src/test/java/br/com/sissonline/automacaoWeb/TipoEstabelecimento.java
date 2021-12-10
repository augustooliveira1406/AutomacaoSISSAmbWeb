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
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TipoEstabelecimento {
    Driver driverWeb;
    WebDriver driver;
    PrincipalSissPage principalSissPage;
    SelecionarUnidadePage selecionarUnidadePage;
    MenuPrincipalPage menuPrincipalPage;
    EstabelecimentoPage estabelecimentoPage;

//Abrindo o Navegador para iniciar o teste
    @Before
    public void inicializaTeste(){
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("http://qualidade.manutencao.sissonline.com.br");
        principalSissPage = new PrincipalSissPage(driver);
    }

    @Test
    public void tipoEstabelecimento() throws InterruptedException {
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
        map.put("1:A", "v"); map.put("1:B", "6"); map.put("1:C", "E"); map.put("1:D", "8");
        map.put("2:A", "V"); map.put("2:B", "T"); map.put("2:C", "j"); map.put("2:D", "7");
        map.put("3:A", "M"); map.put("3:B", "v"); map.put("3:C", "N"); map.put("3:D", "1");
        map.put("4:A", "q"); map.put("4:B", "A"); map.put("4:C", "1"); map.put("4:D", "n");
        result.sendKeys(map.get(idChallenge.getText()));
    
//Após inserir o Challenge clicar em Entrar
        principalSissPage.getBtnEntrar();
        Thread.sleep(5000);

//Selecionar Unidade
        selecionarUnidadePage = new SelecionarUnidadePage(driver);
        selecionarUnidadePage.inpUnidade();

//Menu Estabelecimento
        menuPrincipalPage = new MenuPrincipalPage(driver);
        menuPrincipalPage.clickEstabelecimento();
        estabelecimentoPage = new EstabelecimentoPage(driver);
        estabelecimentoPage.clickTipoEstabelecimento();

//Criar Estabelecimento NOVO
        String establishment = "Qualidade";
        String codEstablishment = "123456";
        menuPrincipalPage.clickNovo();
        WebElement campoEstablishment = driver.findElement(By.id("ctl00_cphCadastro_txtNome"));
        campoEstablishment.sendKeys(establishment);
        WebElement campoCodSuss = driver.findElement(By.id("ctl00_cphCadastro_txtCodigoSUS"));
        campoCodSuss.sendKeys(codEstablishment);
        menuPrincipalPage.clickConfirmar();
        menuPrincipalPage.clickbtnConfirmarPopUp();

//Pesquisar Estabeleciento Criado para Editar
        menuPrincipalPage.clickPesquisar();
        Thread.sleep(2000);

        //Abrindo o modal de Pesquisa
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver = driver.switchTo().window(handles.get(1));
        WebElement nomeEstablishment = driver.findElement(By.id("ctl00_cphSearch_txtNome"));
        nomeEstablishment.sendKeys(establishment);
        menuPrincipalPage.clickPesquisaPesquisar();
        Thread.sleep(2000);
        menuPrincipalPage.clickPesquisado();

        //Voltando a Tela Principal
        List<String> handles1 = new ArrayList<>(driver.getWindowHandles());
        driver = driver.switchTo().window(handles1.get(0));

//Editar Estabelecimento criado
        String establishment1 = "Qualidade1";
        menuPrincipalPage.clickEditar();
        WebElement campoEstablishment1 = driver.findElement(By.id("ctl00_cphCadastro_txtNome"));
        campoEstablishment1.sendKeys(establishment1);
        menuPrincipalPage.clickConfirmar();
        menuPrincipalPage.clickbtnConfirmarPopUp();

//Excluir Estabelecimento criado para limpar a Base
        menuPrincipalPage.clickPesquisar();
        Thread.sleep(2000);

        //Abrindo o modal de Pesquisa
        List<String> handles2 = new ArrayList<>(driver.getWindowHandles());
        driver = driver.switchTo().window(handles2.get(1));
        WebElement nomeEstablishment1 = driver.findElement(By.id("ctl00_cphSearch_txtNome"));
        nomeEstablishment1.sendKeys(establishment1);
        menuPrincipalPage.clickPesquisaPesquisar();
        Thread.sleep(2000);
        menuPrincipalPage.clickPesquisado();

        //Voltando a Tela Principal
        List<String> handles3 = new ArrayList<>(driver.getWindowHandles());
        driver = driver.switchTo().window(handles3.get(0));
        menuPrincipalPage.clickExcluir();
        menuPrincipalPage.clickConfirmar();
        menuPrincipalPage.clickbtnConfirmarPopUp();
    }

    @After
    public void finalizaTeste(){
        driver.quit();  // fechando o navegador e a sessão
    }
}
