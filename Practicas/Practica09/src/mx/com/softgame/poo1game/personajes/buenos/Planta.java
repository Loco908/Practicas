package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class Planta extends Personaje{
    protected char escudo;
    public Planta(String nombre,int vida,char escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Planta(String nombre,char escudo){
        this(nombre,3,escudo);
    }
    public Planta(String nombre,int vida){
        this(nombre,vida,'A');
    }
    public Planta(String nombre){
        this(nombre,3,'A');
    }
    public void decVida(){
        if(escudo == 'A'){
            super.decVida(2);
        }
    }
    public void decVida(int menosVida){
        if(escudo == 'A'){
            super.decVida(menosVida*2);
        }
        
    }
    public char getEscudo(){
        return escudo;
    } 
    public String toString(){
        return super.toString()+escudo;
    }
    public boolean equals(Object obj){
        //if(escudo == other.escudo) {
        if( obj instanceof Personaje){
            Personaje tmpPersonaje = (Personaje)obj;
            if(this.escudo.equals(tmpPersonaje) && this.escudo.equals(tmpPersonaje.escudo)){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }

}