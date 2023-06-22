package Day10;

class Solution 
{
    static class meet{
        int start;
        int end;
        meet(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    static class meeting implements Comparator<meet>{
        public int compare(meet o1, meet o2){
            if(o1.end<o2.end){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<meet> x = new ArrayList<>();
        for(int i=0; i<start.length; i++){
            x.add(new meet(start[i], end[i]));
        }
        meeting mc = new meeting();
        Collections.sort(x, mc);
        int en = x.get(0).end;
        int count=1;
        for(int i=1; i<x.size(); i++){
            if(x.get(i).start>en){
                count++;
                en=x.get(i).end;
            }
        }
        return count;
        
    }
}