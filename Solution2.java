public class Solution2 {
/*
*��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
*���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
* ���ûʲô��˵�ġ�������
*/

    public String replaceSpace(StringBuffer str) {
        if(null==str){
            return null;
        }
        StringBuffer newStr=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(' '==str.charAt(i)){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }    
    	return newStr.toString();
    }
}