public class Operacoes{
    public static void main(String args[]){

        int a, b, c;
        float d;

        a = 27;
        b = 4;

        c = a + b;
        System.out.println("O valor de C = " + c);

        c = a - b;
        System.out.println("O valor de C = " + c);

        c = a * b;
        System.out.println("O valor de C = " + c);

        c = a / b;
        System.out.println("O valor de C = " + c);

        c = a % b;
        System.out.println("O valor de C = " + c);

        d = 1.0f;
        System.out.println("O valor de D = " + d);

        d = 1.0f/2;
        System.out.println("O valor de D = " + d);
        System.out.printf("O valor de D = %.3f\n", d);

        System.out.printf("variaveis: a = %d, b = %d, c = %d, d = %.2f\n", a,b,c,d);

    }
}
