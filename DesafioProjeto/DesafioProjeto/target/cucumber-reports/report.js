$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Auto_01_PreencherFomularioECadastrarAutomobile.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 3,
      "value": "# ST \u003d suite de teste"
    }
  ],
  "line": 5,
  "name": "Aplicacao para seguro",
  "description": "",
  "id": "aplicacao-para-seguro",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@Auto_01_PreencherFomularioECadastrarAutomobile"
    },
    {
      "line": 4,
      "name": "@End2End"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que o usuario esteja na pagina principal do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.queOUsuarioEstejaNaPaginaPrincipalDoSistema()"
});
formatter.result({
  "duration": 289302000,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Gancho.abrirUrl(Gancho.java:31)\r\n\tat Steps.Auto_01_PreencherFormularioECadastrarAutomobile.queOUsuarioEstejaNaPaginaPrincipalDoSistema(Auto_01_PreencherFormularioECadastrarAutomobile.java:23)\r\n\tat ✽.Dado que o usuario esteja na pagina principal do sistema(Auto_01_PreencherFomularioECadastrarAutomobile.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "# CT \u003d cenario de teste"
    }
  ],
  "line": 12,
  "name": "Preencher todos os campos e enviar todos os formulários da aplicação de seguro",
  "description": "",
  "id": "aplicacao-para-seguro;preencher-todos-os-campos-e-enviar-todos-os-formulários-da-aplicação-de-seguro",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@Auto_01_PreencherFomularioECadastrarAutomobile"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "eu preencher o formulario presente na aba Enter Vehicle Data e pressionar next",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "eu preencher o formulario presente na aba Enter Insurant Data e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "eu preencher o formulario presente na aba Enter Product Data e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "eu selecionar uma das opcoes presentes na aba Select Price Option e pressionar next",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu preencher o formulario presente na aba Send Quote e pressionar Send",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "o sistema retorna que o e-mail foi enviado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterVehicleDataEPressionarNext()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterInsurantDataEPressionarNext()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaEnterProductDataEPressionarNext()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euSelecionarUmaDasOpcoesPresentesNaAbaSelectPriceOptionEPressionarNext()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.euPreencherOFormularioPresenteNaAbaSendQuoteEPressionarSend()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Auto_01_PreencherFormularioECadastrarAutomobile.oSistemaRetornaQueOEMailFoiEnviadoComSucesso()"
});
formatter.result({
  "status": "skipped"
});
});