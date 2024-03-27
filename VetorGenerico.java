public class VetorGenerico implements IVetor {
    private Object[] elementos = new Object[4];
    private int totalElementos = 0;
   
    public void adiciona(Object o){    
    this.garanteEspaco();
    this.elementos[this.totalElementos] = o;
    this.totalElementos++;
    }

    
}
