package googletop50;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/insert-interval/
 */
public class InsertInterval {

        public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        for(int[] curr:intervals)
        {
            if(curr[0]>newInterval[1] || curr[1]<newInterval[0])
            {
                list.add(curr);
            }
            else
            {
                newInterval[0]=Math.min(curr[0],newInterval[0]);
                newInterval[1]=Math.max(curr[1],newInterval[1]);
            }
        }
        list.add(newInterval);
        list.sort((a,b)->a[0]-b[0]);
        for(int[] curr:list)
            System.out.println(curr[0]+" "+curr[1]);

        return list.toArray(new int[list.size()][2]);
    }
}
