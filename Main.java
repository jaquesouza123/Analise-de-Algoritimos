
public class Main{
public static void main (String[] args){

    IVetor vetNaoOtimo = new VetorNaoOtimo();
    vetNaoOtimo.adiciona(9.0);
    vetNaoOtimo.adiciona(5.2);
    
    IVetor vetOtimo = new VetorNaoOtimo();
    vetOtimo.adiciona(3.3);
    vetOtimo.adiciona(3.3);

    IVetor vet = new VetorGenerico();
    vet.adiciona(50);
    vet.adiciona(3.3);
    vet.adiciona("Um vetor que aceita de tudo");
    
    Aluno a = new Aluno("João", 30, 10.0);
    vet.adiciona(a);
    vet.imprime(); 

    }
}