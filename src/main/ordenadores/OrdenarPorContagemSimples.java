package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int maior= -1;

        for (int j = 0; j < array.length; j++) {
            
        
        if(array[j]> maior){
            maior = array[j];
        }
    }
        boolean[] array20 = new boolean[maior + 1 ];
        for (int j = 0; j < array.length; j++) {
            array20[j] = true;
            
        }
        int[] array30 = new int [array.length];
        int i = 0;
        for (int index = 0; index < array20.length; index++) {
            if(array20[index]){
                array30[i] = index;
                i++;
            }
        }
        return array30;
        }
       }
    
