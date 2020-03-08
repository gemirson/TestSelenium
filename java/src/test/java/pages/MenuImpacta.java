package pages;

import support.DriverQA;

public class MenuImpacta {
    private DriverQA driver;
    public MenuImpacta(DriverQA driver) {
        this.driver = driver;
    }

    public  void clicarMenu(String vMenu)
    {
        driver.click(vMenu);
    }
}
