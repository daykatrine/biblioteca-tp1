public class Main {
    public static void main(String[] args) {

        int prazoDias = 14;
        double multaPorDia = 3.2;
        int limiteEmprestimos = 3;
        int diasAtraso = 4;
        int emprestimosAtivos = 2;

        double valorMulta = multaPorDia * diasAtraso;


        System.out.printf("Valor da Multa %.2f\n",  valorMulta);

        if (emprestimosAtivos < limiteEmprestimos){
            System.out.println("Empréstimo Permitido");
        }
        else {
            System.out.println("Empréstimo Recusado");
        }

    }
}