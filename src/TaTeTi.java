import java.util.Arrays;
import java.util.Scanner;

public class TaTeTi {
    boolean hayGanador = false;
    Scanner scan = new Scanner(System.in);

    public void hayGanador() {


        hayGanador = true;
        scan.close();
    }

    public void jugar(){
        System.out.println("Iniciando juego");

        Tablero.limpiarTablero();
        Tablero.mostrarTablero();



        /*char turno = 'X';*/

        while (!hayGanador) {
            try {
                System.out.println("Turno del jugador " + (Jugador.turno));

                //captura de posicion por el jugador
                System.out.println("Ingresa tu posicion en el eje horizontal:");
                int movimientoHorizontal = Integer.parseInt(scan.nextLine());

                System.out.println("Ingresa tu posicion en el eje vertical:");
                int movimientoVertical = Integer.parseInt(scan.nextLine());

                //comprueba si la posicion está vacia
                if (Tablero.posiciones[movimientoHorizontal][movimientoVertical] == '-') {
                    Tablero.posiciones[movimientoHorizontal][movimientoVertical] = Jugador.turno;
                } else {
                    System.out.println("Este valor ya está en uso. Vuelve a intentarlo");
                    continue;
                }

                //muestra el tablero
                Tablero.mostrarTablero();
                Jugador.cambiarTurno();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Parece que usaste un indice de movimiento mayor a 2. Vuelve a intentarlo.");
            }
        }


    }
}
