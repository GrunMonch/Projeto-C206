package br.inatel.c206.projeto.modulos;

import br.inatel.c206.projeto.modulos.Medico;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscreveArquivo {
    OutputStream op;
    OutputStreamWriter osw;
    BufferedWriter bw = null;

    public void Adicionar() {
        List<Medico> m = new ArrayList<Medico>();
        Scanner sc = new Scanner(System.in);

        try {
            op = new FileOutputStream("medicos.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);

            System.out.println("Entre com ID do médico : ");
            String id = sc.nextLine();
            System.out.println("Entre com nome do médico : ");
            String nome = sc.nextLine();
            System.out.println("Entre com sobrenome do médico : ");
            String sobrenome = sc.nextLine();
            System.out.println("Entre com sua especializacao : ");
            String especializacao = sc.nextLine();

            m.add(new Medico(id, nome, sobrenome, especializacao));
            bw.write(id + " " + nome + " " + sobrenome + " " + especializacao);
            bw.flush();
            bw.newLine();
            bw.close();
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