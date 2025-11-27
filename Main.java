import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Criando Figuras ---");

        System.out.print("Digite o RAIO do Círculo: ");
        double raio = leitor.nextDouble();
        FiguraGeometrica meuCirculo = new Circulo(raio);

        System.out.print("Digite o LADO do Quadrado: ");
        double lado = leitor.nextDouble();
        FiguraGeometrica meuQuadrado = new Quadrado(lado);

        System.out.println("Digite os 3 LADOS do Triângulo (aperte Enter após cada número):");
        System.out.print("Lado A: ");
        double a = leitor.nextDouble();
        System.out.print("Lado B: ");
        double b = leitor.nextDouble();
        System.out.print("Lado C: ");
        double c = leitor.nextDouble();
        FiguraGeometrica meuTriangulo = new Triangulo(a, b, c);

        leitor.close();

        System.out.println("\n--- Relatório Final ---");
        exibirDetalhes("Círculo", meuCirculo);
        exibirDetalhes("Quadrado", meuQuadrado);
        exibirDetalhes("Triângulo", meuTriangulo);
    }

    // Método auxiliar para imprimir bonito
    public static void exibirDetalhes(String nome, FiguraGeometrica figura) {
        System.out.printf("Figura: %-10s | Área: %6.2f | Perímetro: %6.2f%n", 
            nome, figura.calcularArea(), figura.calcularPerimetro());
    }
}