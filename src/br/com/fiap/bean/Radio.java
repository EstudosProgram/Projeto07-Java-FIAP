package br.com.fiap.bean;

//Usando a classe privada

public class Radio {
    //atributos
    private int volume;
    private float estacao;

    //métodos getters/setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 100) {

            } else {
                throw new Exception("Volume fora da faixa permitida (min = 0 e max = 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.volume = volume;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        try {
            if (estacao >= 80.0  && estacao <= 105.0) {

            } else {
                throw new Exception("Estação fora da faixa permitida (min = 80.0 e max = 105.0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.volume = volume;
        this.estacao = estacao;

    }

    //métodos da classe(particulares)
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 100) {
            volume--;
        }

    }
}
