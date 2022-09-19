class Solution {
    public int threeSumClosest(int[] num, int target) {
        int closest=0;
        if(num==null){
            return closest;
        }
        
        Arrays.sort(num);
        
        
        for(int i=0;i<num.length && i<3;i++){
            closest +=num[i];
        }
        
        if(num.length<3){
            return closest;
        }
        
        for(int i=0;i<num.length-2;i++){
            int lo=i+1;
            int hi=num.length-1;
            
            while(lo<hi){
                int sum=num[i]+num[lo]+num[hi];
                
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                    
                    if(closest==target) return closest;
                }
                if(sum>target) hi--;
                else lo++;
            }
        }
        return closest;
    }
}
