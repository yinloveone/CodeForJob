/*
*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת��
*�����ת�������СԪ��
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