package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelVisitorTest {

    @Test
    void deveExibirCasa() {
        Casa casa = new Casa(1, "Rua A, 10", 3);

        ImovelVisitor visitor = new ImovelVisitor();
        assertEquals("Casa{codigo=1, endereco='Rua A, 10', quartos=3}", visitor.exibir(casa));
    }

    @Test
    void deveExibirApartamento() {
        Apartamento apartamento = new Apartamento(2, "Rua B, 20", 5);

        ImovelVisitor visitor = new ImovelVisitor();
        assertEquals("Apartamento{codigo=2, endereco='Rua B, 20', andar=5}", visitor.exibir(apartamento));
    }



}