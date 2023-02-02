package com.advantage.shoping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static com.advantage.shoping.userInterfaces.paginaInicio.BTN_MENU_USUARIO;
import static com.advantage.shoping.userInterfaces.paginaInicio.BTN_CREAR_NUEVO;
public class abrirFormularioCrearCuenta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_MENU_USUARIO, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BTN_MENU_USUARIO),
                net.serenitybdd.screenplay.actions.Click.on(BTN_CREAR_NUEVO)
        );
    }

    public static abrirFormularioCrearCuenta crearCuenta() {
        return Tasks.instrumented(abrirFormularioCrearCuenta.class);
    }
}
