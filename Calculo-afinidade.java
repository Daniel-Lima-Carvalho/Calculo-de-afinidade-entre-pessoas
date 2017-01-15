package distancia_entre_pontos;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Distancia_entre_pontos {

    static float calcdist(int pro[], int pes[][],int cont)
    {
	float raiz;
	int soma=0,pot,sub, i;
	for(i = 0; i<5; i++)
	{
		sub = pro[i] - pes[cont][i];//subtração.
		pot = (int) pow(sub,2);//potencia elevado a 2.
		soma = soma + pot;// soma das 5 respostas.
	}
	raiz = (float) sqrt(soma);// raiz quadradra da soma total das respostas.
	return(raiz);
    }
    
    static int validar()
    {
        Scanner teclado = new Scanner(System.in);
	int num;
	num = teclado.nextInt();
	while(num<0 || num>10)
	{
            System.out.println("numero incorreto digite entre 0 e 10: ");
            num = teclado.nextInt();
	}
	return (num);
    }
    
    public static void main(String[] args) {
        
        int r_pro[]={5,5,5,5,5},i ,cont=0, qtdpes, r_pes[][] = new int[50][5], matri[] = new int[50];
        float porcen,por_fi,dist,porc_pessoas[] = new float[50];
        String nome[] = new String[50];
        String Perguntas[] = {"\nViajar:","Ir ao cinema:","Atividade Fisica: ","Ler livros: ","Assistir TV: "};
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Afinidade entre o programador e uma pessoa\n");
        System.out.println("Questionario com 5 perguntas, respostas entre 0 e 10");
        
        System.out.println("Quantas pessoas:");
        qtdpes = teclado.nextInt();
       
	for(cont=0; cont < qtdpes; cont++)
	{
		System.out.println("\nDigite sua matricula: ");
		matri[cont] = teclado.nextInt();
	
		System.out.println("\nDigite seu nome: ");
		nome[cont]  = teclado.next();
		
                for(i=0;i<5;i++)
                {
                    System.out.println(Perguntas[i]);
                    r_pes[cont][i] = validar(); 
                }
		
                dist = calcdist(r_pro,r_pes,cont);
	
		porcen = (float) ((dist*100)/22.360680);
		por_fi = 100 - porcen;
		System.out.printf("Sua AFINIDADE com o programador e de: %.2f %% \n",por_fi);
		porc_pessoas[cont] = por_fi;
	}
        
    }
    
}
