/**
 * Esta clase realiza las operaciones postfix deseadas por el usuario, implementando
 *  el tipo de memoria indicada en el main. Ademas, utiliza el patron de diseno 'Singleton'
 *  para asegurar que solo se instancie una vez.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */
public class CalculadoraP {
    /**
     * Se crea un objeto de si misma
     */
    private static CalculadoraP ourInstance = new CalculadoraP();

    /**
     * Este metodo sirve para devolver siempre la misma instancia de la clase creada
     * @return Devuelve la referencia hacia la clase instanciada
     */
    public static CalculadoraP getInstance() {
        return ourInstance;
    }

    /**
     * Constructor declarado privado para que no pueda ser instanciada
     */
    private CalculadoraP() {
    }

    /**
     * Metodo que se encarga de leer e interpretar las operaciones aritmeticas requeridas
     * @param expresion, contiene un String con la operacion que se quiere realizar
     * @return devuelve el resultado de la operacion matematica
     */
    public int operar(String expresion, String tipoMemoria){
        Stack<Integer> memoria = new StackArrayList<Integer>();

        int n1, n2, resultado;
        for (int i = 0; i < expresion.length(); i=i+2) {
            try {
                n1 = Integer.parseInt(String.valueOf(expresion.charAt(i)));  // Trata de convertir el texto a numero
                memoria.push(n1);  // Guarda el numero en el Stack

            } catch (NumberFormatException e){  // Cuando se encuentre con un operando
                n2 = memoria.pop();
                n1 = memoria.pop();
                String operando = String.valueOf(expresion.charAt(i));
                if (operando.equals("+")){
                    memoria.push(sumar(n1,n2));
                } else if (operando.equals("-")){
                    memoria.push(restar(n1,n2));
                } else if (operando.equals("*")){
                    memoria.push(multiplicar(n1,n2));
                } else {
                    memoria.push(dividir(n1,n2));
                }
            }
        }
        resultado = memoria.pop();
        return resultado;
    }

    /**
     * Realiza la suma de dos numeros
     * @param n1, primera expresion
     * @param n2, segunda expresion
     * @return devuelve la suma de n1 y n2
     */
    public int sumar(int n1, int n2){
        return n1+n2;
    }

    /**
     * Realiza la resta de dos numeros
     * @param n1, primera expresion
     * @param n2, segunda expresion
     * @return devuelve la resta de n1 y n2
     */
    public int restar(int n1, int n2){
        return n1-n2;
    }

    /**
     * Realiza el producto de dos numeros
     * @param n1, primera expresion
     * @param n2, segunda expresion
     * @return devuelve el producto de n1 y n2
     */
    public int multiplicar(int n1, int n2){
        return n1*n2;
    }

    /**
     * Realiza la division de dos numeros
     * @param n1, primera expresion
     * @param n2, segunda expresion
     * @return devuelve el cociente de n1 y n2
     */
    public int dividir(int n1, int n2){
        return n1/n2;
    }


}
