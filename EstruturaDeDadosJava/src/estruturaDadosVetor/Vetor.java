package estruturaDadosVetor;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Vetor {

    private String[] elements;
    private int tamanho;

    public Vetor(int size)
    {
        this.elements = new String[size];
        this.tamanho = 0;
    }
    public void add(String information)
    {
        /*for(int i = 0; i < elements.length; i++){
            if(elements[i] == null){
                elements[i] = information;
                System.out.println("Informação adicionada com sucesso");
                break;
            }}*/
        elements[tamanho] = information;
        tamanho++;
    }

    public boolean adiciona(int posicao, String elemento)
    {

        if (!(posicao >= 0 && posicao < tamanho))
        {
            throw new IllegalArgumentException("Posição invalida!");
        }

        for(int i = this.tamanho ; i >= posicao; i--)
        {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[posicao] = elemento;
        this.tamanho++;

        return true;
    }
    public String busca(int posicao)
    {

        if (!(posicao >= 0 && posicao < tamanho))
        {
            throw new IllegalArgumentException("Posição invalida!");
        }
        return this.elements[posicao];


    }
    public int busca(String elemento)
    {
        for(int i = 0; i < this.tamanho; i++)
        {
            if(this.elements[i].equals(elemento)){

                return i;

            }
        }
        return -1;
    }



    public int tamanho()
    {
        return tamanho;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elements[this.tamanho - 1]);
        }

        return s.toString();
    }


    
    


}
