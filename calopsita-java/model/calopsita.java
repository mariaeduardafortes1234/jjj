package main.java.com.calopstita.model;

public class Calopsita {
    // Nome da calopsita
    private String nome;
    
    // Idade da calopsita
    private int idade;
    
    // Tipo de raca: 1 = Básico, 2 = Premium
    private int raca;

    // Construtor padrão
    public Calopsita() {
    }
    
    // Construtor com parâmetros
    public Calopsita(String nome, int idade, int raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    // Métodos getter e setter
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }
    
    @Override
    public String toString() {
        String tipoRaca = raca == 1 ? "Básico" : "Premium";
        return "Calopsita{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca=" + tipoRaca +
                '}';
    }
   }