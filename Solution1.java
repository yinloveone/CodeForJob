public class Solution1 {
/*
*��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
*ÿһ�ж����մ����ҵ�����˳������
*ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
*����������һ����ά�����һ���������ж��������Ƿ��и�������
*˼·���ӵ�һ�к����һ�п�ʼ��
*         ���target���ڵ�ǰֵ��˵������һ��
*        targetС�ڵ�ǰֵ��˵����ǰ�����
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