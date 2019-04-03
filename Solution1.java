public class Solution1 {
/*
*在一个二维数组中（每个一维数组的长度相同），
*每一行都按照从左到右递增的顺序排序，
*每一列都按照从上到下递增的顺序排序。请完成一个函数，
*输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*思路：从第一行和最后一列开始找
*         如果target大于当前值，说明在下一行
*        target小于当前值，说明在前面的列
*/
    public boolean Find(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;
        if(row==0||col==0)
            return false;
        if(target<array[0][0]||target>array[row-1][col-1])
            return false;
        int i=0;
        int j=col-1;
        while(i<row&&j>=0){
            if(target>array[i][j]){
                i++;
            }else if(target<array[i][j]){
                j--;
            }else{
                return true;
            }
        }
        return false;

    }
}