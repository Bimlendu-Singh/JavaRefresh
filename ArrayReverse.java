public class ArrayReverse {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50,80};
        int i,j,k,temp;

        j = num.length;
        k=0;

        // Displaying array before sorting
        System.out.println("Array before sorting: ");
        for (int l = 0; l < num.length; l++) {
            System.out.print(" "+num[l]);
        }

        // Reversing array using third variable temp and running loop half the size of array since in one loop two index get sorted
        for(i=0;i<=(num.length/2);i++)
        {
            temp=num[j];
            num[j]=num[k];
            num[k]=temp;
            j--;
            k++;
        }

        System.out.println("Array before sorting: ");
        for (int l = 0; l < num.length; l++) {
            System.out.print(" "+num[l]);
        }
    }
}
