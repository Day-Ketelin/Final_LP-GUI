package model;

import java.io.PrintStream;

public abstract class Local {

    private static int totalLocais = 0;
    protected String id;
    protected String local;
    protected String endereco;
    protected boolean disponivel;

    public Local(String id, String local, String endereco, boolean disponivel) {
        this.id = id;
        this.local = local;
        this.endereco = endereco;
        this.disponivel = true;
        totalLocais++;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }
    public void setLocais(String titulo) {
        this.local = local;
    }
    public String getEndereco(){return endereco;}

    public void setEndereco(String endereco){this.endereco = endereco;}

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public static int getTotalLocais() {
        return Local.totalLocais;
    }
    public static void cadastrar() {

    }

    @Override
    public String toString() {
        return "ID: " + id + ", Local: " + local + ", Disponível: " + disponivel;
    }
}
