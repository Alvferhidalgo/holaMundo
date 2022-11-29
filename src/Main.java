import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean faltanRespuestas = true;
        boolean correctoUno = false;
        boolean correctoDos = false;
        boolean correctoTres = false;
        boolean correctoCuatro = false;
        boolean correctoCinco = false;

        String respuestaUno = "";
        String respuestaDos = "";
        String respuestaTres = "";
        String respuestaCuatro = "";
        String respuestaCinco = "";


        String palabraUno = "hola";
        String palabraDos = "sandwich";
        String palabraTres = "perro";
        String palabraCuatro = "adios";
        String palabraCinco = "agua";

        Scanner scanner = new Scanner(System.in);

        while (faltanRespuestas == true) {

            if (correctoUno != true) {
                System.out.println("¿Qué significa こんにちは?");
                respuestaUno = scanner.nextLine();
                if (palabraUno.equalsIgnoreCase(respuestaUno)) {
                    System.out.println("Respuesta correcta.");
                    correctoUno = true;
                } else {
                    System.out.println("Respuesta incorrecta.");
                }
            }

            if (correctoDos != true) {
                System.out.println("¿Qué significa サンドイッチ?");
                respuestaDos = scanner.nextLine();
                if (palabraDos.equalsIgnoreCase(respuestaDos)) {
                    System.out.println("Respuesta correcta");
                    correctoDos = true;
                } else {
                    System.out.println("Respuesta incorrecta");
                }
            }

            if (correctoTres != true) {
                System.out.println("¿Qué significa 犬?");
                respuestaTres = scanner.nextLine();
                if (palabraTres.equalsIgnoreCase(respuestaTres)) {
                    System.out.println("Respuesta correcta");
                    correctoTres = true;
                } else {
                    System.out.println("Respuesta incorrecta");
                }
            }

            if (correctoCuatro != true) {
                System.out.println("¿Qué significa さようなら?");
                respuestaCuatro = scanner.nextLine();
                if (palabraCuatro.equalsIgnoreCase(respuestaCuatro)) {
                    System.out.println("Respuesta correcta");
                    correctoCuatro = true;
                } else {
                    System.out.println("Respuesta incorrecta");
                }
            }

            if (correctoCinco != true) {
                System.out.println("¿Qué significa 水?");
                respuestaCinco = scanner.nextLine();
                if (palabraCinco.equalsIgnoreCase(respuestaCinco)) {
                    System.out.println("Respuesta correcta");
                    correctoCinco = true;
                } else {
                    System.out.println("Respuesta incorrecta");
                }
            }

            if (correctoUno == true && correctoDos == true && correctoTres == true &&
                    correctoCuatro == true && correctoCinco == true) {
                faltanRespuestas = false;
            }
        }
        System.out.println("Bucle out");
    }
}
