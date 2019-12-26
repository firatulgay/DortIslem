package com.firatulgay;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;

/**
 * Created by FiratUlgay on 25.12.2019.
 */
public class MyButton extends Button {

    Adres adres;


    public MyButton(){

        setWidth(60, Unit.PIXELS);
        setHeight(60, Unit.PIXELS);
//        setIcon(FontAwesome.CIRCLE_O);
        adres = new Adres();
//        addStyleName(ValoTheme.BUTTON_FRIENDLY);

    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
