package br.com.sissonline.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstabelecimentoMap{

    //TIPO ESTABELECIMENTO
    @FindBy(xpath = "//*[@id=\"item12Option\"]/li[1]")
            public WebElement tipoEstabelecimento;

}
