public class Solution2 {
/*
*请实现一个函数，将一个字符串中的每个空格替换成“%20”。
*例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
* 这个没什么好说的。。。。
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