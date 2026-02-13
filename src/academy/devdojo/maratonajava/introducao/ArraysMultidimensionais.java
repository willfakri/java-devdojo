package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    static void main() {

        // Array 1: dia
        // Array 2: hábito {0: Levantar Cedo, 1: Exercícios, 2: Leitura }
        // Valor: 0: Não, 1: Sim
        int[][] habitos = new int[5][3];

        habitos[0][0] = 1;
        habitos[0][1] = 0;
        habitos[0][2] = 1;

        habitos[1][0] = 1;
        habitos[1][1] = 1;
        habitos[1][2] = 0;

        habitos[2][0] = 0;
        habitos[2][1] = 1;
        habitos[2][2] = 1;

        habitos[3][0] = 1;
        habitos[3][1] = 1;
        habitos[3][2] = 1;

        habitos[4][0] = 0;
        habitos[4][1] = 0;
        habitos[4][2] = 0;

        for (int i = 0; i < habitos.length; i++){
            for (int j = 0; j < habitos[i].length; j++){
                System.out.println("Dia: " + i + ". Hábito: " + j + ". Status: " + ((habitos[i][j] == 1) ? "✅" : "❌"));
            }
            System.out.println();
        }

        for(int[] arrayBase : habitos){
            for(int numero : arrayBase){
                System.out.println(numero);
            }
        }

        //Podemos ter arrays onde cada array tem um tamanho diferente
        int[][] arrayMulti = new int[3][];
        arrayMulti[0] = new int[2];
        arrayMulti[1] = new int[]{1,2,3};
        arrayMulti[2] = new int[4];


    }

}
