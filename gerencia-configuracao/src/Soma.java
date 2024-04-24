public class Soma {

    private int num1;
    private int num2;
    private int resultadoSoma;

    public Soma() {}

    public Soma(int num1, int  num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void somar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultadoSoma = num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getResultadoSoma() {
        return resultadoSoma;
    }

    public void setResultadoSoma(int resultadoSoma) {
        this.resultadoSoma = resultadoSoma;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
