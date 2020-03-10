package pages;

import support.DriverQA;

public class ProcessoInclusao {
    private DriverQA driver;

    public ProcessoInclusao(DriverQA driver) {
        this.driver = driver;
    }

    public  void Adicionar(String valor, String campo)
    {
        driver.sendKeys(valor,campo);
    }

    public void clicarSalvar(String botao) {
        driver.click(botao);

    }

    public void selecionarUrgencia(String valor) {
        driver.selectByText(valor,"processo_urgente");
    }

    public void selecionarArbitramento() {
        driver.click("processo_arbitramento_s");

    }
}
