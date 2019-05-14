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
    System.out.println("Proprietário: "+this.getProprietario());
    System.out.println("Data: "+this.getDatacompra());
    System.out.println("Tipo: "+this.getTipo());    
}


    
}
