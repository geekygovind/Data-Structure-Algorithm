 class Solution {
    public int secFrequent(String[] arr) {
       HashMap<String,Integer> h = new HashMap<>();
       for(String s:arr){
           if(h.containsKey(s)){
               h.put(s,h.get(s)+1);
           }else{
               h.put(s,1);
           }
       }
       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       
       for(int i:h.values()){
           if(i>max1){
               max2 = max1;
               max1 = i;
           }else if(i>max2 && i<max1) max2 = i;
       }
       return max2<1 ?-1:max2;
        
    }
}
