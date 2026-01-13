package academy.devdojo.maratonajava.introducao;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        int iWhile = 0;
        while(iWhile < 10) {
            System.out.println("While " + iWhile++);
        }

        int iDoWhile = 0;
        do {
            System.out.println("Do While " + iDoWhile++);
        } while(iDoWhile < 10);

        for(int iFor = 0; iFor < 10; iFor++){
            if(iFor >= 8){
                break;
            }
            System.out.println("For " + iFor);
        }

        //* Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //Condição: Valor da parcela a partir de 1000.

        int valorTotal = 35500;
//        int parcelas = (int) Math.ceil(valorTotal / 1000);
//        System.out.println("Parcelas: " + parcelas);

        for(int parcela = 1; parcela < valorTotal; parcela++){
            int valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Em " + parcela + "x de R$" + valorParcela);
        }


                for (int i = 1; i <= 5; i++) {
                    if (i == 3) {
                        continue;
                    }
                    System.out.println("Processando item: " + i);
                }
                System.out.println("Fim do loop.");

    }
}
