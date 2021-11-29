package br.inatel.c206.projeto;

import br.inatel.c206.projeto.modulos.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        EscreveArquivo esc = new EscreveArquivo();
        LerArquivo le = new LerArquivo();
        BuscaArquivo bus = new BuscaArquivo();
        DeletaInfo del = new DeletaInfo();
        AtualizaInfo atu = new AtualizaInfo();

        do {
            System.out.println("=======HOSPITAL GERAL========");
            System.out.println("=====SISTEMA DE CADASTRO=====");
            System.out.println("1. INSERIR NOVO MEDICO");
            System.out.println("2. MOSTRAR MEDICOS CADASTRADOS");
            System.out.println("3. PROCURAR MEDICO");
            System.out.println("4. REMOVER MEDICO");
            System.out.println("5. ATUALIZAR INFORMAÇÕES DO MÉDICO");
            System.out.println("6. SAIR");
            System.out.println("ENTRE COM A OPÇÃO : ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    esc.Adicionar();
                    break;
                case 2:
                    le.le();
                    break;
                case 3:
                    bus.busca();
                    break;
                case 4:
                    del.deleta();
                    break;

                case 5:
                    atu.atualiza();
                    break;
            }
        }while (op != 6) ;
    }
}