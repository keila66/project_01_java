public class Main
{
	public static void main(String[] args) {
	String cpf = "018.856.386-55";
    	String S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11 = "";
   	int N1, N2, N3, N4, N5, N6, N7, N8, N9, N10, N11, ver_1, ver_2;
    
    	/* vai pegar um caracter numa posição especifica da String cpf (substring)
    	e retornar um valor inteiro e guardar na var especifa (parseInt)*/
    
    	S1 = cpf.substring(0,1); N1 = Integer.parseInt(S1);  
    	S2 = cpf.substring(1,2); N2 = Integer.parseInt(S2);
    	S3 = cpf.substring(2,3); N3 = Integer.parseInt(S3);
    	S4 = cpf.substring(4,5); N4 = Integer.parseInt(S4);
    	S5 = cpf.substring(5,6); N5 = Integer.parseInt(S5);
    	S6 = cpf.substring(6,7); N6 = Integer.parseInt(S6);
    	S7 = cpf.substring(8,9); N7 = Integer.parseInt(S7);
    	S8 = cpf.substring(9,10); N8 = Integer.parseInt(S8);
    	S9 = cpf.substring(10,11); N9 = Integer.parseInt(S9);
    	S10 = cpf.substring(12,13); N10 = Integer.parseInt(S10);
    	S11 = cpf.substring(13,14); N11 = Integer.parseInt(S11);
        
    	//verificação/calculo do primeiro digito

    	ver_1 = (N1 * 10 + N2 * 9 + N3 * 8 + N4 * 7 + N5 * 6 + N6 * 5 + N7 * 4 + N8 * 3 + N9 * 2); 

    	if ((ver_1 % 11) < 2)
        	ver_1 = 0;
            
    	else  ver_1 = 11 - (ver_1 % 11);
        
    	//verificação/calculo do segundo digito
        
    	ver_2 = (N1 * 11 + N2 * 10 + N3 * 9 + N4 * 8 + N5 * 7 + N6 * 6 + N7 * 5 + N8 * 4 + N9 * 3 + ver_1 * 2);
        
    	if ((ver_2 % 11) < 2)
        	ver_2 = 0;
            
    	else  ver_2 = 11 - (ver_2 % 11);
    
    	//comparação entre os valores dos resultados dos calculos com os digitos do cpf
        
    	if (ver_1 == N10 && ver_2 == N11)
        	System.out.println("CPF válido!");
    	else 
        	System.out.println("CPF inválido, VERIFIQUE!");
	}
}