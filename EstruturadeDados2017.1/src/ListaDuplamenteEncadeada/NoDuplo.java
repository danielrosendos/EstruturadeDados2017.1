package ListaDuplamenteEncadeada;

public class NoDuplo {
    private Integer elemento;
    private NoDuplo anterior;
    private NoDuplo proximo;
     
     
    public NoDuplo(Integer elemento, NoDuplo anterior, NoDuplo proximo) {
        this.elemento = elemento;
        this.anterior= anterior;
        this.proximo = proximo;
         
    }
     
    public Integer getElemento() {
        return elemento;
    }
    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }
    public NoDuplo getAnterior(){
        return anterior;
    }
    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }   
}
