public class Jugador {
    static char turno = 'X';

    public static void cambiarTurno() {
        if (turno == 'X') {
            turno = 'O';
        } else {
            turno = 'X';
        }
    }
}
