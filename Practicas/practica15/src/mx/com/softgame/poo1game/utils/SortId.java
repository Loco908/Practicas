package mx.com.softgame.poo1game.utils;
import java.util.Comparator;
import mx.com.softgame.poo1game.personajes.Personaje;
public class SortId implements Comparator<Personaje>{
    public int compare(Personaje o1,Personaje o2){
        return o1.getId()- o2.getId();

    }


    

}
