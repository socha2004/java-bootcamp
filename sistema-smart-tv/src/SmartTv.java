/*
 *  @authot Eugenio Socha
 * @since 15/06/2024
 */


public class SmartTv{
    boolean ligada = false;
    protected int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void novoCanal(int novoCanal){
        int sintonia = 0;
        canal = novoCanal;
        sintonia++;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}