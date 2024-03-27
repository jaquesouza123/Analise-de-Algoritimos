abstract class VetorOtimizado implements IVetor {
    
    private double[] notas = new double[4];
    private int totalNotas = 0;
    private int vetorInt[];
    private int numElementos = 0;
    
    public void adiciona(double nota){
        this.garanteEspaco();
        this.notas[this.totalNotas] = nota;
        this.totalNotas++;
        }

    public boolean cheio(){
        if (totalNotas == this.notas.length)
        return true;
        return false;
        }
     
    private void garanteEspaco(){
        if (this.cheio()){
         double[] novoNotas = new double[this.notas.length * 2];
            
            for (int i=0; i < this.notas.length; i++)
            novoNotas[i] = this.notas[i];
            this.notas = novoNotas;
            }
        }

    public boolean remove(double nota){
            int indice = -1;
            
            for(int i=0; i < totalNotas; i++) //faz a busca
              if (nota == this.notas[i])
                {indice = i; break; }
            
              if (indice != -1){ //achou o elemento
            
            for(int i=indice; i < (numElementos - 1); i++)
               vetorInt[i] = vetorInt[i+1];
               totalNotas--;
            return true;
            }
            return false;
            }             


    }