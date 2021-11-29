package br.inatel.c206.projeto.modulos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LerArquivo {
    InputStream is;
    InputStreamReader isr;
    BufferedReader br = null;


    public void le(){
        try {
            is = new FileInputStream("medicos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();
            System.out.println(" ---------------------------------------------------");
            System.out.println("|	ID		Nome	Sobrenome		Especialização	|");
            System.out.println(" ---------------------------------------------------");
            while(linha != null) {
                StringTokenizer st = new StringTokenizer(linha, " ");
                System.out.println("|   " +st.nextToken()+"      "+st.nextToken()+"     "+st.nextToken()+"      "+st.nextToken()+"             |");
                linha = br.readLine();
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
