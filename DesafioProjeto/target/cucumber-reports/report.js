$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Auto_01_PreencherFomularioECadastrarAutomobile.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Preenchimento para seguro de automovel",
  "description": "",
  "id": "preenchimento-para-seguro-de-automovel",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que o usuario esteja na pagina principal do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.queOUsuarioEstejaNaPaginaPrincipalDoSistema()"
});
formatter.result({
  "duration": 8178343600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Preencher todos os campos e enviar todos os formulários da aplicação de seguro",
  "description": "",
  "id": "preenchimento-para-seguro-de-automovel;preencher-todos-os-campos-e-enviar-todos-os-formulários-da-aplicação-de-seguro",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "eu preencher o formulario presente na aba Enter Vehicle Data e pressionar next",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "eu preencher o formulario presente na aba Enter Insurant Data e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu preencher o formulario presente na aba Enter Product Data e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "eu selecionar uma das opcoes presentes na aba Select Price Option e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "eu preencher o formulario presente na aba Send Quote e pressionar Send",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "o sistema retorna que o e-mail foi enviado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterVehicleDataEPressionarNext()"
});
formatter.result({
  "duration": 2706573500,
  "status": "passed"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterInsurantDataEPressionarNext()"
});
formatter.result({
  "duration": 2120993800,
  "status": "passed"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterProductDataEPressionarNext()"
});
formatter.result({
  "duration": 1305206600,
  "status": "passed"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euSelecionarUmaDasOpcoesPresentesNaAbaSelectPriceOptionEPressionarNext()"
});
formatter.result({
  "duration": 14323379000,
  "status": "passed"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaSendQuoteEPressionarSend()"
});
formatter.result({
  "duration": 1343574300,
  "status": "passed"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.oSistemaRetornaQueOEMailFoiEnviadoComSucesso()"
});
formatter.result({
  "duration": 13189739500,
  "status": "passed"
});
});