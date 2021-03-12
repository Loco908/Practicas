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

        int i = 0;
        while (i<personajes.length) {
            for(Personaje p : personajes){
                if(p.equals(personajes[i])){
                    System.out.println("***"+p.toString()+"es identico"+" "+personajes[i].toString()+" "+"mismos objetos"+"***");
                }
                if(p==personajes[i]){
                    System.out.println("**"+p.toString()+" " + "es identico a"+ " "+personajes[i].toString()+" "+"diferentes objetos"+"**" );
                }else{
                    System.out.println("No");
                }
            }
        }


    };
  
        
    }


}