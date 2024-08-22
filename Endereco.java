public class Endereco{
    private String pais, uf, cidade, rua, numero, cep, complemento;

    public Endereco(String pais, String uf, String cidade, String rua, String numero, String cep, String complemento){
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return this.pais;
    }

    public void setUf(String uf){
        this.uf = uf;
    }

    public String getUf(){
        return this.uf;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getComplemento(){
        return this.complemento;
    }

    @Override
    public String toString(){
        return pais + "," + uf + "," + cidade + "," + rua + "," + numero + "," + cep + "," + complemento;
    }
}
