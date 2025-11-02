// Importa pacote de funções de Array
import java.util.Arrays;

public class Shopping {
    private String nome; //-------| Nome do Shopping
    private Endereco endereco; //-| Endereço do Shopping
    private Loja[] lojas; //------| Lojas do Shopping

    public Shopping(String nome, Endereco endereco, int capacidadeMaxima) {
        this.nome = nome; //------------------------| Seta o nome do Shopping
        this.endereco = endereco; //----------------| Seta o endereços do Shopping
        this.lojas = new Loja[capacidadeMaxima]; //-| Seta as lojas do Shopping
    }

    // Retorna o Valor "Nome" do Shopping
    public String getNome() { return nome; }

    // Seta o Valor "Nome" do Shopping
    public void setNome(String nome) { this.nome = nome; }

    // Retorna o Valor "Endereço" do Shopping
    public Endereco getEndereco() { return endereco; }

    // Seta o Valor "Endereço" do Shopping
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    // Retorna o Valor "Lojas" do Shopping
    public Loja[] getLojas() { return lojas; }

    // Seta o Valor "Lojas" do Shopping
    public void setLojas(Loja[] lojas) { this.lojas = lojas; }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return "Shopping [Nome: " + nome +
                ", Endereço: " + endereco +
                ", Lojas: " + Arrays.toString(lojas) + "]";
    }

    // Insere Lojas ao Shopping
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Remove lojas do Shopping
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Retorna a quantidade de lojas de cada tipo no Dhopping
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja) {
                    case "Cosmético":
                        if (loja instanceof Cosmetico) contador++;
                        break;
                    case "Vestuário":
                        if (loja instanceof Vestuario) contador++;
                        break;
                    case "Bijuteria":
                        if (loja instanceof Bijuteria) contador++;
                        break;
                    case "Alimentação":
                        if (loja instanceof Alimentacao) contador++;
                        break;
                    case "Informática":
                        if (loja instanceof Informatica) contador++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return contador;
    }

    // Percorre as lojas de informatica e retorna o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = -1;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }
}