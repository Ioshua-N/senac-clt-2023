package Classes;

public abstract class PessoaIMC extends Pessoa
{
    protected double peso;
    protected double altura;

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura)
    {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso()
    {
        return peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public double calculaIMC(double altura, double peso)
    {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public abstract String resultIMC();

    @Override
    public String toString()
    {
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}