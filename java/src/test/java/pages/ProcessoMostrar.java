package pages;

import jdk.nashorn.internal.runtime.Debug;
import support.DriverQA;

public class ProcessoMostrar {

    private DriverQA driver;

    private String currentId;

    public ProcessoMostrar(DriverQA driver) {
        this.driver = driver;
    }

    public String RecuperarMensagemDeSucesso() {
        return  driver.getText("notice");
    }

    public void clicarVoltar() {
        currentId = driver.getId();
        driver.click(".ls-btn-primary-danger","css");

    }

    public void MostraProcesso(String campo) {
        driver.click(campo);
    }

    public  String Id(){ return  currentId;}

    public  String  Mensagem(String url) throws InterruptedException {
        driver.ChooseOkOnNextConfirmation();
        driver.GetMensagem(url);
        String s= driver.getCurrentURL();
        return  s;

    }
}
