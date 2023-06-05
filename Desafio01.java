import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> pontuacao = new ArrayList<>();
        List<Integer> nEntradas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nivel = null;
        Random random = new Random();
        int nRandom = 0;
        int entrada = 0;

        do  {
            System.out.println("vamos adivinhar um numero, escolha a dificuldade" +
                    "\n 1 - facil" +
                    "\n 2- medio" +
                    "\n 3- dificil" +
                    "\n 4- mestre");
            entrada = sc.nextInt();
            if (entrada == 1) {
                nRandom = random.nextInt(10);
                nivel ="Fácil";
            } else if (entrada == 2) {
                nRandom = random.nextInt(100);
                nivel = "Médio";
            } else if (entrada == 3) {
                nRandom = random.nextInt(1000);
                nivel = "Difícil";
            } else if (entrada == 4) {
                nRandom = random.nextInt(Integer.MAX_VALUE);
                nivel = "Mestre";
            } else {
                System.out.println("entrada invalida, digite um numero de 1-4 ");
                entrada = sc.nextInt();
            }
        }while(entrada <0 || entrada>5);


        System.out.println("========="+ nivel +"===========");
        while(entrada !=-1) {
            System.out.println("Adivinhe um numero, digite -1 para sair ");
            entrada=sc.nextInt();
            if (entrada != nRandom) {
                if (((entrada + 1) == nRandom) || (entrada - 1) == nRandom) {
                    pontuacao.add(5);
                    nEntradas.add(entrada);
                    System.out.println(pontuacao);
                } else {
                    pontuacao.add(0);
                    nEntradas.add(entrada);
                    System.out.println(pontuacao);
                }
            }else{
                pontuacao.add(10);
                System.out.println(pontuacao);
                nEntradas.add(entrada);
                System.out.println("voce acertou!!");
                break;
            }
        }
         int soma=0;
          for (int i=0;i<pontuacao.size();i++){
              soma +=pontuacao.get(i);
          }
            System.out.println(pontuacao);
            System.out.println("Numeros tentados: " + nEntradas);
            System.out.println("soma dos pontos: "+ soma);
            System.out.println("voce fez: " + nEntradas.size()+" tentativas");
            System.out.println("numero sorteado: " +nRandom);
        }
}
