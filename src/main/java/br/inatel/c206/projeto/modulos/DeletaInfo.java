package br.inatel.c206.projeto.modulos;

import java.io.*;
import java.util.Scanner;

public class DeletaInfo {
    private String busca;

    BufferedWriter bw = null;
    BufferedReader br = null;

    Scanner sc = new Scanner(System.in);

    public void deleta(){
        try{
            File temp = new File("medicos_temp.txt");
            File txt = new File("medicos.txt");
            br = new BufferedReader(new FileReader(txt));
            bw = new BufferedWriter(new FileWriter(temp));

            System.out.println("Entre ID do médico para remover : ");
            String id = sc.nextLine();
            while((busca = br.readLine()) != null){
                if(busca.contains(id)) {
                    continue;
                }

                bw.write(busca);
                bw.flush();
                bw.newLine();
            }
            br.close();
            bw.close();
            txt.delete();
            temp.renameTo(txt);
            System.out.println("Registro deletado com sucesso");
        }catch (IOException e) {
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