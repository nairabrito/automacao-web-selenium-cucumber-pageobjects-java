#author: Naira Brito
#Data: 12/12/2021
#Descricao: Desafio para a empresa Accenture
Feature: Acessar a pagina http://sampleapp.tricentis.com/101/app.php

  #Eu quero acessar a pagina do modulo Automobile, preencher os formularios e enviar cotacao por e-mail
  Scenario: Acessar a pagina do modulo Automobile
    Given que acesso a pagina Tricentis Vehicle Insurance Application
    When preencho os formularios Vehicle Data, Insurant Data, Product Data, Price Option e Send Quote
    And envio a cotacao
    Then apresenta a mensagem Sending e-mail success!
