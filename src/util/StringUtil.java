package util;

/**
 * 字符串工具类
 * @author WuGuochuan
 * @Date 2021-11-25 17:03
 */
public class StringUtil{
    /**
    *@Description: 判断是否为空  为空返回true
        *@Author: WuGuochuan
        *@Date: 2021/11/25 17:09
     **/
    public static boolean isEmpty(String str){
        if(str==null||"".equals(str.trim())) {
            return true;
        }else {
            return false;
        }
    }

  /**
  *@Description: 判断是否不为空   不为空返回true
      *@Author: WuGuochuan
      *@Date: 2021/11/25 17:09
   **/
    public static boolean isNotEmpty(String str) {
        if(str!=null&&"".equals(str.trim())) {
            return true;
        }else {
            return false;
        }
    }


}
