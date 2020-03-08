package steps;

import cucumber.api.PendingException;
import pages.PaginaErro;
import pages.PaginaSucesso;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.Acesso;
import support.BaseSteps;

public class LoginImpactaSteps  extends BaseSteps {

    Acesso login = new Acesso(driver);
    private PaginaSucesso paginaSucesso = new  PaginaSucesso(driver);
    private PaginaErro paginaErro = new PaginaErro(driver);

    @Dado("^que o usuário está na página de login$")
    public void queOUsuarioEstáNaPáginaDeLogin() {

        login.abrirPagina();
    }

    @E("^o usuário informa no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioInformaNoCampoOValor(String nomeCampo, String valor) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.PreencherCampo(nomeCampo, valor);
    }


    @Quando("^o usuário clicar no botao login$")
    public void oUsuarioClicarNoBotaoLogin() {
        login.ClickBotaoLogin();
    }

    @Então("^usuário deveria ver a mensagem de \"([^\"]*)\"$")
    public void usuarioDeveriaVerAMensagemDe(String mensagem) throws Throwable {
       
        Assert.assertEquals(mensagem,paginaSucesso.BuscarMensagem());
    }


    @Então("^usuário deveria ver a mensagem de  erro \"([^\"]*)\"$")
    public void usuárioDeveriaVerAMensagemDeErro(String mensagem) throws Throwable {
        // Write code here that turns the phrase above into concrete actionsPag

        Assert.assertEquals(mensagem,paginaErro.BuscarMensagem());
    }
}
