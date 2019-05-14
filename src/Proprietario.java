public class Proprietario {
 
private String nome;
private Data dataDeNascimento;

public String getNome()
{
    return this.nome;
}

public Data getDataDeNascimento()
{
    return this.dataDeNascimento;
}

public void setNome(String n)
{
    this.nome=n;
}

public void setDataDeNascimento(Data d)
{
    this.dataDeNascimento=d;
}

public void mostrar()
{
    System.out.println("Nome: "+this.getNome());
    this.dataDeNascimento.mostrar();
}

}