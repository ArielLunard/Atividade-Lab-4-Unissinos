public class Endereco {
    private String nomeDaRua; //---| Rua do Endereço
    private String cidade; //------| Cidade do Endereço
    private String estado; //------| Estado do Endereço
    private String pais; //--------| Pais do Endereço
    private String cep; //---------| CEP do Endereço
    private String numero; //------| Numero do Endereço
    private String complemento; //-| Complemento do Endereço

    // Seta Objeto para criação
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua; //-----| Seta o "Nome da Rua" do Endereço
        this.cidade = cidade; //-----------| Seta o "Cidade" do Endereço
        this.estado = estado; //-----------| Seta o "Estado" do Endereço
        this.pais = pais; //---------------| Seta o "Pais" do Endereço
        this.cep = cep; //-----------------| Seta o "CEP" do Endereço
        this.numero = numero; //-----------| Seta o "Numero" do Endereço
        this.complemento = complemento; //-| Seta o "Complemento" do Endereço
    }

    // Retorna o "Nome da Rua" do Endereço
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    // Seta o "Nome da Rua" do Endereço
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    // Retorna o "Cidade" do Endereço
    public String getCidade() {
        return cidade;
    }

    // Seta o "Cidade" do Endereço
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Retorna o "Estado" do Endereço
    public String getEstado() {
        return estado;
    }

    // Seta o "Estado" do Endereço
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Retorna o "Pais" do Endereço
    public String getPais() {
        return pais;
    }

    // Seta o "Pais" do Endereço
    public void setPais(String pais) {
        this.pais = pais;
    }

    // Retorna o "Nome da Rua" do Endereço
    public String getCep() {
        return cep;
    }

    // Seta o "CEP" do Endereço
    public void setCep(String cep) {
        this.cep = cep;
    }

    // Retorna o "CEP" do Endereço
    public String getNumero() {
        return numero;
    }

    // Seta o "Numero" do Endereço
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Retorna o "Complemento" do Endereço
    public String getComplemento() {
        return complemento;
    }

    // Seta o "Complemento" do Endereço
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return "Endereco [Rua: " + nomeDaRua + ", Cidade: " + cidade + ", Estado: " + estado + ", País: " + pais +
                ", CEP: " + cep + ", Número: " + numero + ", Complemento: " + complemento + "]";
    }
}