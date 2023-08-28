package Teste;

import estruturaDadosVetor.Vetor;

public class Aula07
{
    public static void main(String[] args)
    {
        Vetor vetor = new Vetor(8);
        vetor.add("Olá");
        vetor.add("Olá2;");
        vetor.adiciona(0, "A");
        System.out.println(vetor.toString());


    }}