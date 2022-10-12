public class Questao1 {
    public static void main(String[] args) {
        int vetor[] = {3,8,7,9,10,11,80,2,1,50};
        for(int i = 0; i < vetor.length; i++){
            int valor = vetor[i];
            int j = i - 1;
            while( j >= 1 && valor < vetor[j]){
                int aux = vetor[j+1];
                vetor[j+1] = vetor[j];
                vetor[j] = aux;
                j--;
                if(j == 0){
                    break;
                }
            }
        }

        for(Integer t:vetor)
            System.out.printf("%d \t",t);
    }
}
