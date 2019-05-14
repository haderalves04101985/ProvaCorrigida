public class Imovel {

private Proprietario proprietario;
private Data dataCompra;
private String tipo;

public Proprietario getProprietario()
{
    return this.proprietario;
}

public Data getDatacompra()
{
    return this.dataCompra;
}

public String getTipo()
{
    return this.tipo;
}

public void setProprietario(Proprietario p)
{
    this.proprietario=p;
}

public void setDataCompra(Data d)
{
    this.dataCompra=d;
}

public void setTipo(String t)
{
    this.tipo=t;
}



public boolean Tipo(String type)
{
    
    if((type.equals("casa"))||(type.equals("apartamento"))||(type.equals("sitio")))
    {
        
        tipo=type;
        return true;
    }    
    
    else 
    return false;
}

public void mostrar()
{
    this.proprietario.mostrar();
    this.dataCompra.mostrar();
    System.out.println("Tipo: "+this.getTipo());    
}


    
}
