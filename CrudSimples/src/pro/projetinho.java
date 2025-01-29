package pro;

import java.util.Scanner;

public class projetinho {

   String[] name = new String[3];
   int ent;
   int contador = 0;
   int alterar;


    public void entrada (Scanner sc) {
       System.out.println("====== CADASTRO NINJA ======");
       System.out.println("1 cadastrar ninja");
       System.out.println("2 ver ninjas cadastrados");
       System.out.println("3 alterar informações");
       System.out.println("4 encerrar programa");
       ent = sc.nextInt();
       sc.nextLine();

    }

    public void interfaci (Scanner sc) {
       while (ent != 4) {
          switch (ent) {

             case 1: cadastro(sc); entrada(sc);
                break;

             case 2: verninjas(); entrada(sc);
                break;

             case 3: alterar(sc);entrada(sc);
                break;

             case 4:
                /*  System.out.println("Encerrando programa...");*/
                break;

             default:
                System.out.println("Não entendi o que vocÊ digitou, tente novamente:");
                ent = sc.nextInt();
                sc.nextLine();
          }

       }


   }

    public void cadastro (Scanner sc) {

      if (contador == 3 ){
         System.out.println("Você atingiu o numero maximo de ninjas cadastrados, altere algum ninja para adicionar outro:");
      }
      else {
         System.out.println("Digite o nome do ninja:");
         name[contador] = sc.nextLine();
         contador += 1;
         System.out.println("xxxxxxx NINJA CADASTRADO COM SUCESSO xxxxxxx");


      }
    }

    public void verninjas () {
       for (int i = 0; i < name.length; i++) {
           if (name[i] != null) {
               System.out.println("Ninja " + i + " = " + name[i]);
           }

       }
    }


    public void alterar (Scanner sc) {
       System.out.println("Digite o numero do Ninja que você quer alterar:");
       alterar = sc.nextInt();
       sc.nextLine();
       System.out.println("Agora digite o nome do novo ninja:");
       name[alterar] = sc.nextLine();
       System.out.println("****** NOME ALTERADO COM SUCESSO ******");


    }

    public void fim () {
       System.out.println("Encerrando programa...");
    }






}


