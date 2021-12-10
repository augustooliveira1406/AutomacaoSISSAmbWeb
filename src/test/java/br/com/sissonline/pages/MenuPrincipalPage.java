package br.com.sissonline.pages;

import br.com.sissonline.core.Driver;
import br.com.sissonline.maps.MenuPrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuPrincipalPage {
    private WebDriver driver;
    private MenuPrincipalMap menuPrincipalMap;

    public MenuPrincipalPage(WebDriver driver) {
        this.driver = driver;
        menuPrincipalMap = new MenuPrincipalMap();
        PageFactory.initElements(driver, menuPrincipalMap);
    }
   public void clickEstabelecimento(){
        menuPrincipalMap.menuEstabelecimento.click();
    }
    public void clickSaudeFamilia(){
        menuPrincipalMap.menuSaudeFamilia.click();
    }
    public void clickConfiguracao(){
        menuPrincipalMap.menuConfiguracao.click();
    }
    public void clickAlmoxarifado(){
        menuPrincipalMap.menuAlmoxarifado.click();
    }
    public void clickFarmacia(){
        menuPrincipalMap.menuFarmacia.click();
    }
    public void clickAtencaoSaude(){
        menuPrincipalMap.menuAtencaoSaude.click();
    }
    public void clickEpidemiologia(){
        menuPrincipalMap.menuEpidemiologia.click();
    }
    public void clickAgenda(){
        menuPrincipalMap.menuAgenda.click();
    }
    public void clickGestor(){
        menuPrincipalMap.menuGestor.click();
    }
    public void clickLaboratorio(){
        menuPrincipalMap.menuLaboratorio.click();
    }
    public void clickCopiaSeguranca(){
        menuPrincipalMap.menuCopiaSeguranca.click();
    }
    public void clickVigilanciaSanitaria(){
        menuPrincipalMap.menuVigilanciaSanitaria.click();
    }
    public void clickInformacoes(){
        menuPrincipalMap.menuInformacoes.click();
    }
    public void clickSamu(){
        menuPrincipalMap.menuSamu.click();
    }
    public void clickCDS(){
        menuPrincipalMap.menuCDS.click();
    }
    public void clickFaturamento(){
        menuPrincipalMap.menuFaturamento.click();
    }
    public void clickHospitalar(){
        menuPrincipalMap.menuHospitalar.click();
    }
    public void clickTelemedicina(){
        menuPrincipalMap.menuTelemedicina.click();
    }
    public void clickBI(){
        menuPrincipalMap.menuBI.click();
    }


    //CRUD PADRÃO DO SISTEMA
    public void clickConfirmar(){
        menuPrincipalMap.btnConfirmar.click();;
    }
    public void clickCancelar(){
        menuPrincipalMap.btnCancelar.click();
    }
    public void clickExcluir(){
        menuPrincipalMap.btnExcluir.click();
    }
    public void clickEditar(){
        menuPrincipalMap.btnEditar.click();
    }
    public void clickNovo(){
        menuPrincipalMap.btnNovo.click();
    }
    public void clickPesquisar(){
        menuPrincipalMap.btnPesquisar.click();
    }
    public void clickPesquisaPesquisar() {
        menuPrincipalMap.btnPesquisaPesquisar.click();
    }
    public void clickPesquisado(){
        menuPrincipalMap.clickSelecionado.click();
    }
    public void clickbtnConfirmarPopUp(){
        Driver.visibilityOf(menuPrincipalMap.btnConfirmarPopUp);
        menuPrincipalMap.btnConfirmarPopUp.click();
    }

}