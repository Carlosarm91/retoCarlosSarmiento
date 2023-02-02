package com.advantage.shoping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static com.advantage.shoping.userInterfaces.paginaCrearCuenta.*;
import com.advantage.shoping.utils.generarNumeroAleatorio;

public class diligenciarFormularioRegistro implements Task {

    private final String usuario;
    private final String correo;
    private final String contrasena;
    private final String nombre;
    private final String apellido;
    private final String numeroTelefono;
    private final String pais;
    private final String ciudad;
    private final String direccion;
    private final String estado;
    private final String codigoPostal;

    generarNumeroAleatorio generarNumeroAleatorio = new generarNumeroAleatorio();

    public diligenciarFormularioRegistro(String usuario, String correo, String contrasena, String nombre, String apellido, String numeroTelefono, String pais, String ciudad, String direccion, String estado, String codigoPostal) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //con esta linea establezco los limites del numero aleatorio que requiero para crear un usuario siempre distinto
        generarNumeroAleatorio.setRangoNumeroAleatorio(1000,9999);
        actor.attemptsTo(
                WaitUntil.the(CAMPO_USUARIO, isPresent()).forNoMoreThan(10).seconds(),
                //a la variable usuario le concateno el numero aleatorio generado en la clase generarNumeroAleatorio
                Enter.theValue(usuario+generarNumeroAleatorio.getNumeroAleatorio()).into(CAMPO_USUARIO),
                Enter.theValue(correo).into(CAMPO_CORREO),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Enter.theValue(contrasena).into(CAMPO_REPETIR_CONTRASENA),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(numeroTelefono).into(CAMPO_NUMERO_TELEFONICO),
                Select.option(pais).from(MENU_PAIS),
                Enter.theValue(ciudad).into(CAMPO_CIUDAD),
                Enter.theValue(direccion).into(CAMPO_DIRECCION),
                Enter.theValue(estado).into(CAMPO_REGION),
                Enter.theValue(codigoPostal).into(CAMPO_CODIGO_POSTAL),
                Click.on(CHECK_YO_ACEPTO),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static diligenciarFormularioRegistro completarCampos(String usuario, String correo, String contrasena, String nombre, String apellido, String numeroTelefono, String pais, String ciudad, String direccion, String estado, String codigoPostal) {
        return Tasks.instrumented(diligenciarFormularioRegistro.class, usuario, correo, contrasena, nombre, apellido, numeroTelefono, pais, ciudad, direccion, estado, codigoPostal);
    }
}
