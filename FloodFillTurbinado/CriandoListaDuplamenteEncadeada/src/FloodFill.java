import java.util.LinkedList;

public class FloodFill {

    public static void main(String[] args) {
        // Criar uma matriz representando a imagem
        int[][] image = {
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

        // Iniciar o Flood Fill a partir da posição (1, 1)
        floodFill(image, 1, 1, 2);

        // Imprimir a imagem após o Flood Fill
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static void floodFill(int[][] image, int startX, int startY, int newColor) {
        int oldColor = image[startX][startY];
        if (oldColor == newColor) {
            return;
        }

        int numRows = image.length;
        int numCols = image[0].length;

        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});

        while (!queue.isEmpty()) {
            int[] currentPixel = queue.poll();
            int x = currentPixel[0];
            int y = currentPixel[1];

            if (x < 0 || x >= numRows || y < 0 || y >= numCols || image[x][y] != oldColor) {
                continue;
            }

            // Atualiza o pixel para a nova cor
            image[x][y] = newColor;

            // Adiciona pixels vizinhos à fila para processamento
            queue.add(new int[]{x - 1, y});
            queue.add(new int[]{x + 1, y});
            queue.add(new int[]{x, y - 1});
            queue.add(new int[]{x, y + 1});
        }
    }
}
