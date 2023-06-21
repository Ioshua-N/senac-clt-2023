package Classes;

public class Homem extends PessoaIMC
{
    public Homem(String nome, String dataNascimento, double peso, double altura)
    {
        super(nome, dataNascimento, peso, altura);
    }

    public String resultIMC()
    {
        double IMC = calculaIMC(altura, peso);
        if(IMC < 20.7)
        {
            return "Abaixo do peso ideal";
        }
        else if (IMC > 26.4)
        {
            return "Acima do peso ideal";
        }
        else
        {
            return "Peso ideal";
        }
    }
}