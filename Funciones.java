package aed;

class Funciones {
    int cuadrado(int x) {
        // COMPLETAR
        x = x * x;
        return x;
    }

    double distancia(double x, double y) {
        // COMPLETAR
        x = x * x;
        y = y * y;
        double z = x + x;
        Math.sqrt(z);

        return z;
    }

    boolean esPar(int n) {
        // COMPLETAR
        int nModulo2 = n % 2;
        return nModulo2 == 0;
        
    }

    boolean esBisiesto(int n) {
        // COMPLETAR
        
        return false;
    }

    int factorialIterativo(int n) {
        // COMPLETAR
        for (int i = n - 1; i > 1; i--){
            n = n * i;

        }
        return n;
    }

    int factorialRecursivo(int n) {
        // COMPLETAR
        if (n <= 1 ){
            return 1;
        }
                int m =  n * factorialRecursivo(n-1);
                
        
        return m;
    }

    boolean esPrimo(int n) {
        // COMPLETAR
        return false;
    }

    int sumatoria(int[] numeros) {
        // COMPLETAR
        return 0;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
