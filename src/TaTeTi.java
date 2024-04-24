import java.util.Scanner;

public class TaTeTi {
    boolean hayGanador = false;
    Scanner scan = new Scanner(System.in);

    public void hayGanador(){
        hayGanador = true;
        scan.close();
        System.out.println("¡El ganador es: " + Jugador.turno + "!");
    }

    public void algunGanador() {
        //condiciones de victoria

        //ganador en las fila
        for(int i = 0; i <3; i++){
            if (Tablero.posiciones[i][0] == Tablero.posiciones[i][1] &&
                    Tablero.posiciones[i][1] == Tablero.posiciones[i][2] &&
                    Tablero.posiciones[i][0] != '-' ){
                System.out.println("gano porfilas");
                hayGanador();
            }
        }
        //ganador en las columnas
        for (int i = 0; i <3 ; i++){
            if (Tablero.posiciones[0][i] == Tablero.posiciones[1][i] &&
                 Tablero.posiciones[0][i] == Tablero.posiciones[2][i] &&
                    Tablero.posiciones[0][i] != '-'){
                hayGanador();
            }
        }
        //ganador en diagonal
        if ( Tablero.posiciones[0][0] == Tablero.posiciones[1][1] &&
                Tablero.posiciones[0][0] == Tablero.posiciones[2][2] &&
                Tablero.posiciones[0][0] != '-'){
            hayGanador();
        }
        if (Tablero.posiciones[0][2] == Tablero.posiciones[1][1] &&
                Tablero.posiciones[0][2] == Tablero.posiciones[2][0] &&
                Tablero.posiciones[0][2] != '-'){
            hayGanador();
        }
    }

    public void hayEmpate(){
        int contadorDeTurnos = 0;
        for (int i = 0; i <3 ;i++){
            for (int j =0; j<3; j++){
                if (Tablero.posiciones[i][j] != '-' ){
                    contadorDeTurnos++;
                }
            }
        }
        if (contadorDeTurnos ==9){
            System.out.println("Es un empate.");
        }
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
                System.out.println("Ingresa tu posicion en el eje vertical:");
                int movimientoVertical = Integer.parseInt(scan.nextLine());

                System.out.println("Ingresa tu posicion en el eje horizontal:");
                int movimientoHorizontal = Integer.parseInt(scan.nextLine());

                //comprueba si la posicion está vacia
                if (Tablero.posiciones[movimientoVertical][movimientoHorizontal] == '-') {
                    Tablero.posiciones[movimientoVertical][movimientoHorizontal] = Jugador.turno;
                } else {
                    System.out.println("Este valor ya está en uso. Vuelve a intentarlo");
                    continue;
                }

                //muestra el tablero
                Tablero.mostrarTablero();
                algunGanador();
                hayEmpate();
                Jugador.cambiarTurno();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Parece que usaste un indice de movimiento mayor a 2. Vuelve a intentarlo.");
            } catch (NumberFormatException e){
                System.out.println("Debes ingresar un numero valido entre 0 y 2 . Vuelve a intentarlo.");
            }
        }


    }
}
