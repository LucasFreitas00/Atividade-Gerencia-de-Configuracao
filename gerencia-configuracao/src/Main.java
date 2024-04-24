public class Main {
    public static void main(String[] args) {
        System.out.println("Lucas da Silva Freitas");

        Soma soma1 = new Soma(33, 12);
        soma1.somar(soma1.getNum1(), soma1.getNum2());

        Soma soma2 = new Soma();
        soma2.somar(22, 14);

        System.out.println("O valor da primeira soma é " + soma1.getResultadoSoma() + " e da segunda soma é " + soma2.getResultadoSoma());
    }
}