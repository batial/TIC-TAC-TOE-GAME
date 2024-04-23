import java.util.Arrays;

public class Tablero {
    static char [][] posiciones = new char[3][3];
    public static void mostrarTablero(){
        for (int i = 0; i < 3 ; i++){
            System.out.println(posiciones[i][0] + " " + posiciones[i][1]+ " " + posiciones[i][2]);
        }

    }

    public static void limpiarTablero(){
        for (char[] fila : posiciones){
            Arrays.fill(fila,'-');
        }
    }

    public void main(String[] args) {
        limpiarTablero();
        mostrarTablero();
    }
}
