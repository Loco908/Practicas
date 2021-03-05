package mx.com.softgame.poo1game.personaje.buenos;
import mx.com.softgame.poo1game.personajes.*;

public class Plantas extends Personaje {
    private char escudo;

    public char getEscudo() {
        return escudo;
    }
    public Plantas(String nombre, int vida, char escudo) {
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Plantas(String nombre, char escudo) {
        this(nombre,3,escudo);
    }
    public Plantas(String nombre,int vida) {
        this(nombre,vida,'A');
    }
    public String getDetalle() {
        return super.getDetalle() + " " +escudo;
    }
    public void decVida(){
        if (escudo == 'A'){
            super.decVida(2);
        }else{
            super.decVida();
        }
    }
    public void decVida(int decrementoVida){
        if(escudo == 'A'){
            super.decVida(decrementoVida*2);
        }else{
            super.decVida(decrementoVida);
        }
    }
}