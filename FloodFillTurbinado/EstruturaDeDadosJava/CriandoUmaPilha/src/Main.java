public class Main
{
    public static void floodFill(int[][] matriz, int[] posicaoInicial, int novaCor)
    {
        int linhas = matriz.length;
        int colunas = matriz[1].length;

        int linhaPosicao = posicaoInicial[0];
        int colunaPosicao = posicaoInicial[1];

        Pilha<int[]> pilhazinha = new Pilha<>(linhas * colunas);


        while(true)
        {
            if(linhaPosicao >= linhas || linhaPosicao < 0 || colunaPosicao >= colunas || colunaPosicao < 0 )
            {
                continue;
            }
            if(matriz[linhaPosicao][colunaPosicao] == 0)
            {
                matriz[linhaPosicao][colunaPosicao] = novaCor;
                pilhazinha.push(new int[]{linhaPosicao + 1, colunaPosicao});
                pilhazinha.push(new int[]{linhaPosicao + -1, colunaPosicao});
                pilhazinha.push(new int[]{linhaPosicao, colunaPosicao + 1});
                pilhazinha.push(new int[]{linhaPosicao, colunaPosicao - 1});
                posicaoInicial = pilhazinha.getData();
            }
            else if(matriz[linhaPosicao][colunaPosicao] != 0)
            {
                pilhazinha.pop();
            }
        }







    }

    public static void main(String[] args)
    {
        int[][] matriz =
        {
            {1,1,1,1,0},
            {1,1,1,0,0},
            {1,1,0,0,0},
            {1,0,0,0,0}
        };

        int[] posicaoInicial = new int[]{2,2};
        floodFill(matriz, posicaoInicial, 2);

        for(int[] linha: matriz)
        {
            for(int valor : linha)
            {
                System.out.println(valor + " ");
            }
            System.out.println();
        }





    }
}