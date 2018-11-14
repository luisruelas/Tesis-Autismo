package com.example.ruelas.tesis;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;

/**
 * Created by Ruelas on 01/12/2017.
 */
public class Utilities {
    private Context context;
    private ArrayList<Instrumento>instrumentos=new ArrayList<>();
    private ArrayList<House>houses=new ArrayList<>();
    public Utilities(Context context){
        this.context=context;
        ArrayList <Integer> instrumentsCorrectAnswers=new ArrayList<>();
        instrumentsCorrectAnswers.add(R.id.btgamemarimba);
        instrumentsCorrectAnswers.add(R.id.tvgamemarimba);
        instrumentos.add(new Instrumento("La marimba suena así!",R.raw.marimba,instrumentsCorrectAnswers));
        instrumentsCorrectAnswers=new ArrayList<>();
        instrumentsCorrectAnswers.add(R.id.btgameguitarra);
        instrumentsCorrectAnswers.add(R.id.tvgameguitarra);
        instrumentos.add(new Instrumento("La guitarra suena así!",R.raw.guitarra,instrumentsCorrectAnswers));
        instrumentsCorrectAnswers=new ArrayList<>();
        instrumentsCorrectAnswers.add(R.id.btgamemaracas);
        instrumentsCorrectAnswers.add(R.id.tvgamemaracas);
        instrumentos.add(new Instrumento("Las maracas suenan así!",R.raw.maracas,instrumentsCorrectAnswers));
        instrumentsCorrectAnswers=new ArrayList<>();
        instrumentsCorrectAnswers.add(R.id.btgametambor);
        instrumentsCorrectAnswers.add(R.id.tvgametambor);
        instrumentos.add(new Instrumento("El tambor suena así!",R.raw.tambor,instrumentsCorrectAnswers));

        houses.add(new House("roja","rojo",R.id.btrojo));
        houses.add(new House("azul","azul",R.id.btazul));
        houses.add(new House("amarilla","amarillo",R.id.btamarillo));
    }
    public ArrayList<Instrumento> getInstrumentos(){
        return instrumentos;
    }
    public ArrayList<House> getHouses(){
        return houses;
    }


    public class Instrumento {
        private String name;
        private MediaPlayer sound;
        private ArrayList<Integer> answers;

        public Instrumento(String name, Integer soundId, ArrayList<Integer> correctAnswers){
            sound=MediaPlayer.create(context,soundId);
            this.name=name;
            answers=correctAnswers;
        }
        public ArrayList<Integer> getAnswers(){
            return answers;
        }
        public String getName(){
            return name;
        }
        public MediaPlayer getSoung(){
            return sound;
        }
    }

    public class House {
        private String name;
        private String color;
        private Integer answer;

        public House(String name,String color, Integer correctAnswer){
            this.name=name;
            answer=correctAnswer;
            this.color=color;
        }
        public Integer getAnswer(){
            return answer;
        }
        public String getName(){
            return name;
        }

        public String getColor() {
            return color;
        }
    }

}
