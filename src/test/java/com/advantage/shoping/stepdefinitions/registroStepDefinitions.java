package com.advantage.shoping.stepdefinitions;

import com.advantage.shoping.exceptions.ExceptionsControl;
import com.advantage.shoping.utils.generarNumeroAleatorio;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import com.advantage.shoping.questions.validarCreacionCuenta;
import org.hamcrest.Matchers;

public class registroStepDefinitions {

    public Actor usuario = Actor.named("tester");

    @Before
    public void setup() {
        usuario.can(BrowseTheWeb.with(getDriver()));
    }
    @Dado("que esto en la pagina de inicio de Advantage Shoping")
    public void queEstoEnLaPaginaDeInicioDeAdvantageShoping() {
        usuario.wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#/"));
    }
    @Dado("que me dirijo al formulario de creacion de cuenta")
    public void queMeDirijoAlFormularioDeCreacionDeCuenta() {
        usuario.attemptsTo(com.advantage.shoping.tasks.abrirFormularioCrearCuenta.crearCuenta());
    }
    @Cuando("completo el formulacion de creacion de registro {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void completoElFormulacionDeCreacionDeRegistro(String Usuario, String correo, String contrasena, String nombre, String apellido, String numeroTelefono, String pais, String ciudad, String direccion, String estado, String codigoPostal){
        usuario.attemptsTo(com.advantage.shoping.tasks.diligenciarFormularioRegistro.completarCampos(Usuario, correo, contrasena, nombre, apellido, numeroTelefono, pais, ciudad, direccion, estado, codigoPostal));
    }
    @Entonces("valido la creacion del usuario {string}")
    public void validoLaCreacionDelUsuario(String Usuario) {
        generarNumeroAleatorio generarNumeroAleatorio = new generarNumeroAleatorio();
        usuario.should(seeThat(validarCreacionCuenta.usuario(), Matchers.equalTo(Usuario+generarNumeroAleatorio.getNumeroAleatorio())).orComplainWith(ExceptionsControl.class, ExceptionsControl.usuarioIncorrecto));
    }

    @After
    public void finalizarAutomatizacion(){
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }
}
