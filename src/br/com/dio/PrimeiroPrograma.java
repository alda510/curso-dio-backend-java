package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato Gato = new gato();
        System.out.println(Gato);
        /*int a = 565;
        int b = 3;

        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome=" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
