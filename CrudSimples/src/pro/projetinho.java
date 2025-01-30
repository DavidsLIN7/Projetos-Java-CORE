package pro;

import java.util.Scanner;

public class projetinho {

    private String[] name = new String[3];
    private int ent;
    private int contador = 0;
    private int alterar;
    private int apagar;


    public projetinho(int tamanhoArray) {
        this.name = new String[tamanhoArray]; // Permite definir o tamanho da lista de ninjas ao criar o objeto
        this.contador = 0;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getEnt() {
        return ent;
    }

    public void setEnt(int ent) {
        this.ent = ent;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getAlterar() {
        return alterar;
    }

    public void setAlterar(int alterar) {
        this.alterar = alterar;
    }

    public int getApagar() {
        return apagar;
    }

    public void setApagar(int apagar) {
        this.apagar = apagar;
    }

    public void entrada (Scanner sc) {
        System.out.println("====== CADASTRO NINJA ======");
        System.out.println("1 cadastrar ninja");
        System.out.println("2 ver ninjas cadastrados");
        System.out.println("3 alterar informações");
        System.out.println("4 Deletar Ninja");
        System.out.println("5 encerrar programa");
        ent = sc.nextInt();
        setEnt(ent);
        sc.nextLine();
        System.out.println();
    }

    public void interfaceUsuario (Scanner sc) {
        while (getEnt() != 5) {
            switch (getEnt()) {

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
                    setEnt(ent);
                    sc.nextLine();
            }
        }
    }

    public void cadastro (Scanner sc) {

        if (getContador() == name.length ){
            System.out.println("Você atingiu o numero maximo de ninjas cadastrados, altere algum ninja para adicionar outro:");
        }
        else {
            System.out.println("Digite o nome do ninja:");
            name[getContador()] = sc.nextLine();
            contador += 1;
            setContador(contador);
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
        setAlterar(alterar);
        System.out.println("Agora digite o nome do novo ninja:");
        name[getAlterar()] = sc.nextLine();
        setName(name);
        System.out.println("****** NOME ALTERADO COM SUCESSO ******");
        System.out.println();
    }

    public void deletar (Scanner sc) {
        System.out.println("Digite o numero do Ninja que você quer Apagar:");
        apagar = sc.nextInt();
        setApagar(apagar);
        sc.nextLine();
        name[getApagar()] = null;
        System.out.println("****** NINJA DELETADO COM SUCESSO ******");
        System.out.println();
        setContador(getApagar());
    }

    public void fim () {
        System.out.println("Encerrando programa...");
    }
}


