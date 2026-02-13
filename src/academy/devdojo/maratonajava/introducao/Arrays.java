package academy.devdojo.maratonajava.introducao;

public class Arrays {
    static void main() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[] {1, 2, 3, 4, 5};
        int[] numeros3 = new int[3];
        numeros3[0] = 1;
        numeros3[1] = 2;
        numeros3[2] = 3;

        //For tradicional
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numeros: " + numeros[i]);
        }

        //Enhanced For (Foreach em dotnet)
        for (int num : numeros2){
            System.out.println("Numeros2: " + num);
        }
    }
}
