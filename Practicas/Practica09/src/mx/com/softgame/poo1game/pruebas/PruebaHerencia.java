package mx.com.softgame.poo1game.pruebas;
import java.lang.Math;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class PruebaHerencia{
    public static void main(String[]args){
        Personaje [] personajes = {new Personaje("Omar",99),
        new Planta("Karen",50),
        new Zombie("Hanna",80,false),

        new Personaje("Omar",99),
        new Planta("Karen",50),
        new Zombie("Hanna",80,false)
    };
  
        for (Personaje j: personajes){
            System.out.println(j.getDetalle());
            if(j instanceof Planta){
                Planta p = (Planta)j;
                System.out.println("Soy planta"+p.getEscudo());
            }
            if(j instanceof Zombie){
                Zombie z = (Zombie)j;
                System.out.println("Soy zombie"+z.getAtaque());
            }
            int res =(int)(Math.random()*10);
            j.decVida(res);
            System.out.println(res);
            System.out.println(j.getDetalle());
           
        }
        
    }


}