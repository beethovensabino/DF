#language: pt

# ST = suite de teste
@Auto_01_PreencherFomularioECadastrarAutomobile @End2End
Funcionalidade: Aplicacao para seguro

  Contexto:
    Dado que o usuario esteja na pagina principal do sistema

  # CT = cenario de teste
  @Auto_01_PreencherFomularioECadastrarAutomobile
  Cenario: Preencher todos os campos e enviar todos os formulários da aplicação de seguro
    Quando eu preencher o formulario presente na aba Enter Vehicle Data e pressionar next
    E eu preencher o formulario presente na aba Enter Insurant Data e pressionar next
    E eu preencher o formulario presente na aba Enter Product Data e pressionar next
    E eu selecionar uma das opcoes presentes na aba Select Price Option e pressionar next
    E eu preencher o formulario presente na aba Send Quote e pressionar Send
    Entao o sistema retorna que o e-mail foi enviado com sucesso