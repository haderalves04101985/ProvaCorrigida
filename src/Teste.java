public class Teste {
public static void main(String[] Args)
{

Proprietario p1=new Proprietario();
p1.setNome("Hader");
Data d1=new Data();
d1.setDia(04);
d1.setMes(10);
d1.setAno(1985);
p1.setDataDeNascimento(d1);

Imovel im1=new Imovel();
im1.setProprietario(p1);

Data compra1=new Data();
compra1.setAno(2019);
compra1.setMes(05);
compra1.setDia(14);

im1.setDataCompra(compra1);

p1.mostrar();
im1.getTipo();
im1.mostrar();


}

    
}
