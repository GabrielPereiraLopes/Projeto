package projeto;


public class Produtos extends Fabricante {
    private String descricao;
    private double peso;
    private double valorCompra;
    private double valorVenda;
    private double valorLucro;
    private double percentualLucro;
    

    public Produtos(String nome, String site, String telefone, String UF, String descricao, double peso, double valorCompra,double valorVenda ){
        super(nome, site, telefone, UF);
        this.descricao= descricao;
        this.peso = peso;
        this.valorVenda= valorVenda;
        this.valorCompra = valorCompra;
    }
    
    
    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public double getPeso() {
        return peso;
    }

    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public double getValorCompra() {
        return valorCompra;
    }

   
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

   
    public double getValorVenda() {
        return valorVenda;
    }


    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    
    public double getValorLucro() {
        this.valorLucro = this.valorVenda - this.valorCompra;
        
        return this.valorLucro;
    }

    
   
    

    
    public double getPercentualLucro() {
        this.percentualLucro = (this.valorLucro / this.valorCompra) * 100;
                
        return this.percentualLucro;
    }

   
    @Override
    public String toString(){
        return "Nome: " + super.getNome() +
            "\nSite: " + super.getSite() +
            "\nTelefone: " + super.getTelefone() +
            "\nUF: " + super.getUF() +
            "\nDescricao: " + descricao +
            "\nPeso: " + peso +
            "\nValor de Compra: " + valorCompra +
            "\nValor de Venda: " + valorVenda +
            "\nValor de Lucro: " + getValorLucro() +
            "\nPercentual de Lucro: " + getPercentualLucro();

    }
    
    
    
    
    
    
}
