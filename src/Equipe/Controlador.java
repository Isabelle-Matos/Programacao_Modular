package Equipe;

import Terreno.Terreno;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Controlador {
    public static int tempo_jogo = 60;
    public int tempo;
    Equipe equipe;
    public Controlador(int n_robos, Terreno terreno){
        Random rand = new Random();
        this.equipe = new Equipe(n_robos);
        for(int i = 0; i < n_robos; i++){
            Robo temp = new Robo();
            temp.direcao = 'L';
            int x = rand.nextInt(terreno.x);
            int y = rand.nextInt(terreno.y);
            while(terreno.terreno[x][y].ocupada){
                x = rand.nextInt(terreno.x);
                y = rand.nextInt(terreno.y);
            }
            temp.atual = terreno.terreno[x][y];
            temp.controlador = this;
            temp.tempo = 0;
            temp.barris = 0;
            equipe.robos[i] = temp;
        }
    }
    public void play(){
        // TODO
        tempo = ThreadLocalRandom.current().nextInt(0, 20);
        System.out.println("Número aleatório: " + tempo);

    }
}
