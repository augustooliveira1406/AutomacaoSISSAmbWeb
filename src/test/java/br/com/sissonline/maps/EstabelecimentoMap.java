package br.com.sissonline.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstabelecimentoMap{

    //TIPO ESTABELECIMENTO
    @FindBy(xpath = "//*[@id=\"item12Option\"]/li[1]")
            public WebElement tipoEstabelecimento;
    //USUÁRIO DO SISTEMA
    @FindBy(xpath = "//*[@id=\"item12Option\"]/li[11]")
            public WebElement usuarioSistema;
    @FindBy(css = "#ctl00_cphCadastro_lblTabDadosGerais")
            public WebElement btnDadosGerais;
    @FindBy(css = "#ctl00_cphCadastro_lblTabContato")
            public WebElement btnContato;
    @FindBy(css = "#ctl00_cphCadastro_lblTabDocumentos")
            public WebElement btnDocumentos;
    @FindBy(css = "#ctl00_cphCadastro_lblTabParentesco")
            public WebElement btnParentesco;
    @FindBy(css = "#ctl00_cphCadastro_lblTabVinculosEstabelecimentos")
            public WebElement btnVinculos;
    @FindBy(css = "#ctl00_cphCadastro_lblTabImpedimentos")
            public WebElement btnBloqueio;
    @FindBy(css = "#ctl00_cphCadastro_lblTabBiometria")
            public WebElement btnBiometria;
    @FindBy(css = "#ctl00_cphCadastro_lblTabCertificadoDigital")
            public WebElement btnCertificados;
    @FindBy(xpath = "//*[@id=\"grdVinculosCadastrados_DataTableButtonAdd\"]")
            public WebElement btnAdicionar;
    @FindBy(css = "#grdVinculosCadastrados_DataTableButtonEdit")
            public WebElement btnEditar;
    @FindBy(css = "#grdVinculosCadastrados_DataTableButtonRemove")
            public WebElement btnExcluir;
    @FindBy(css = "#grdVinculosCadastrados_DataTableButtonView")
            public WebElement btnVisualizar;

//Itens do Vinculo
    @FindBy(xpath = "//*[@id=\"ddlEstabelecimento\"]")
            public WebElement selectUnidade;
    @FindBy(xpath = "//*[@id=\"ddlOcupacao\"]")
            public WebElement selectOcupacao;
    @FindBy(xpath = "//*[@id=\"txtRegistroConselho\"]")
            public WebElement inpNumRegistro;
    @FindBy(xpath = "//*[@id=\"ddlRegistroConselho\"]")
            public WebElement selectConselho;
    @FindBy(xpath = "//*[@id=\"txtDataEntrada\"]")
            public WebElement inpDataEntrada;
    @FindBy(xpath = "//*[@id=\"txtMatricula\"]")
            public WebElement inpMatricula;
    @FindBy(xpath = "//*[@id=\"ddlVinculoCategoria\"]")
            public WebElement selectVinculoCategoria;
    @FindBy(xpath = "//*[@id=\"ddlVinculoTipo\"] ")
            public WebElement selecVinculoTipo;
    @FindBy(xpath = "//*[@id=\"ddlVinculoSubTipo\"] ")
            public WebElement selectVinculoSubTipo;
    @FindBy(xpath = "//*[@id=\"txtAmbulatorial\"]")
            public WebElement inpQtdAmb;
    @FindBy(xpath = "//*[@id=\"txtHospitalar\"]")
            public WebElement inpQtdHosp;
    @FindBy(xpath = "//*[@id=\"txtCargaOutros\"]")
            public WebElement inpQtdOutros;
    @FindBy(xpath = "//*[@id=\"txtCargaAgendamento\"]")
            public WebElement inpQtdAgendamentos;
    @FindBy(xpath = "//*[@id=\"txtCargaAtendimento\"]")
            public WebElement inpQtdAtendimento;
    @FindBy(xpath = "//*[@id=\"ddlHorarioTrabalho\"]")
            public WebElement selectHoraioTrabalho;
    @FindBy(xpath = "//*[@id=\"txtVigenciaInicial\"]")
            public WebElement inpVigenInicial;
    @FindBy(xpath = "//*[@id=\"ddlUnidadeOrganizacional\"] ")
            public WebElement selectUnidadeOrganizacional;
    @FindBy(xpath = "//*[@id=\"txtUODataInicial\"]")
            public WebElement inpDataInicial;
    @FindBy(xpath = "//*[@id=\"btnConfirmarVinculo\"]/table")
            public WebElement btnConfirmaVinculo;
    @FindBy(xpath = "//*[@id=\"btnCancelarBusca\"]/table")
            public WebElement btnCancelaVinculo;

//Inserindo Serviço no Vinculo
    @FindBy(xpath = "//*[@id=\"grdServicosSelecionados_DataTableButtonAdd\"]")
            public WebElement btnAdicionaServico;
    @FindBy(xpath = "//*[@id=\"grdServicosSelecionados_DataTableButtonEdit\"]")
            public WebElement btnEditarServico;
    @FindBy(xpath = "//*[@id=\"grdServicosSelecionados_DataTableButtonRemove\"]")
            public WebElement btnRemoveServico;
    @FindBy(xpath = "//*[@id=\"ddlServicosDisponiveis\"]")
            public WebElement selectServicosDisponiveis;
    @FindBy(xpath = "//*[@id=\"grdServicosSelecionados_filter\"]/input")
            public WebElement inpServico;
    @FindBy(xpath = "//*[@id=\"grdServicosSelecionados\"]/tbody/tr")
            public WebElement clickServicoSelecionado;
    @FindBy(xpath = "//*[@id=\"lblTabGeral\"]")
            public WebElement btnAbaGeral;
    @FindBy(xpath = "//*[@id=\"ddlSexoPermitido\"]")
            public WebElement selectSexo;
    @FindBy(xpath = "//*[@id=\"txtIdadeInicial\"]")
            public WebElement inpIdadeInicial;
    @FindBy(xpath = "//*[@id=\"txtIdadeFinal\"]")
            public WebElement inpIdadeFinal;
    @FindBy(xpath = "//*[@id=\"chkExibeRecepcao\"]")
            public WebElement clickRecepcao;
    @FindBy(xpath = "//*[@id=\"lblTabLocal\"]")
            public WebElement btnAbaLocal;
    @FindBy(xpath = "//*[@id=\"grdServicoLocais\"]/tbody/tr/td[2]")
            public WebElement selectServicoLocais;
    @FindBy(xpath = "//*[@id=\"lblTabExameFisico\"]")
            public WebElement btnAbaExameFisico;
    @FindBy(xpath = "//*[@id=\"lblTabProcedimento\"]")
            public WebElement btnAbaProcedimemto;
    @FindBy(xpath = "//*[@id=\"lblTabAtividades\"]")
            public WebElement btnAbaAtividades;
    @FindBy(xpath = "//*[@id=\"lblTabAutenticacao\"]")
            public WebElement btnAbaAutenticacao;
    @FindBy(xpath = "//*[@id=\"check_1\"]")
            public WebElement clickAutenticacao;
    @FindBy(xpath = "//*[@id=\"1\"]")
            public WebElement clickAutenticacao1;
    @FindBy(xpath = "//*[@id=\"lblTabDispensacao\"]")
            public WebElement btnAbaDispensacao;
    @FindBy(xpath = "//*[@id=\"chkNovoEntregaDom\"]")
            public WebElement checkNovoEntregaDom;
    @FindBy(xpath = "//*[@id=\"chkAlterarEntregaDom\"]")
            public WebElement checkAlteraEntregaDom;
    @FindBy(xpath = "//*[@id=\"chkExcluirEntregaDom\"]")
            public WebElement checkExcluirEntregaDom;
    @FindBy(xpath = "//*[@id=\"chkVisualizarEntregaDom\"]")
            public WebElement checkVisualizarEntregaDom;
    @FindBy(xpath = "//*[@id=\"lblLaboratorio\"]")
            public WebElement btnAbaLaboratorio;
    @FindBy(xpath = "//*[@id=\"lblTabFuncoesRelatorio\"]")
            public WebElement btnAbaFormularios;

    @FindBy(xpath = "//*[@id=\"grdVinculosCadastrados_filter\"]/input")
            public WebElement inpUnidadeVinculo;
    @FindBy(xpath = "grdPerfisSelecionados_DataTableButtonAdd")
            public WebElement btnAdicionaPerfil;
    @FindBy(xpath = "grdPerfisSelecionados_DataTableButtonRemove")
            public WebElement btnRemovePerfil;
    @FindBy(xpath = "//*[@id=\"ddlPerfilAcesso\"]")
            public WebElement selectPerfil;


}
