/*

  __  __                             _    _   _______                                         
 |  \/  |                           | |  (_) |__   __|                                        
 | \  / | __ _ ___  __ _ _   _ _   _| | ___     | | ___ _ __ __ _ _   _  __ _ _ __ ___   __ _ 
 | |\/| |/ _` / __|/ _` | | | | | | | |/ / |    | |/ _ \ '__/ _` | | | |/ _` | '_ ` _ \ / _` |
 | |  | | (_| \__ \ (_| | |_| | |_| |   <| |    | |  __/ | | (_| | |_| | (_| | | | | | | (_| |
 |_|  |_|\__,_|___/\__,_|\__, |\__,_|_|\_\_|    |_|\___|_|  \__,_|\__, |\__,_|_| |_| |_|\__,_|
                          __/ |                                    __/ |                      
                         |___/                                    |___/         
%100 java develoment                                       
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcao_menu=1;
        
        while(opcao_menu!=0){
            SuportClass.printMercado();
            System.out.println("\nInsira a opção desejada:");
            System.out.println("------------------------");
            System.out.println("( 1 ) vendas");
            System.out.println("( 2 ) Cliente");
            System.out.println("( 3 ) Produtos");
            System.out.println("( 4 ) Relatorio");
            System.out.println("\n( 0 ) Sair\n");
            System.out.print("Opção: ");
            opcao_menu= scan.nextInt();

            if (opcao_menu==1){
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
               SuportClass.printMercado();
                System.out.println("\n___VENDAS___\n\n");
                System.out.println("( 3 ) Registrar venda");
                System.out.println("( 2 ) Ver Historico de venda");
                System.out.println("\n( 1 ) Voltar\n");
                System.out.print("Opção: ");
                opcao_menu= scan.nextInt();
            }

            if (opcao_menu==2){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                SuportClass.printMercado();
                 System.out.println("\n___CLIENTES___\n\n");
                 System.out.println("( 3 ) Cadastrar novo cliente");
                 System.out.println("( 2 ) Pesquisar Cliente");
                 System.out.println("\n( 1 ) Voltar\n");
                 System.out.print("Opção: ");
                 opcao_menu= scan.nextInt();
             }
            

             if (opcao_menu==3){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                SuportClass.printMercado();
                 System.out.println("\n___PRODUTOS___\n\n");
                 System.out.println("( 4 ) Cadastrar produto");
                 System.out.println("( 3 ) Pesquisar Produto");
                 System.out.println("( 2 ) Excluir produto");
                 System.out.println("\n( 1 ) Voltar\n");
                 System.out.print("Opção: ");
                 opcao_menu= scan.nextInt();
             }


             if (opcao_menu==4){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                SuportClass.printMercado();
                 System.out.println("\n___RELATORIO___\n\n");
                 System.out.println("( 5 ) Ver todos os produtos");
                 System.out.println("( 4 ) Produtos em falta");
                 System.out.println("( 3 ) Relatorio de Lucros");
                 System.out.println("( 2 ) Vendas do Mes\n");
                 System.out.println("\n( 1 ) Voltar\n");
                 System.out.print("Opção: ");
                 opcao_menu= scan.nextInt();
             }

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        System.out.println("\nObrigado.\nAté logo... ");
    }
}
