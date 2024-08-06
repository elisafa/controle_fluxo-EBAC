package br.com.elisafa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Controle de notas");
        double nota = 0;

        for(int i=1; i<5; i++){
            System.out.println("Digite a nota do " + i +  "º bimestre: ");
            nota += sc.nextDouble();
        }
        double media = nota /4;

        System.out.println("A media final é: " + media);

        if (media >= 7){
            System.out.println("Aluno aprovado");
        }else if(media >=5){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
        sc.close();
    }
}
