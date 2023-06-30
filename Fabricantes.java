
package projeto;


public class Fabricante {
    private String nome;
    private String site;
    private String telefone;
    private String UF;
    
    public Fabricante(String nome, String site, String telefone, String UF){
        this.nome = nome;
        this.site= site;
        this.UF =UF;
        this.telefone = telefone;
        
        
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getSite() {
        return site;
    }

    
    public void setSite(String site) {
        this.site = site;
    }

    
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getUF() {
        return UF;
    }

    
    public void setUF(String UF) {
        this.UF = UF;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome
             + "\nSite: " +site
             + "\nTelefone: "+telefone
             + "\nUF: "+ UF;
        
    }
    
    
    
}
