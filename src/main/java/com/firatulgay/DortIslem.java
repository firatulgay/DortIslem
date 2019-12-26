package com.firatulgay;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by FiratUlgay on 25.12.2019.
 */
public class DortIslem extends VerticalLayout {

    List<MyButton> btnList = new ArrayList<>();

    public DortIslem() {


        setSpacing(true);
        setMargin(true);
        buildButtonTable();

    }

    private void buildButtonTable() {

        for (int i = 0; i < 6; i++) {
            HorizontalLayout horizontalLayout = new HorizontalLayout();
            horizontalLayout.setSpacing(true);

            for (int j = 0; j < 6; j++) {
                MyButton button = new MyButton();

                button.getAdres().setSatir(i);
                button.getAdres().setSutun(j);

                /**
                 * KÖŞELER
                 */

                if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 0) {
                    button.setIcon(FontAwesome.CIRCLE_O_NOTCH);
                    button.setEnabled(false);

                } else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 0) {
                    button.setIcon(FontAwesome.CIRCLE_O_NOTCH);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 5) {
                    button.setIcon(FontAwesome.CIRCLE_O_NOTCH);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 5) {
                    button.setIcon(FontAwesome.CIRCLE_O_NOTCH);
                    button.setEnabled(false);

                    /**
                     * OPERATÖRLER
                     */

                } else if (button.getAdres().getSatir() == 1 && button.getAdres().getSutun() == 0) {
                    Character arti = '+';
                    button.setData(arti);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 2 && button.getAdres().getSutun() == 0) {
                    Character eksi = '-';
                    button.setData(eksi);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 3 && button.getAdres().getSutun() == 0) {
                    Character carp = 'x';
                    button.setData(carp);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 4 && button.getAdres().getSutun() == 0) {
                    Character bol = '/';
                    button.setData(bol);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 1) {
                    Character arti = '+';
                    button.setData(arti);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 2) {
                    Character eksi = '-';
                    button.setData(eksi);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 3) {
                    Character carp = 'x';
                    button.setData(carp);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                } else if (button.getAdres().getSatir() == 0 && button.getAdres().getSutun() == 4) {
                    Character bol = '/';
                    button.setData(bol);
                    button.setCaption(button.getData().toString());
                    button.addStyleName(ValoTheme.BUTTON_DANGER);
                }

                /**
                 * ALT KENARLAR
                 */
                else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 1) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 2) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 3) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 5 && button.getAdres().getSutun() == 4) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                }
                /**
                 * ÜST KENARLAR
                 */
                else if (button.getAdres().getSatir() == 1 && button.getAdres().getSutun() == 5) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 2 && button.getAdres().getSutun() == 5) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 3 && button.getAdres().getSutun() == 5) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                } else if (button.getAdres().getSatir() == 4 && button.getAdres().getSutun() == 5) {
                    String sonuc = "?";
                    button.setCaption(sonuc);
                    button.setEnabled(false);
                }

                /**
                 * İÇ BUTONLAR
                 */

                else {
                    setRandomSayi(button);
                    button.setCaption(button.getData().toString());
                }

                btnList.add(button);

                btnListener(i, j, button);
                horizontalLayout.addComponent(button);


            }
            addComponent(horizontalLayout);
        }
    }

    private void btnListener(final int i, final int j, final MyButton secilenButon) {
        secilenButon.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {


                int toplam = 0;
                int cikarma = 0;
                int bolme = 1;
                int carpma = 1;

                for (MyButton myButton : btnList) {

                    /**
                     * Yatay Toplama
                     */
                    Character arti = '+';
                    Character eksi = '-';
                    Character carp = 'x';
                    Character bol = '/';

                    int satir = myButton.getAdres().getSatir();
                    int sutun = myButton.getAdres().getSutun();
                    int secilenSatir = secilenButon.getAdres().getSatir();
                    int secilenSutun = secilenButon.getAdres().getSutun();

                    if (secilenButon.getData() == arti
                            && secilenSatir == 1
                            && secilenSutun == 0) {

                        if (satir == 1 && sutun == 1 ||
                                satir == 1 && sutun == 2 ||
                                satir == 1 && sutun == 3 ||
                                satir == 1 && sutun == 4) {

                            toplam = getToplam(toplam, myButton);
                        }
                    }
                    /**
                     * Dikey Toplama
                     */
                    else if (secilenButon.getData() == arti
                            && secilenSatir == 0
                            && secilenSutun == 1) {

                        if (satir == 1 && sutun == 1 ||
                                satir == 2 && sutun == 1 ||
                                satir == 3 && sutun == 1 ||
                                satir == 4 && sutun == 1) {

                            toplam = getToplam(toplam, myButton);
                        }
                        /**
                         * YATAY ÇIKARMA
                         */
                    } else if (secilenButon.getData() == eksi
                            && secilenSatir == 2
                            && secilenSutun == 0) {

                        if (satir == 2 && sutun == 1 ||
                                satir == 2 && sutun == 2 ||
                                satir == 2 && sutun == 3 ||
                                satir == 2 && sutun == 4) {

                            toplam = getCikarma(toplam, myButton);
                        }
                    }
                    /**
                     * DIKEY CIKARMA
                     */
                    else if (secilenButon.getData() == eksi && secilenSatir == 0
                            && secilenSutun == 2) {

                        if (satir == 1 && sutun == 2 ||
                                satir == 2 && sutun == 2 ||
                                satir == 3 && sutun == 2 ||
                                satir == 4 && sutun == 2) {

                            toplam = getCikarma(toplam, myButton);
                        }
                    }
                    /**
                     * DIKEY CARPMA
                     */
                    else if (secilenButon.getData() == carp
                            && secilenSatir == 0
                            && secilenSutun == 3) {

                        if (satir == 1 && sutun == 3 ||
                                satir == 2 && sutun == 3 ||
                                satir == 3 && sutun == 3 ||
                                satir == 4 && sutun == 3) {

                            carpma = getCarpma(carpma, myButton);
                        }
                    }
                    /**
                     * YATAY CARPMA
                     */
                    else if (secilenButon.getData() == carp
                            && secilenSatir == 3
                            && secilenSutun == 0) {

                        if (satir == 3 && sutun == 1 ||
                                satir == 3 && sutun == 2 ||
                                satir == 3 && sutun == 3 ||
                                satir == 3 && sutun == 4) {

                            carpma = getCarpma(carpma, myButton);
                        }
                    }
                    /**
                     * DİKEY BOLME
                     */
                    else if (secilenButon.getData() == bol
                            && secilenSatir == 0
                            && secilenSutun == 4) {

                        if (satir == 1 && sutun == 4 ||
                                satir == 2 && sutun == 4 ||
                                satir == 3 && sutun == 4 ||
                                satir == 4 && sutun == 4) {

                            toplam = getBolme(toplam, myButton);
                        }
                    }
                    /**
                     * YATAY BOLME
                     */
                    else if (secilenButon.getData() == bol
                            && secilenSatir == 4
                            && secilenSutun == 0) {

                        if (satir == 4 && sutun == 1 ||
                                satir == 4 && sutun == 2 ||
                                satir == 4 && sutun == 3 ||
                                satir == 4 && sutun == 4) {

                            toplam = getBolme(toplam, myButton);
                        }
                    }
                }
            }
        });
    }

    private int getBolme(int toplam, MyButton myButton) {
        int bolme;
        Integer data = (Integer) myButton.getData();
        toplam = toplam + data;
        bolme = toplam / 4;
        System.out.println(bolme);
        Notification.show(String.valueOf(bolme));
        return toplam;
    }

    private int getCarpma(int carpma, MyButton myButton) {
        Integer data = (Integer) myButton.getData();
        carpma = carpma * data;
        System.out.println(carpma);
        Notification.show(String.valueOf(carpma));
        return carpma;
    }

    private int getCikarma(int toplam, MyButton myButton) {
        int cikarma;
        Integer data = (Integer) myButton.getData();
        toplam = toplam + data;

        cikarma = -toplam;
        System.out.println(cikarma);
        Notification.show(String.valueOf(cikarma));
        return toplam;
    }

    private int getToplam(int toplam, MyButton myButton) {
        Integer data = (Integer) myButton.getData();
        toplam = toplam + data;

        System.out.println(toplam);
        Notification.show(String.valueOf(toplam));
        return toplam;
    }

    public void setRandomSayi(MyButton button) {
        Random random = new Random();
        int rnd = random.nextInt(19) - 9;
        button.setData(rnd);
    }

}
