package br.com.sissonline.pages;

import br.com.sissonline.core.Driver;
import br.com.sissonline.maps.EstabelecimentoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EstabelecimentoPage {
    private WebDriver driver;
    private EstabelecimentoMap estabelecimentoMap;

    public EstabelecimentoPage(WebDriver driver) {
        this.driver = driver;
        estabelecimentoMap = new EstabelecimentoMap();
        PageFactory.initElements(driver, estabelecimentoMap);
    }
//TIPO ESTABELECIMENTO
    public void clickTipoEstabelecimento(){
        estabelecimentoMap.tipoEstabelecimento.click();
    }

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
    public void clickUsuarioSistema(){
        estabelecimentoMap.usuarioSistema.click();
    }
    public void clickVinculo(){
        estabelecimentoMap.btnVinculos.click();
    }
    public void clickBotaoAdicionar(){
        estabelecimentoMap.btnAdicionar.click();
    }
    public void clickBotaoEditar(){
        estabelecimentoMap.btnEditar.click();
    }
    public void clickBotaoExcluir(){
        estabelecimentoMap.btnExcluir.click();
    }
    public void clickBotaoVisualizar(){
        estabelecimentoMap.btnVisualizar.click();;
    }
    public void pesquisaVinculo(){
        estabelecimentoMap.inpUnidadeVinculo.sendKeys();
    }
    public void selecioneEstabelecimento(String unidade){
        Select select = new Select(estabelecimentoMap.selectUnidade);
        Driver.aguardaOptions(select);
        select.deselectByVisibleText(unidade);
    }



    public void selecioneOcupacao(){
        estabelecimentoMap.selectOcupacao.click();
    }
    public void insereRegistro(){
        estabelecimentoMap.inpNumRegistro.click();
    }
    public void selecioneConselho(){
        estabelecimentoMap.selectConselho.click();
    }
    public void insereDataEntrada(){
        estabelecimentoMap.inpDataEntrada.click();
    }
    public void insereMatricula(){
        estabelecimentoMap.inpMatricula.click();
    }
    public void selecioneVinculoCategoria(){
        estabelecimentoMap.selectVinculoCategoria.click();
    }
    public void selecioneVinculoTipo(){
        estabelecimentoMap.selecVinculoTipo.click();
    }
    public void selecioneVInculoSubTipo(){
        estabelecimentoMap.selectVinculoSubTipo.click();
    }
    public void insereAmbulatorial(){
        estabelecimentoMap.inpQtdAmb.click();
    }
    public void insereHospitalar(){
        estabelecimentoMap.inpQtdHosp.click();
    }
    public void insereOutros(){
        estabelecimentoMap.inpQtdOutros.click();
    }
    public void insereAgendamento(){
        estabelecimentoMap.inpQtdAgendamentos.click();
    }
    public void insereAtendimento(){
        estabelecimentoMap.inpQtdAtendimento.click();
    }
    public void selecioneEscala(){
        estabelecimentoMap.selectHoraioTrabalho.click();
    }
    public void selecioneUnidadeOrganizacional(){
        estabelecimentoMap.selectUnidadeOrganizacional.click();
    }
    public void insereVigenciaInicial(){
        estabelecimentoMap.inpVigenInicial.click();
    }
    public void insereDataInicial(){
        estabelecimentoMap.inpDataInicial.click();
    }
     public void clickConfirmar(){
        estabelecimentoMap.btnConfirmaVinculo.click();
     }
     public void clickCancelar(){
        estabelecimentoMap.btnCancelaVinculo.click();
     }
     public void clickAdicionarServico(){
        estabelecimentoMap.btnAdicionaServico.click();
     }
     public void clickEditarSevico(){
        estabelecimentoMap.btnEditarServico.click();
     }
     public void clickExcluirServico(){
        estabelecimentoMap.btnRemoveServico.click();
     }
     public void escolheServico(){
        estabelecimentoMap.clickServicoSelecionado.click();
     }
     public void selecioneServico(){
        estabelecimentoMap.selectServicosDisponiveis.click();
     }
     public void clickAbaGeral(){
        estabelecimentoMap.btnAbaGeral.click();
     }
     public void clickAbaLocal(){
        estabelecimentoMap.btnAbaLocal.click();
     }
     public void clickAbaExameFisico(){
        estabelecimentoMap.btnAbaExameFisico.click();
     }
     public void clickProcedimento(){
        estabelecimentoMap.btnAbaProcedimemto.click();
     }
     public void clickAtividades(){
         estabelecimentoMap.btnAbaAtividades.click();
     }
     public void clickAutenticacao(){
        estabelecimentoMap.btnAbaAutenticacao.click();
     }
     public void clickLaboratorio(){
        estabelecimentoMap.btnAbaLaboratorio.click();
     }
     public void clickFormularios(){
        estabelecimentoMap.btnAbaFormularios.click();
     }
     public void selecioneSexo(){
        estabelecimentoMap.selectSexo.click();
     }
     public void insereIdadeInicial(){
        estabelecimentoMap.inpIdadeInicial.click();
     }
     public void insereIdadeFinal(){
        estabelecimentoMap.inpIdadeFinal.click();
     }
     public void checkRecepcao(){
        estabelecimentoMap.clickRecepcao.click();
     }
    public void clickLocal(){
        estabelecimentoMap.selectServicoLocais.click();
    }
    public void clickCartaoAcesso(){
        estabelecimentoMap.clickAutenticacao.click();
    }
    public void clickPadrao(){
        estabelecimentoMap.clickAutenticacao1.click();
    }
    public void clickDispensacao(){
        estabelecimentoMap.btnAbaDispensacao.click();
    }
    public void clickCheckNovo(){
        estabelecimentoMap.checkNovoEntregaDom.click();
    }
    public void clickCheckAlterar(){
        estabelecimentoMap.checkAlteraEntregaDom.click();
    }
    public void clickCheckExcluir(){
        estabelecimentoMap.checkExcluirEntregaDom.click();
    }
    public void clickCheckPesquisar(){
        estabelecimentoMap.checkVisualizarEntregaDom.click();
    }


//AREA MEDICA

//INSTALAÇÃO PREDIAL

//GERENCIAMENTO

//ESPECIALIDADE

//CONFIGURAÇÃO DE GESTAO DE FilA

//TOTEM EMISSOR DE SENHA


}