import java.util.ArrayList;
public class Controller {
    private ArrayList<Jugador> jugadores;
    public Controller(){
        jugadores=new ArrayList<>();
    }
    public boolean addJugador(String nombre,int edad){
        if(jugadores.add(new Jugador(nombre,edad))){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Jugador> getJugadores(){
        return jugadores;
    }
    public boolean isEmpty(){
        return jugadores.isEmpty();
    }
}
