public class Gato {

    private String raza;
    private String nombre;
    private String color;
    private int edad;
    private double altura;
    private double longitud;
    private double peso;

    public Gato(String raza, String nombre, String color, int edad, double altura,
                double longitud, double peso) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.longitud = longitud;
        this.peso = peso;
    }

    public Gato(){}

    public void mostrarGato(){
        System.out.println("\nInformación gatuna:\n");
        System.out.printf("Raza: %s\nNombre: %s\nEdad: %d\nAltura: %.2f\nLongitud: %.2f\nPeso: %.2f\n",
                this.raza,this.nombre,this.edad,this.altura,this.longitud,this.peso);
    }

    public void cumplirAnyos(){
        this.edad++;
    }

    public String clasificarGato(){
        if (this.peso < 3) {
            return "pequeño";
        } else if (this.peso >= 3 && this.peso < 6) {
            return "mediano";
        } else return "grande";
    }

    public void engordarGato(double cantidadComida){
        this.peso += cantidadComida;
        System.out.println("Has alimentado a tu gato con " + cantidadComida + " kg de comida");
    }

    public void adelgazarGato(double cantidad){
        this.peso -= cantidad;
        System.out.println("Tu gato ha adelgazado " + cantidad + " kg");
    }

    // Getters
    public String getRaza(){
        return this.raza;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getColor(){
        return this.color;
    }

    public int getEdad(){
        return this.edad;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getLongitud(){
        return this.longitud;
    }

    public double getPeso(){
        return this.peso;
    }

    // Setters
    public void setRaza(String raza){
        this.raza = raza;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLongitud(double longitud){
        this.longitud = longitud;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

}

