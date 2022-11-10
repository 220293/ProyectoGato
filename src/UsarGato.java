import java.util.Scanner;

public class UsarGato {

    public static void main(String[] args) {

        //Gato miGato = new Gato("Gato común","Calcetines","Blanco y negro",5, 35.5, 58.6, 5.75);
        int opcion;

        System.out.println("Registre su gato: ");
        System.out.println("------------------");
        Gato miGato = registrarGato();

        do{

            opcion = mostrarMenu();

            switch(opcion){
                case 1:
                    miGato.mostrarGato();
                    break;
                case 2:
                    engordarGato(miGato);
                    break;
                case 3:
                    adelgazarGato(miGato);
                    break;
                case 4:
                    miGato.cumplirAnyos();
                    System.out.println("Enhorabuena, tu gato ha cumplido un año. " +
                            "Puedes consultar su edad en la opción [1]");
                    break;
                case 5:
                    System.out.println("El peso de tu gato es de " + miGato.getPeso() +
                            " kg, así que es un gato " + miGato.clasificarGato());
                    break;
                case 6:
                    rebautizarGato(miGato);
                    break;
                case 7:
                    redimensionarGato(miGato);
                    break;
                default:
                    break;
            }
        } while (opcion!=0);

    }

    public static Gato registrarGato() {

        Scanner sc = new Scanner(System.in);
        Gato nuevoGato = new Gato();

        try {
            System.out.println("Raza del gato: ");
            nuevoGato.setRaza(sc.nextLine());
            System.out.println("Nombre del gato: ");
            nuevoGato.setNombre(sc.nextLine());
            System.out.println("Color del gato: ");
            nuevoGato.setColor(sc.nextLine());
            System.out.println("Edad del gato (en años): ");
            nuevoGato.setEdad(sc.nextInt());
            System.out.println("Altura del gato (en cm): ");
            nuevoGato.setAltura(sc.nextDouble());
            System.out.println("Longitud del gato (en cm): ");
            nuevoGato.setLongitud(sc.nextDouble());
            System.out.println("Peso del gato (en kg): ");
            nuevoGato.setPeso(sc.nextDouble());
        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }

        return nuevoGato;
    }

    public static void engordarGato(Gato miGato){

        Scanner sc = new Scanner(System.in);
        double comida;

        try{
            System.out.println("¿Cuánta comida quieres darle a tu gato (indicada en kg)?: ");
            comida = sc.nextDouble();
            miGato.engordarGato(comida);
        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }
    }

    public static void adelgazarGato(Gato miGato){

        Scanner sc = new Scanner(System.in);
        double peso;

        try {
            System.out.println("¿Cuánto peso ha perdido tu gato recientemente (en kg)?: ");
            peso = sc.nextDouble();
            miGato.adelgazarGato(peso);
        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }

    }

    public static void rebautizarGato(Gato miGato){

        Scanner sc = new Scanner(System.in);
        String nuevoNombre;

        try {
            System.out.println("¿Cómo quieres renombrar a tu gato? ");
            nuevoNombre = sc.nextLine();
            miGato.setNombre(nuevoNombre);
            System.out.println("Tu gato ha sido rebautizado");
        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }
    }

    public static void redimensionarGato(Gato miGato){

        Scanner sc = new Scanner(System.in);
        double altura, longitud;

        try{
            System.out.println("Nuevas dimensiones de tu gato: ");
            System.out.println("Altura (en cm): ");
            altura = sc.nextDouble();
            miGato.setAltura(altura);
            System.out.println("Longitud (en cm): ");
            longitud = sc.nextDouble();
            miGato.setLongitud(longitud);
            System.out.println("Tu gato ha crecido (o encogido) exitosamente");
        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }

    }

    public static int mostrarMenu(){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        try{
            System.out.println("\nMenú gatuno:");
            System.out.println("-------------");
            System.out.println("[0] - Salir");
            System.out.println("[1] - Ver datos de tu gato");
            System.out.println("[2] - Alimentar gato");
            System.out.println("[3] - Adelgazar gato");
            System.out.println("[4] - Celebrar el cumpleaños de tu gato");
            System.out.println("[5] - Clasificar gato por tamaño");
            System.out.println("[6] - Rebautizar gato");
            System.out.println("[7] - Redimensionar gato");
            System.out.println("Selecciona una opción: ");

            opcion = sc.nextInt();

        } catch (Exception e){
            System.out.println("Error. Ha introducido un dato no válido");
        }
        return opcion;
    }

}
