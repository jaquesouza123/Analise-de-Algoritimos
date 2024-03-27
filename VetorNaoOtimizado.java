public class VetorNaoOtimizado implements IVetor{
    private double[] notas = new double[4];
    
    
public void adiciona(double nota){
for (int i = 0; i < this.notas.length; i++)
if(this.notas[i] != 0){
this.notas[i] = nota;
break;
}
}

}
