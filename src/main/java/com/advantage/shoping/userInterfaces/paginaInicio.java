package com.advantage.shoping.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class paginaInicio {
    public static final Target BTN_MENU_USUARIO = Target.the("Boton del menu de usuario").located(By.xpath("//a[@id='menuUserLink']"));
    public static final Target BTN_CREAR_NUEVO = Target.the("Boton para crear una nueva cuenta").located(By.xpath("//a[@class='create-new-account ng-scope']"));
    public static final Target LABEL_USUARIO = Target.the("Label donde se visualiza el usuario logueado").located(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));

}
