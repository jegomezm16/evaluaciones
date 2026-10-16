import com.asys.Solucion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolucionTest {

    // ---------- numeroPrimo ----------
    @Test
    public void primo_numeroNegativo() {
        int entrada = -8;
        boolean resultado = Solucion.numeroPrimo(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void primo_numeroCero() {
        int entrada = 0;
        boolean resultado = Solucion.numeroPrimo(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void primo_esPrimo() {
        int entrada = 17;
        boolean resultado = Solucion.numeroPrimo(entrada);
        assertEquals(true, resultado);
    }

    @Test
    public void primo_noEsPrimo() {
        int entrada = 49;
        boolean resultado = Solucion.numeroPrimo(entrada);
        assertEquals(false, resultado);
    }

    // ---------- segundoNumeroMayor ----------
    @Test
    public void segundoMayor_listaNormal() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(4, 12, 6, 9));
        int resultado = Solucion.segundoNumeroMayor(entrada);
        assertEquals(9, resultado);
    }

    @Test
    public void segundoMayor_conNegativos() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(-12, -4, -8));
        int resultado = Solucion.segundoNumeroMayor(entrada);
        assertEquals(-8, resultado);
    }

    @Test
    public void segundoMayor_conRepetidos() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(8, 8, 6, 6, 3));
        int resultado = Solucion.segundoNumeroMayor(entrada);
        assertEquals(6, resultado);
    }

    // ---------- cadenaPalindroma ----------
    @Test
    public void palindromo_frasePalindroma() {
        String entrada = "Anita lava la tina";
        boolean resultado = Solucion.cadenaPalindroma(entrada);
        assertEquals(true, resultado);
    }

    @Test
    public void palindromo_fraseNoPalindroma() {
        String entrada = "Buenos dias";
        boolean resultado = Solucion.cadenaPalindroma(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void palindromo_entradaNula() {
        String entrada = null;
        boolean resultado = Solucion.cadenaPalindroma(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void palindromo_conSignosDePuntuacion() {
        String entrada = "¡Anita, lava la tina!";
        boolean resultado = Solucion.cadenaPalindroma(entrada);
        assertEquals(true, resultado);
    }

    // ---------- encontrarDuplicados ----------
    @Test
    public void duplicados_listaNormal() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(4, 1, 7, 1, 5, 4, 9));
        ArrayList<Integer> resultado = Solucion.encontrarDuplicados(entrada);
        assertEquals(List.of(4, 1), resultado);
    }

    @Test
    public void duplicados_sinRepetidos() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(10, 20, 30, 40));
        ArrayList<Integer> resultado = Solucion.encontrarDuplicados(entrada);
        assertEquals(List.of(), resultado);
    }

    @Test
    public void duplicados_todosIguales() {
        ArrayList<Integer> entrada = new ArrayList<>(List.of(3, 3, 3, 3, 3));
        ArrayList<Integer> resultado = Solucion.encontrarDuplicados(entrada);
        assertEquals(List.of(3), resultado);
    }

    @Test
    public void duplicados_listaVacia() {
        ArrayList<Integer> entrada = new ArrayList<>();
        ArrayList<Integer> resultado = Solucion.encontrarDuplicados(entrada);
        assertEquals(List.of(), resultado);
    }

    // ---------- parentesisBalanceados ----------
    @Test
    public void parentesis_balanceados() {
        String entrada = "{[()]}";
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(true, resultado);
    }

    @Test
    public void parentesis_malAnidados() {
        String entrada = "{(})";
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void parentesis_sinCerrar() {
        String entrada = "[[[";
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void parentesis_cierreDeMas() {
        String entrada = "[]]";
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(false, resultado);
    }

    @Test
    public void parentesis_ignoraOtrosCaracteres() {
        String entrada = "suma (a + b) * [c - d]";
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(true, resultado);
    }

    @Test
    public void parentesis_entradaNula() {
        String entrada = null;
        boolean resultado = Solucion.parentesisBalanceados(entrada);
        assertEquals(false, resultado);
    }
}
