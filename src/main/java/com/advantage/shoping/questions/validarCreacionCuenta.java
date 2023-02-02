package com.advantage.shoping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static  com.advantage.shoping.userInterfaces.paginaInicio.LABEL_USUARIO;

public class validarCreacionCuenta implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LABEL_USUARIO, isPresent()).forNoMoreThan(10).seconds();
        return the(LABEL_USUARIO).answeredBy(actor).getText();
    }

    public static Question<String> usuario(){
        return new validarCreacionCuenta();
    }
}
