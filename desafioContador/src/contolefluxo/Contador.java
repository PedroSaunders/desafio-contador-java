package contolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
	    System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
	    System.out.println("Digite o segundo parâmetro");
	    int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("Erro "+ e.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
    }
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        else{
            System.out.println("Os parametros são válidos");
            int contagem = parametroDois - parametroUm;
            System.out.println(contagem);
            for(int i = 0; i <= contagem; i++){
                System.out.println("Numero: "+ (parametroUm));
                parametroUm++;
            }
        }

	}

	}
