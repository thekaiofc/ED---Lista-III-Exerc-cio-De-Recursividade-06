package Controller;

public class Serie {

    // Construtor
    public Serie() {
        super();
    }

    // Função recursiva para calcular fatorial
    public long fatorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    public double somatoria(int n) {

        /*
         * Quando n for igual a 1,
         * a somatória vale 1.
         */
        if (n == 1) {
            return 1.0;
        }

        /*
         * A somatória até n é igual à:
         * somatória até (n - 1)
         * +
         * 1 dividido por n fatorial.
         * S(n) = S(n-1) + 1/n!
         */
        return somatoria(n - 1) + (1.0 / fatorial(n));
    }
}