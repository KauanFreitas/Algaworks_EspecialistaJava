public class CalculoFormasUtil {

    static final double PI = 3.14159265358979323846;

    static double calculoQuadrado( double lado){
    double area = lado * lado;
        return area;
    }

    static double calculoCirculo(double raio){
        double areaCirculo = (raio * raio) * CalculoFormasUtil.PI;
        return  areaCirculo;
    }
}
