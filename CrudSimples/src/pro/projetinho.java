package pro;

import java.util.Scanner;

public class projetinho {

   String[] name = new String[3];
   int ent;
   int contador = 0;
   int alterar;
   int apagar;


    public projetinho(int tamanhoArray) {
        this.name = new String[tamanhoArray]; // Permite definir o tamanho da lista de ninjas ao criar o objeto
        this.contador = 0;
    }

    public void entrada (Scanner sc) {
       System.out.println("====== CADASTRO NINJA ======");
       System.out.println("1 cadastrar ninja");
       System.out.println("2 ver ninjas cadastrados");
       System.out.println("3 alterar informações");
       System.out.println("4 Deletar Ninja");
       System.out.println("5 encerrar programa");
       ent = sc.nextInt();
       sc.nextLine();
        System.out.println();

    }

    public void interfaci (Scanner sc) {
       while (ent != 5) {
          switch (ent) {

             case 1: cadastro(sc); entrada(sc);
                break;

             case 2: verninjas(); entrada(sc);
                break;

             case 3: alterar(sc);entrada(sc);
                break;

             case 4: deletar(sc); entrada(sc);
                break;

             default:
                System.out.println("Não entendi o que vocÊ digitou, tente novamente:");
                ent = sc.nextInt();
                sc.nextLine();
          }

       }


   }

    public void cadastro (Scanner sc) {

      if (contador == name.length ){
         System.out.println("Você atingiu o numero maximo de ninjas cadastrados, altere algum ninja para adicionar outro:");
      }
      else {
         System.out.println("Digite o nome do ninja:");
         name[contador] = sc.nextLine();
         contador += 1;
         System.out.println("xxxxxxx NINJA CADASTRADO COM SUCESSO xxxxxxx");
          System.out.println();


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
        System.out.println();


    }

    public void deletar (Scanner sc) {
       System.out.println("Digite o numero do Ninja que você quer Apagar:");
       apagar = sc.nextInt();
       sc.nextLine();
       name[apagar] = null;
       System.out.println("****** NINJA DELETADO COM SUCESSO ******");
       System.out.println();
       contador = apagar;

    }

    public void fim () {
       System.out.println("Encerrando programa...");
    }






}


