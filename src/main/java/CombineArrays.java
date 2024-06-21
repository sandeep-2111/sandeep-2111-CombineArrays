
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int m=arr1.length+arr2.length;
        int[] com=new int[m];
        for(int i=0;i<m;i++){
            if(i<arr1.length){
                com[i]=arr1[i];
            }
            else{
                com[i]=arr2[i-arr1.length];
            }
        }

        return com;
    }
}
