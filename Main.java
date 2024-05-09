import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano,dia;
		String mes;
	    
	    do{
        System.out.println("digite um ano entre 1900 e 2099");
        ano = ler.nextInt();
	    }while(ano < 1900 || ano > 2099);
	    
	    int a = ano - 1900;
        int b = a%19;
        int c = (7*b+1)/19;
        int d = (11*b+4-c)%29;
        int e = a/4;
        int f = (a+e+31-d)%7;
        int g = 25-(d+f);
        
        if(g<=0){
            mes = "março";
            dia = 31+g;
        }else{
            mes = "abril";
            dia = g;
        }
        System.out.println("A pascoa de "+ano+" é no dia "+dia+" de "+mes);
	}
}
