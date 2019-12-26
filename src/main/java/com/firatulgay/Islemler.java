package com.firatulgay;

import com.vaadin.ui.Notification;

import java.util.Random;

/**
 * Created by FiratUlgay on 26.12.2019.
 */
public class Islemler {

    public int getBolme(int toplam, MyButton myButton) {
        int bolme;
        Integer data = (Integer) myButton.getData();
        toplam = toplam + data;
        bolme = toplam / 4;
        System.out.println(bolme);
        Notification.show(String.valueOf(bolme));
        return bolme;
    }

    public int getCarpma(int carpma, MyButton myButton) {
        Integer data = (Integer) myButton.getData();
        carpma = carpma * data;
        System.out.println(carpma);
        Notification.show(String.valueOf(carpma));
        return carpma;
    }

    public int getCikarma(int toplam, MyButton myButton) {
        int cikarma;
        Integer data = (Integer) myButton.getData();
        toplam = toplam + data;

        cikarma = -toplam;
        System.out.println(cikarma);
        Notification.show(String.valueOf(cikarma));
        return cikarma;
    }

    public int getToplam(int toplam, MyButton myButton) {
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
