import java.util.Scanner;

public class TaTeTi {
    boolean hayGanador = false;
     Scanner scan = new Scanner(System.in);
    public void hayGanador(){
        hayGanador = true;
        scan.close();
    }
    public void jugar(){
        System.out.println("Iniciando juego");
        System.out.println("-----------".repeat(5));

        boolean turno = true;

        while (!hayGanador){
            try {
                System.out.println("Turno del jugador " + (turno ? "X." : "O." ) );
                System.out.println("Ingresa tu movimiento el eje horizontal:");
                String movimientoHorizontal = scan.nextLine();

                System.out.println("Ingresa tu movimiento el eje vertical:");
                String movimientoVertical= scan.nextLine();

            }
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

    }
}
