#language: pt

Funcionalidade: Tela de  login

  Cenário: Usuário valido e senha válida
  Dado que o usuário está na página de login
  E o usuário informa no campo "login" o valor "robson"
  E o usuário informa no campo "password" o valor "agapito"
  Quando o usuário clicar no botao login
  Então usuário deveria ver a mensagem de "Success Login!"



  Cenário: Usuário valido e senha invalida
    Dado que o usuário está na página de login
    E o usuário informa no campo "login" o valor "robson"
    E o usuário informa no campo "password" o valor "agapito1"
    Quando o usuário clicar no botao login
    Então usuário deveria ver a mensagem de  erro "Fail Login!"