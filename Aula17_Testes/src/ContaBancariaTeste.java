import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTeste {

    @Test
    void testSaldoInicial() {
        ContaBancaria conta = new ContaBancaria(1000);
        assertEquals(1000, conta.getSaldo());
    }

    @Test
    void testDepositar() {
        ContaBancaria conta = new ContaBancaria(500);
        conta.depositar(200);
        assertEquals(700, conta.getSaldo());
    }

    @Test
    void testSacar() {
        ContaBancaria conta = new ContaBancaria(500);
        conta.sacar(200);
        assertEquals(300, conta.getSaldo());
    }

    @Test
    void testSaqueComSaldoInsuficiente() {
        ContaBancaria conta = new ContaBancaria(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(200);
        });
        assertEquals("Saldo insuficiente.", exception.getMessage());
    }
}
