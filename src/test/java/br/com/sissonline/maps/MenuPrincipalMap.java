package br.com.sissonline.maps;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPrincipalMap {
    @FindBy(xpath = "//*[@id=\"item12Menu\"]")
            public WebElement menuEstabelecimento;
    @FindBy(xpath = "//*[@id=\"item32Menu\"]")
            public WebElement menuSaudeFamilia;
    @FindBy(xpath = "//*[@id=\"item40Menu\"]")
            public WebElement menuConfiguracao;
    @FindBy(xpath = "//*[@id=\"item53Menu\"]")
            public WebElement menuAlmoxarifado;
    @FindBy(xpath = "//*[@id=\"item67Menu\"]")
            public WebElement menuFarmacia;
    @FindBy(xpath = "//*[@id=\"item85Menu\"]")
            public WebElement menuAtencaoSaude;
    @FindBy(xpath = "//*[@id=\"item107Menu\"]")
            public WebElement menuEpidemiologia;
    @FindBy(xpath = "//*[@id=\"item118Menu\"]")
            public WebElement menuAgenda;
    @FindBy(xpath = "//*[@id=\"item140Menu\"]")
            public WebElement menuGestor;
    @FindBy(xpath = "//*[@id=\"item166Menu\"]")
            public WebElement menuLaboratorio;
    @FindBy(xpath = "//*[@id=\"item184Menu\"]")
            public WebElement menuCopiaSeguranca;
    @FindBy(xpath = "//*[@id=\"item189Menu\"]")
            public WebElement menuVigilanciaSanitaria;
    @FindBy(xpath = "//*[@id=\"item196Menu\"]")
            public WebElement menuInformacoes;
    @FindBy(xpath = "//*[@id=\"item210Menu\"]")
            public WebElement menuSamu;
    @FindBy(xpath = "//*[@id=\"item217Menu\"]")
            public WebElement menuCDS;
    @FindBy(xpath = "//*[@id=\"item229Menu\"]")
            public WebElement menuFaturamento;
    @FindBy(xpath = "//*[@id=\"item234Menu\"]")
            public WebElement menuHospitalar;
    @FindBy(xpath = "//*[@id=\"item240Menu\"]")
            public WebElement menuTelemedicina;
    @FindBy(xpath = "//*[@id=\"item243Menu\"]")
            public WebElement menuBI;

//MENU CRUD PADRÃO COM PESQUISA
    @FindBy(css = "#ctl00_operationsMenu_lblNew")
            public WebElement btnNovo;

    @FindBy(css = "#ctl00_operationsMenu_lblEdit")
            public WebElement btnEditar;

    @FindBy(css = "#ctl00_operationsMenu_lblDelete")
            public WebElement btnExcluir;

    @FindBy(css = "#ctl00_operationsMenu_lblSearch")
            public WebElement btnPesquisar;

    @FindBy(css = "#ctl00_operationsMenu_lblSave")
            public WebElement btnConfirmar;

    @FindBy(css = "#ctl00_operationsMenu_lblCancel")
            public WebElement btnCancelar;

    @FindBy(css = "#popup_ok")
            public WebElement btnConfirmarPopUp;

    @FindBy(css = "#ctl00_btnConfirm")
            public WebElement btnPesquisaPesquisar;

    @FindBy(xpath = "//*[@id=\"grdListTable_Table\"]/tbody/tr[1]/td")
            public WebElement clickSelecionado;

}
