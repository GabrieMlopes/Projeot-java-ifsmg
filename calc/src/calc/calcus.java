package calc;

import java.util.Scanner;

public class calcus {

	public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
       
        int Opcao = 0;
        double n1;
        double n2;
        double Resultado;
        while (Opcao != 5) {
            switch (Opcao) {
 

                case 1:
 

                    System.out.println("soma");
                    System.out.println("Digite o primeiro valor:");
                    n1 = op.nextDouble();
                    System.out.println("Digite segundo valor :");
                    n2 = op.nextDouble();
                    Resultado = n1 + n2;
                    System.out.println("O Resultado é:" + Resultado);
                    break;
 
//////////////////////////////////////////
                case 2:
 

                    System.out.println("Subtração");
                    System.out.println("Entre com o primeiro valor:");
                    n1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    n2 = op.nextDouble();
                    Resultado = n1 - n2;
                    System.out.println("O Resultado é:" + Resultado);
                    break;
 
////////////////////////////////////////
                case 3:
 

                    System.out.println("Multiplicação");
                    System.out.println("Entre com o primeiro valor:");
                    n1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    n2 = op.nextDouble();
                    Resultado = n1 * n2;
                    System.out.println("O Resultado é:" + Resultado);
                    break;
 //////////////////////////////////////////

                case 4:
 

                    System.out.println("Divisão");
                    System.out.println("Entre com o primeiro valor:");
                    n1 = op.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    n2 = op.nextDouble();
                    Resultado = n1 / n2;
                    System.out.println("O Resultado é:" + Resultado);
                    break;
 
///////////////////////////////////////
                case 5:
 

                    break;
 

            }
 

            System.out.println();
            System.out.println("Calculadora em java (emerson)");
            System.out.println();
            System.out.println("[1] - soma");
            System.out.println("[2] - Subtracao");
            System.out.println("[3] - Multiplicacao");
            System.out.println("[4] - Divisao");
            System.out.println("[5] - Sair");
            System.out.println();
            System.out.println("selecione Operacao desejada ");
 

            Opcao = op.nextInt();
 

            
         
        }
 

    }
 



	}


