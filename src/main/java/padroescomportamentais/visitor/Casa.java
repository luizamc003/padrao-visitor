package padroescomportamentais.visitor;

public class Casa implements Imovel {

    private int codigo;
    private String endereco;
    private int quartos;

    public Casa(int codigo, String endereco, int quartos) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.quartos = quartos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getQuartos() {
        return quartos;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCasa(this);
    }

}