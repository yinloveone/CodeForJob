/*
*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
*输出旋转数组的最小元素
*
*/

import java.util.ArrayList;
public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
    if(array.length==0)
        return 0;
    for(int i=0;i<array.length;i++){
        if(array[i]>array[i+1])
            return array[i+1];
    }
        return array[0];
    }   
}