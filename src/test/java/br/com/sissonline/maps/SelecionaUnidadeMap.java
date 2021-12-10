package br.com.sissonline.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SelecionaUnidadeMap {
    @FindBy(xpath = "//*[@id=\"_div\"]/input")
    public WebElement inpUnidade;
}
