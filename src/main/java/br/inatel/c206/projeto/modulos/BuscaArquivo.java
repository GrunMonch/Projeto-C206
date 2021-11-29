package br.inatel.c206.projeto.modulos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BuscaArquivo {
    private String id, busca;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br = null;

    Scanner sc = new Scanner(System.in);


    public void busca(){
        try {
            is = new FileInputStream("medicos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            System.out.println("Entre ID para procurar: ");
            id = sc.nextLine();

            System.out.println(" ---------------------------------------------------");
            System.out.println("|	ID		Nome	Sobrenome		Especialização	|");
            System.out.println(" ---------------------------------------------------");
            while((busca = br.readLine()) !=null){
                StringTokenizer st = new StringTokenizer(busca, " ");
                if(busca.contains(id)) {
                    System.out.println("|   " +st.nextToken()+"      "+st.nextToken()+"     "+st.nextToken()+"      "+st.nextToken()+"             |");
                }else {
                    System.out.println("Médico não encontrado");
                }
            }
            System.out.println("|	                                            	|");
            System.out.println(" ---------------------------------------------------");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        }
}
