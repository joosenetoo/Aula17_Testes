public class MainEstruturado {

    // Funções para manipular os carros
    public static void acelerar(int[] velocidade, int incremento) {
        velocidade[0] += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade[0] + " km/h");
    }

    public static void frear(int[] velocidade, int decremento) {
        velocidade[0] -= decremento;
        if (velocidade[0] < 0) {
            velocidade[0] = 0;
        }
        System.out.println("O carro freou. Velocidade atual: " + velocidade[0] + " km/h");
    }

    public static void buzinar() {
        System.out.println("Beep beep! O carro está buzinando!");
    }

    public static void main(String[] args) {

        // Atributos de um carro
        String marca1 = "Toyota";
        String modelo1 = "Corolla";
        String cor1 = "Preto";
        int[] velocidade1 = {0}; // Usando array para simular passagem por referência

        String marca2 = "Honda";
        String modelo2 = "Civic";
        String cor2 = "Prata";
        int[] velocidade2 = {0};

        // Exibindo informações do primeiro carro
        System.out.println("Carro 1: " + marca1 + " " + modelo1 + " de cor " + cor1);
        acelerar(velocidade1, 20);
        buzinar();
        frear(velocidade1, 10);

        System.out.println();

        // Exibindo informações do segundo carro
        System.out.println("Carro 2: " + marca2 + " " + modelo2 + " de cor " + cor2);
        acelerar(velocidade2, 50);
        buzinar();
        frear(velocidade2, 30);
    }
}
