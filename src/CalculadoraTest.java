import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @org.junit.Test
    public void operar() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int  result = calculadora.operar(stringTest);
        assertEquals(num,result);
    }

    @org.junit.Test
    public void sumar() throws Exception {
        int operacion =calculadora.sumar(3,4);
        int result = 7;
        assertEquals(result,operacion);

    }

    @org.junit.Test
    public void restar() throws Exception {
        int operacion = calculadora.restar(100,69);
        int resultado = 31;
        assertEquals(operacion,resultado);

    }

    @org.junit.Test
    public void multiplicar() throws Exception {
        int operacion = calculadora.multiplicar(10,69);
        int resultado = 690;
        assertEquals(operacion,resultado);
    }

    @org.junit.Test
    public void dividir() throws Exception {
        int operacion = calculadora.dividir(100,10);
        int resultado = 10;
        assertEquals(operacion,resultado);
    }

}