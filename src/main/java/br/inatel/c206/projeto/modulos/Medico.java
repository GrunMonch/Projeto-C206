package br.inatel.c206.projeto.modulos;

public class Medico {
    private String id;
    private String nome;
    private String sobrenome;
    private String especializacao;

    public Medico(String id, String nome, String sobrenome, String especializacao) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especializacao = especializacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return String.format("ID: %d Nome: %s Sobrenome: %s Especialização: %s",getId(),getNome(),getSobrenome(),getEspecializacao());
    }
}
