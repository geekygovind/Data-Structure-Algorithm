class Solution {
    public int minProd(int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0, l = arr.length, neg = 1;
        boolean negp = false;
        
        while(i < l && arr[i] < 0){
            neg *= arr[i++];
            negp = true;
        }
        if(negp){
            if(neg > 0) neg = neg / arr[i-1];
            
            while(i < l){
                if(arr[i] != 0) neg *= arr[i];
                i++;
            }
        }
        else {
            return arr[0];
        }
        return neg;
    }
}
