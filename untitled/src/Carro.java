public class Carro {

//    Classe: É o projeto (molde) que diz que todos os carros têm:
//    Atributos (características): Marca, modelo, cor, número de portas, velocidade máxima.
//    Métodos (ações/comportamentos): Acelerar, frear, buzinar.

    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca; // 'this.marca' refere-se ao atributo da classe
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }


    // Método para ligar o carro
    public String ligar() {
        if (!ligado) {
            ligado = true;
            return marca + " " + modelo + " está agora ligado.";
        } else {
            return marca + " " + modelo + " já está ligado.";
        }
    }

    // Método para desligar o carro
    public String desligar() {
        if (ligado) {
            ligado = false;
            return marca + " " + modelo + " foi desligado.";
        } else {
            return marca + " " + modelo + " já está desligado.";
        }
    }

    // Método para verificar o status do carro
    public String status() {
        String estado = ligado ? "ligado" : "desligado";
        return marca + " " + modelo + " (" + ano + ") está " + estado + ".";
    }

}
