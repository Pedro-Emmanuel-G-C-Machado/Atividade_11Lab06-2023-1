package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivot = values[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i+=1;
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }

       
        int temp = values[i];
        values[i] = values[left];
        values[left] = temp;
        
        return i; 
        
    }
    
}
