public class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> l = new ArrayList<String>();
        if(nums.length == 0) {
            return l;
        }
        int temp = nums[0];
        int start = temp;
        int count = 0;
        if(nums.length == 1) {
            l.add(start+"");
            return l;
        }
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == (temp+1)) {
                count++;
                temp = temp+1;
            }
            else {
                if(count == 0) {
                    l.add(start+"");
                }
                else {
                    l.add(start + "->" + temp);
                }
                temp = nums[i];
                start = temp;
                count = 0;
            }
            
        }
        if(count == 0) {
            l.add(start+"");
        }
        else {
            l.add(start + "->" + temp);
        }
        return l;
    }
}