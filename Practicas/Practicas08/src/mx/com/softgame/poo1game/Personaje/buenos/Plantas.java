package mx.com.softgame.poo1game.personaje.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Plantas extends Personaje {
    char escudo;

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
}