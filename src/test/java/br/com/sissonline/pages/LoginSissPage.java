package br.com.sissonline.pages;

import br.com.sissonline.core.Driver;
import br.com.sissonline.maps.LoginSissMap;
import org.openqa.selenium.support.PageFactory;

public class LoginSissPage {
    LoginSissMap loginSissMap;

    public LoginSissPage(){
        loginSissMap = new LoginSissMap();
        PageFactory.initElements(Driver.getDriver(), loginSissMap);
    }

    public void getBtnEntrar(){
        loginSissMap.btnEntrar.click();
    }

    public void getBtnSalvar(){
        loginSissMap.btnSalvar.click();
    }

    public void getBtnInicial(){
        loginSissMap.btnInicial.click();
    }


}
