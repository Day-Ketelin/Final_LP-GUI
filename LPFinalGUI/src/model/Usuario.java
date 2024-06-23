package model;


import java.io.PrintStream;

public class Usuario {
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private int emprestimosAtivos;

    public Usuario(String cpf, String nome, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.nome = email;
        this.nome = telefone;
        this.emprestimosAtivos = 0;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public int getEmprestimosAtivos() {
        return this.emprestimosAtivos;
    }

    public void setEmprestimosAtivos(int emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

}
