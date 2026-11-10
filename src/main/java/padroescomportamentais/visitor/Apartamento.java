package padroescomportamentais.visitor;

public class Apartamento implements Imovel {

    private int codigo;
    private String endereco;
    private int andar;

    public Apartamento(int codigo, String endereco, int andar) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.andar = andar;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getAndar() {
        return andar;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirApartamento(this);
    }

}