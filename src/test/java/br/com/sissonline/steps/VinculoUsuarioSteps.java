package br.com.sissonline.steps;

import br.com.sissonline.pages.EstabelecimentoPage;
import io.cucumber.java.an.E;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class VinculoUsuarioSteps {
    EstabelecimentoPage estabelecimentoPage;


    @Quando("for realizado um clique em Estabelcimento")
    public void forRealizadoUmCliqueEmEstabelcimento(Map<String, String> map) {
        estabelecimentoPage.selecioneEstabelecimento(map.get("estabelecimento"));

    }

}

