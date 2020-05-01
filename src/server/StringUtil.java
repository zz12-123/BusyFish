package server;

public class StringUtil {
	public static boolean isEmpty(String str){
		if("".equals(str)||str==null){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isNotEmtpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}

}
/**判断输入的是否为空
 * 
 */
