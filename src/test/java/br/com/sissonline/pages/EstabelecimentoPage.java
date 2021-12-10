package br.com.sissonline.pages;

import br.com.sissonline.maps.EstabelecimentoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EstabelecimentoPage {
    private WebDriver driver;
    private EstabelecimentoMap estabelecimentoMap;

    public EstabelecimentoPage(WebDriver driver) {
        this.driver = driver;
        estabelecimentoMap = new EstabelecimentoMap();
        PageFactory.initElements(driver, estabelecimentoMap);
    }

    public void clickTipoEstabelecimento(){
        estabelecimentoMap.tipoEstabelecimento.click();
    }

//TIPO ESTABELECIMENTO

//SERVIÇO ESPECIALIZADO

//DISTRITO SANITÁRIO

//MANTENEDORA

// REGIÃO

//OCUPAÇÃO

//ESTABELECIMENTO

//PROFISSIONAL

//MANUTENÇÃO CBO

//MAPEAMENTO

//USUARIO SISTEMA

//AREA MEDICA

//INSTALAÇÃO PREDIAL

//GERENCIAMENTO

//ESPECIALIDADE

//CONFIGURAÇÃO DE GESTAO DE FilA

//TOTEM EMISSOR DE SENHA


}