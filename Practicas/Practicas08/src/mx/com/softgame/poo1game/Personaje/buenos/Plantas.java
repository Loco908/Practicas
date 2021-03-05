package mx.com.softgame.poo1game.Personaje.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Plantas extends Personaje {
    char escudo;
}
public char getEscudo() {
    return escudo;
}
public Plantas(String nombre, int vida, char escudo2){
    super(nombre,vida);
    this.escudo = escudo2;
}
public Plantas(String nombre, char escudo){
    this(nombre,3,escudo);
}