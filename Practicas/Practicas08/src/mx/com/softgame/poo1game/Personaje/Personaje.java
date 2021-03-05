package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private int vida;
    private String nombre;

    public Personaje (String nombre, int vida){
        this.nombre = nombre;
        this.vida = 0;
    }
    public Personaje (String nombre){
        this(nombre,3);
    }
    
    public void setNombre( String nombre){
        if (nombre.length() > 3 && nombre.length() < 10 ){
            this.nombre = nombre;
        }
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getVida(){
        return vida;
    }

    public boolean setVida(int vida){
        if(vida >= 0 && vida <= 100){
            this.vida = vida;
            return true;
        }else{
            return false;}
        }

    public void saludar(){
        System.out.println("Hola Alumno de POO" +"    "+  nombre);
    }

    public String getDetalle(){
        String detalle = "";
        detalle = nombre + "\t" + vida;
        return detalle;

    }

    public void decVida() {
        vida++;
    }
    public void decVida(int restaVida){
        vida--;
    }

}