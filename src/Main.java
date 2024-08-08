public class Main {
    public static void main(String[] args) {

        /////Aula 46
        int[] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        ///Verificar elementos
        System.out.println("Elementos do array vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
        }

        ///Somar elementos
        System.out.println("Soma do array vetor: ");
        int sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }
        System.out.println(sum);

        ///Encontrar maior elemento
        System.out.println("Maior elemento do vetor: ");
        int max = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= max) {
                max = vetor[i];
            }
        }
        System.out.println(max);

        ///Reverter array
        System.out.println("Revertendo o vetor: ");
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }

        ///Adicionando elemento
        int novo = 60;
        System.out.println("\nAdicionando elemento: ");
        int[] newArray = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            newArray[i] = vetor[i];

        }
        newArray[newArray.length - 1] = novo;
        for (int i : newArray) {
            System.out.print(i + " ");
        }

        ///Remover elemento
        System.out.println("\nRemovendo elemento: ");
        int count = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == novo) {
                count++;
            }
        }
        int[] vetorR = new int[newArray.length - count];
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != novo) {
                vetorR[index++] = newArray[i];
            }
        }
        for (int i : vetorR) {
            System.out.print(i + " ");
        }

        ///Pesquisar elemento
        int elementToFind = 30;
        boolean found = false;
        System.out.println("\nPesquisando elemento 30:");
        for (int i = 0; i < vetorR.length; i++) {
            if (vetorR[i] == elementToFind) {
                found = true;
                System.out.println("Elemento encontrado na posição: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("\nElemento não encontrado.");
        }

        ///Matriz
        System.out.println("Matriz: ");
        int[][] matriz = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        for (int[] row : matriz) {
            for (int value : row) {
                System.out.println(value + "");
            }
            System.out.println();
        }

        ///Soma diagonais
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {

            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][n - 1 - i];

        }

        System.out.println("Soma da diagonal principal : " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundaria : " + somaDiagonalSecundaria);


        ///Rotacao 90Graus

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][n - 1 - j];
                matriz[i][n - 1 - j] = temp;
            }
        }
        System.out.println("Matriz rotacionada em 90 graus:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[] vetorInicializado = {1, 2, 3, 4, 5};

        String[] palavras = {"teste"};


    }
}