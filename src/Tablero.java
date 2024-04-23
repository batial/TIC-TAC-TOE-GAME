import java.util.Arrays;

public class Tablero {
    static char [][] tablero = new char[3][3];
    public static void mostrarTablero(){
        for (int i = 0; i < 3 ; i++){
            System.out.println(tablero[i][0] + " " + tablero[i][1]+ " " + tablero[i][2]);
        }

    }

    public static void limpiarTablero(){
        for (char[] fila : tablero){
            Arrays.fill(fila,'-');
        }
    }

    public static void main(String[] args) {
        limpiarTablero();
        mostrarTablero();
    }
}
