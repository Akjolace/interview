/*11. Container With Most Water
        Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
        n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
        Find two lines, which together with x-axis forms a container, such that the container contains the most water.

        Note: You may not slant the container and n is at least 2.*/
public class ContainerMostWater{
    public int maxArea(int[] height){
        int max = 0; //non-negative integers so min area would be 0
        int start = 0; // starting pointer of two pointers
        int end = height.length - 1; // ending pointer of two pointers (last index of Array)
        while(i < j){
            int min = Math.min(height[i], height[j]); //water tank able to fill min bar
            max = Math.max(max, min * (j - i)); //calculating Current area and compare it to max
            //Moving index condition
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
    //Time : O(N)
    //Space : O(1)
}