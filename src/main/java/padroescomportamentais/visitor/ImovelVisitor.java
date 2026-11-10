package padroescomportamentais.visitor;

public class ImovelVisitor implements Visitor {

    public String exibir(Imovel imovel) {
        return imovel.aceitar(this);
    }

    @Override
    public String exibirCasa(Casa casa) {
        return "Casa{" +
                "codigo=" + casa.getCodigo() +
                ", endereco='" + casa.getEndereco() + '\'' +
                ", quartos=" + casa.getQuartos() +
                '}';
    }

    @Override
    public String exibirApartamento(Apartamento apartamento) {
        return "Apartamento{" +
                "codigo=" + apartamento.getCodigo() +
                ", endereco='" + apartamento.getEndereco() + '\'' +
                ", andar=" + apartamento.getAndar() +
                '}';
    }

}