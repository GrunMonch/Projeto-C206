package br.inatel.c206.projeto.modulos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AtualizaInfo {
    public String novoNome, novoSobre, novaEspec;

    private String id, busca, busca2;

    BufferedWriter bw = null;
    BufferedReader br = null;

    Scanner sc = new Scanner(System.in);

    public void atualiza() {
        try {
            File temp = new File("medicos_temp.txt");
            File txt = new File("medicos.txt");
            br = new BufferedReader(new FileReader(txt));
            bw = new BufferedWriter(new FileWriter(temp));

            System.out.println("Entre ID para atualizar informações : ");
            id = sc.nextLine();
            System.out.println(" ---------------------------------------------------");
            System.out.println("|	ID		Nome	Sobrenome		Especialização	|");
            System.out.println(" ---------------------------------------------------");
            while ((busca = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(busca, " ");
                if(busca.contains(id)) {
                    System.out.println("|   " + st.nextToken() + "      " + st.nextToken() + "     " + st.nextToken() + "      " + st.nextToken() + "             |");
                }else {
                    System.out.println("Médico não encontrado");
                }
            }
            System.out.println("|	                                            	|");
            System.out.println(" ---------------------------------------------------");
            br.close();

            System.out.println("Novo nome : ");
            novoNome = sc.nextLine();
            System.out.println("Novo sobrenome : ");
            novoSobre = sc.nextLine();
            System.out.println("Nova especialização : ");
            novaEspec = sc.nextLine();

            BufferedReader br2 = new BufferedReader(new FileReader(txt));
            while ((busca2 = br2.readLine()) != null) {
                if (busca2.contains(id)) {
                    bw.write(id + " " + novoNome + " " + novoSobre + " " + novaEspec);
                } else {
                    bw.write(busca2);
                }
                bw.flush();
                bw.newLine();
            }
            bw.close();
            br2.close();
            txt.delete();
            temp.renameTo(txt);
            System.out.println("Atualizado com sucesso");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}