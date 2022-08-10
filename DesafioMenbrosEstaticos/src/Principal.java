public class Principal {

    public static void main(String[] args) {

        double areaQuadrado = CalculoFormasUtil.calculoQuadrado(5);
        double areaCirculo = CalculoFormasUtil.calculoCirculo(10);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);

    }
}
