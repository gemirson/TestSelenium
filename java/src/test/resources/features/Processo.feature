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

    Esquema do Cenário:  Adiciona um novo processo com campos vazios
    E o usuário clicar no botão novo processo
    E o usuário digitar no campo "processo_vara" o valor "<vara>"
    E o usuário digitar no campo "processo_numero_processo" o valor "<numero_processo>"
    E o usuário digitar no campo "processo_natureza" o valor "Guarda"
    E o usuário digitar no campo "processo_partes" o valor "Joao1 x Jacionete"
    E o usuário digitar no campo "processo_data_entrada" o valor "04/02/2020"
    E o usuário digitar no campo "processo_status" o valor "Agendado"
    E o usuário selecionar no campo o valor "Sim"
    E o usuário clicar  arbitramento  com o valor Sim
    Quando o usuário clicar no botao "btn-save" na pagina de inclusao processo
    Entao  o usuario deveria ver a mensagem de erro "<mensagem>"
    Exemplos:
    |      vara             |  numero_processo| mensagem                           |
    |                       |        25       | Vara não pode ser deixado em branco |
    |       32              |                 | Numero processo não pode ser deixado em branco |


    # Com o que foi fornecido fica impossivel realizar uma operaçãode get com strong sem id ou class
   Cenário:  GET campos
     E o usuário clicar no botão "btn-show_221" na pagina de processo
     #Entao  o usuario deveria ver o  texto "Vara"



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


    Cenário: Simples DELETE  um processoo
      E o usuário clicar no botão novo processo
      E o usuário digitar no campo "processo_vara" o valor "48"
      E o usuário digitar no campo "processo_numero_processo" o valor "9867"
      E o usuário digitar no campo "processo_natureza" o valor "Guarda"
      E o usuário digitar no campo "processo_partes" o valor "Imapacta x Alunos"
      E o usuário digitar no campo "processo_data_entrada" o valor "04/02/2020"
      E o usuário digitar no campo "processo_status" o valor "Agendado"
      E o usuário selecionar no campo o valor "Sim"
      E o usuário clicar  arbitramento  com o valor Sim
      Quando o usuário clicar no botao "btn-save" na pagina de inclusao processo
      Entao  usuário deveria visualizar a mensagem de "Processo foi criado com sucesso."
      Quando o usuaŕio clicar em voltar
      Entao  o usuŕio deveria ver o texto "Imapacta x Alunos"
      Quando o usuário clicar no botao "btn-delete_" na pagina de processos
      Entao  usuário deveria visualizar a mensagem exclusao "http://agapito-server.herokuapp.com/processos?notice=Processo+foi+apagado+com+sucesso."



