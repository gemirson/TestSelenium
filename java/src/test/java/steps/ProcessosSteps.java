package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessosSteps extends BaseSteps {



    Home home = new Home(driver);
    MenuImpacta menu = new MenuImpacta(driver);
    GridProcessos gridProcessos= new GridProcessos(driver);
    private ProcessoInclusao processoInclusao = new ProcessoInclusao(driver) ;
    private ProcessoMostrar processoMostar = new ProcessoMostrar(driver);

    @E("^o usuário clicar no menu \"([^\"]*)\"$")
    public void oUsuarioClicarNoMenu(String vMenu) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      menu.clicarMenu(vMenu) ;
    }

    @Dado("^que o usuário está na página Agapito Software Testing$")
    public void queOUsuarioEstáNaPáginaAgapitoSoftwareTesting() {
        home.abrirPagina();
    }

    @E("^o usuário digitar no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuárioDigitarNoCampoOValor(String campo, String valor) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       processoInclusao.Adicionar(valor,campo);
    }
    @E("^o usuário clicar no botão novo processo$")
    public void oUsuarioClicarNoBotãoNovoProcesso() {
        gridProcessos.clicarNovoProcesso();
    }


    @Entao("^usuário deveria visualizar a mensagem de \"([^\"]*)\"$")
    public void usuarioDeveriaVisualizarAMensagemDe(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(mensagem, processoMostar.RecuperarMensagemDeSucesso());
    }

    @Quando("^o usuário clicar no botao \"([^\"]*)\" na pagina de inclusao processo$")
    public void oUsuárioClicarNoBotaoNaPaginaDeInclusaoProcesso(String botao) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        processoInclusao.clicarSalvar(botao);
    }

    @E("^o usuário selecionar no campo o valor \"([^\"]*)\"$")
    public void oUsuárioSelecionarNoCampoOValor(String valor) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        processoInclusao.selecionarUrgencia(valor);
    }

    @E("^o usuário clicar  arbitramento  com o valor Sim")
    public void oUsuárioClicarArbitramentoComOValorSim() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        processoInclusao.selecionarArbitramento();
    }


    @Quando("^o usuaŕio clicar em voltar$")
    public void oUsuaŕioClicarEmVoltar() {
        processoMostar.clicarVoltar();
    }

    @Entao("^o usuŕio deveria ver o texto \"([^\"]*)\"$")
    public void oUsuŕioDeveriaVerOTexto(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         Assert.assertTrue(gridProcessos.ExisteTexto(mensagem));
    }

    @E("^o usuário clicar no botão \"([^\"]*)\" na pagina de processo$")
    public void oUsuárioClicarNoBotãoNaPaginaDeProcesso(String campo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        processoMostar.MostraProcesso(campo);
    }

    @Entao("^usuário deveria visualizar a mensagem de  \"([^\"]*)\"$")
    public void usuárioDeveriaVisualizarAMensagemDe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @E("^o usuário clicar em delete processo$")
    public void oUsuárioClicarEmDeleteProcesso() {

    }

    @E("^o usuário digitar  processo \"([^\"]*)\"$")
    public void oUsuárioDigitarProcesso(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  gridProcessos.delete( gridProcessos.IdElemento(value));
    }

    @Quando("^o usuário clicar no botao \"([^\"]*)\" na pagina de processos$")
    public void oUsuárioClicarNoBotaoNaPaginaDeProcessos(String button) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       gridProcessos.delete(button + processoMostar.Id());
    }

    @Entao("^usuário deveria visualizar a mensagem exclusao \"([^\"]*)\"$")
    public void usuárioDeveriaVisualizarAMensagemExclusao(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(mensagem, processoMostar.Mensagem(mensagem));
    }
    @Entao("^o usuario deveria ver a mensagem de erro \"([^\"]*)\"$")
    public void usuárioDeveriaVeramensagemErro(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(mensagem, processoMostar.MensagemErro());
    }

    @Entao("^o usuario deveria ver o  texto \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerOTexto(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(mensagem, processoMostar.MostraCampos());
    }
}
