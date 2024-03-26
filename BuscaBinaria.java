public class BuscaBinaria {
    public static void main(String[] args) {
        int[] listaNumeros = {52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                              65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                              81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int valor[] = {99, 81};

        for (int i = 0; i < valor.length; i++) {
            int value = valor[i];
            int posicao = buscaBinaria(listaNumeros, value);

            if (posicao != -1) {
                System.out.println("Número " + value + " está no índice: " + posicao);
            }
        }
    }

    public static int buscaBinaria(int[] lista, int valor) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (lista[meio] == valor) {
                return meio;
            } else if (lista[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
