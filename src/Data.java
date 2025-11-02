public class Data {
    private int dia; //-|Dia da Data
    private int mes; //-|Mes da Data
    private int ano; //-|Ano da Data

    // Seta Objeto para criação
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia; //-| Seta o "Dia" da Data
            this.mes = mes; //-| Seta o "Mês" da Data
            this.ano = ano; //-| Seta o "Ano" da Data
        } else {
            // Retorna que a data informada é invalida e seta default 1/1/2000
            System.out.println("Data inválida. Atribuindo valor padrão: 1/1/2000.");
            this.dia = 1; //----| Seta o "Dia" default da Data
            this.mes = 1; //----| Seta o "Mês" default da Data
            this.ano = 2000; //-| Seta o "Ano" default da Data
        }
    }

    // Retorna o Valor "Dia" da Data
    public int getDia() {
        return dia;
    }

    // Seta o Valor "Dia" da Data
    public void setDia(int dia) {
        this.dia = dia;
    }

    // Retorna o Valor "Mês" da Data
    public int getMes() {
        return mes;
    }

    // Seta o Valor "Mês" da Data
    public void setMes(int mes) {
        this.mes = mes;
    }

    // Retorna o Valor "Ano" da Data
    public int getAno() {
        return ano;
    }

    // Seta o Valor "Ano" da Data
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Modifica o Retorno do Objeto quando Solicitado
    @Override
    public String toString() {
        return "Data [" + dia + "/" + mes + "/" + ano + "]";
    }

    // Verifica se o ano analisado é Bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Valida se o dia colocado não ultrapassa o ultimo de cada mês
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        int[] diasPorMes = {31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia > 0 && dia <= diasPorMes[mes - 1];
    }
}