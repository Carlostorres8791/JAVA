

public class dia4 {
    public static void main(String[] args) {
        //Aqui desarrollaremos el dia 4 el cual consiste en el entendimiento de los metodos en java

       saludar();//llamando a el metodo sin retorno

        int suma = sumar(5, 7);
        System.out.println("la suma es: "+suma);

        Ejemplo ejemplo = new Ejemplo();// creacion o instanciacion de un objeto para hacer uso del metodo
        System.out.println("Resultado: "+ejemplo.multiplicar(3, 4));

    }
    //metodo sin retorno
    public static void saludar(){
        System.out.println("Bienvenido a los metodos en java " +
                "\neste es un saludo desde un metodo sin retorno");
    }

    public static int sumar(int a, int b){
        return a+b; // metodo que devuleve la suma de los numeros
    }
}
