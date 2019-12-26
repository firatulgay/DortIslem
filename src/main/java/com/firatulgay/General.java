package com.firatulgay;

import com.vaadin.ui.VerticalLayout;

/**
 * Created by FiratUlgay on 25.12.2019.
 */
public class General extends VerticalLayout {

    public General(){
        Header header = new Header();
        DortIslem dortIslem = new DortIslem();

        addComponent(header);
        addComponent(dortIslem);

    }


}
