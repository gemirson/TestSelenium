#language: pt

Funcionalidade: Adicionar um novo processo

  Cenário de Fundo:
    Dado que o usuário está na página Agapito Software Testing
    E o usuário clicar no menu "processos"

  Cenário: Adicinar um novo processo com sucesso
    E o usuário clicar no botão novo processo
    E o usuário digitar no campo "processo_vara" o valor "45"
    E o usuário digitar no campo "processo_numero_processo" o valor "9867"
    E o usuário digitar no campo "processo_natureza" o valor "Guarda"
    E o usuário digitar no campo "processo_partes" o valor "Joao1 x Jacionete"
    E o usuário digitar no campo "processo_data_entrada" o valor "04/02/2020"
    E o usuário digitar no campo "processo_status" o valor "Agendado"
    E o usuário selecionar no campo o valor "Sim"
    E o usuário clicar  arbitramento  com o valor Sim
    Quando o usuário clicar no botao "btn-save" na pagina de inclusao processo
    Entao  usuário deveria visualizar a mensagem de "Processo foi criado com sucesso."

    Quando o usuaŕio clicar em voltar
    Entao  o usuŕio deveria ver o texto "Joao1 x Jacionete"


  Esquema do Cenário: Simples GET campos preenchidos corretamente
    E o usuário clicar no botão "<campo>" na pagina de processo
    E o usuŕio deveria ver o texto "<mensagem>"
    Quando o usuaŕio clicar em voltar
    Entao o usuŕio deveria ver o texto "<mensagem>"
    Exemplos:
      | campo        | mensagem          |
      | btn-show_221 | Joao1 x Jacionete |
      | btn-show_8   | Testes x Produção |



   Cenário: Simples PUT campos preenchidos corretamente
     E o usuário clicar no botão "btn-edit_221" na pagina de processo
     E o usuário digitar no campo "processo_vara" o valor "45"
     E o usuário digitar no campo "processo_numero_processo" o valor "9867"
     E o usuário digitar no campo "processo_natureza" o valor "Guarda"
     E o usuário digitar no campo "processo_partes" o valor "Joao1 x Jacionete"
     E o usuário digitar no campo "processo_data_entrada" o valor "05/02/2020"
     E o usuário digitar no campo "processo_status" o valor "Agendado"
     E o usuário selecionar no campo o valor "Sim"
     E o usuário clicar  arbitramento  com o valor Sim
     Quando o usuário clicar no botao "btn-save" na pagina de inclusao processo
     Entao  usuário deveria visualizar a mensagem de "Processo atualizado com sucesso."


     Cenário: Simples DELETE  um processo
       E o usuário digitar  processo "45"
       E o usuário clicar em delete processo




