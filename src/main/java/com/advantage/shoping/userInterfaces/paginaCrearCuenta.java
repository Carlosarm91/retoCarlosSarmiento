package com.advantage.shoping.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class paginaCrearCuenta {
    public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar usuario").located(By.xpath("//input[@name='usernameRegisterPage']"));
    public static final Target CAMPO_CORREO = Target.the("Campo para ingresar correo").located(By.xpath("//input[@name='emailRegisterPage']"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar contraseña").located(By.xpath("//input[@name='passwordRegisterPage']"));
    public static final Target CAMPO_REPETIR_CONTRASENA = Target.the("Campo para ingresar contraseña de nuevo").located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar nombre").located(By.xpath("//input[@name='first_nameRegisterPage']"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar apellido").located(By.xpath("//input[@name='last_nameRegisterPage']"));
    public static final Target CAMPO_NUMERO_TELEFONICO = Target.the("Campo para ingresar número de teléfono").located(By.xpath("//input[@name='phone_numberRegisterPage']"));
    public static final Target MENU_PAIS = Target.the("Menú de opciones de paises").located(By.xpath("//select[@name='countryListboxRegisterPage']"));
    public static final Target CAMPO_CIUDAD = Target.the("Campo para ingresar ciudad").located(By.xpath("//input[@name='cityRegisterPage']"));
    public static final Target CAMPO_DIRECCION = Target.the("Campo para ingresar direccion").located(By.xpath("//input[@name='addressRegisterPage']"));
    public static final Target CAMPO_REGION = Target.the("Campo para ingresar departamento o estado").located(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));
    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Campo para ingresar codigo postal").located(By.xpath("//input[@name='postal_codeRegisterPage']"));
    public static final Target CHECK_YO_ACEPTO= Target.the("Check para aceptar terminos y condiciones").located(By.xpath("//input[@name='i_agree']"));
    public static final Target BOTON_REGISTRAR= Target.the("Check para registrar datos ingresados").located(By.xpath("//button[@id='register_btnundefined']"));

}
