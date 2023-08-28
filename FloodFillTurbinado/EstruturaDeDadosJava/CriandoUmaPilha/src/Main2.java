import java.util.*;

public class Main2 {
    public static void floodFill(int[][] matriz, int[] posicaoInicial, int novaCor) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int linhaPosicao = posicaoInicial[0];
        int colunaPosicao = posicaoInicial[1];

        Pilha<int[]> pilhazinha = new Pilha<>(linhas * colunas);

        pilhazinha.push(new int[]{linhaPosicao, colunaPosicao}); // Empilhar posição inicial

        while (!pilhazinha.isEmpty()) {
            int[] pos = pilhazinha.pop();
            linhaPosicao = pos[0];
            colunaPosicao = pos[1];

            if (linhaPosicao < 0 || linhaPosicao >= linhas || colunaPosicao < 0 || colunaPosicao >= colunas) {
                continue;
            }

            if (matriz[linhaPosicao][colunaPosicao] == 1) {
                matriz[linhaPosicao][colunaPosicao] = novaCor;
                pilhazinha.push(new int[]{linhaPosicao + 1, colunaPosicao});
                pilhazinha.push(new int[]{linhaPosicao - 1, colunaPosicao});
                pilhazinha.push(new int[]{linhaPosicao, colunaPosicao + 1});
                pilhazinha.push(new int[]{linhaPosicao, colunaPosicao - 1});
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}


        };

        int[] posicaoInicial = new int[]{2, 2};
        floodFill(matriz, posicaoInicial, 2);

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
