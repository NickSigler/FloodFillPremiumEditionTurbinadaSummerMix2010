package Teste;

import estruturaDadosVetor.Vetor;

public class Aula03
{
    public static void main(String[] args)
    {
        Vetor vetor = new Vetor(2);
        vetor.add("Olá");
        vetor.add("Olá2;");
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }



}
