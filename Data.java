public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean validarData(int dia, int mes, int ano) {
        boolean valido = true;

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            valido = false;
        }

        if ((ano % 4 != 0) && (mes == 2) && (dia > 28)) {
            System.out.print("Esse não é um ano bissexto, portanto, tem no máximo 28 dias");
            valido = false;
        }

        if ((ano % 4 == 0) && (mes == 2) && (dia > 29)) {
            System.out.println("O mês de fevereiro pode ter no máximo 29 dias em anos bissextos");
            valido = false;
        }

        if (valido) {
            return true;
        } else {
            System.out.print("A data é inválida");
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Dia: " + dia +
                "\n Mês: " + mes +
                "\n Ano: " + ano;
    }

}
