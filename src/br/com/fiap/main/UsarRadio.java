package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class UsarRadio {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.setEstacao(89.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(92.1f);
        System.out.printf("Estação atual: %.1fMHz \nVolume atual: %d", radio.getEstacao(), radio.getVolume());
    }
}
