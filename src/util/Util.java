package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Util {
	
	public static void main(String[] args) {
//		String a[] = {};
//		System.out.println(arrayIsNotEmpty(a));
//		String str = " ";
//		System.out.println(stringIsNotEmpty(str));
//		List<String> list = new ArrayList<String>();
//		list.add("q");
//		System.out.println(collectionIsNotEmpty(list));
//		String str = "a,b,c,d,";
//		System.out.println(str.substring(0,str.lastIndexOf(",")));
//		System.out.println(removeLastTab(str,""));
		System.out.println(getPYIndexStr("别想了，你们会睡不着的",false));
	}
	
	public static String removeLastTab(String str,String tab){
		if(Util.stringIsNotEmpty(str)){
			if(str.endsWith(tab)){
				str = str.substring(0, str.lastIndexOf(tab));
			}
		}
		return str;
	}

	public static boolean arrayIsNotEmpty(String array[]){
		return array != null && array.length>0;
	}
	
	public static boolean stringIsNotEmpty(String str){
		return str != null && !"".equals(str.trim());
	}
	
	public static boolean collectionIsNotEmpty(Collection col){
		return col != null && col.size()>0;
	}
	
	public static boolean mapIsNotEmpty(Map map){
		return map != null && map.size() > 0;
	}
	
	public static String getPYIndexStr(String strChinese, boolean bUpCase) {
		try {
			StringBuffer buffer = new StringBuffer();
			byte b[] = strChinese.getBytes("GBK");// 把中文转化成byte数组
			for (int i = 0; i < b.length; i++) {
				if ((b[i] & 255) > 128) {
					int char1 = b[i++] & 255;
					char1 <<= 8;// 左移运算符用“<<”表示，是将运算符左边的对象，向左移动运算符右边指定的位数，并且在低位补零。其实，向左移n位，就相当于乘上2的n次方
					int chart = char1 + (b[i] & 255);
					buffer.append(getPYIndexChar((char) chart, bUpCase));
					continue;
				}
				char c = (char) b[i];
				if (!Character.isJavaIdentifierPart(c)) {// 确定指定字符是否可以是 Java
					// 标识符中首字符以外的部分。
					c = 'A';
				}
				buffer.append(c);
			}
			return buffer.toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * 得到首字母
	 */
	private static char getPYIndexChar(char strChinese, boolean bUpCase) {
		int charGBK = strChinese;
		char result;
		if (charGBK >= 45217 && charGBK <= 45252) {
			result = 'A';
		} else if (charGBK >= 45253 && charGBK <= 45760) {
			result = 'B';
		} else if (charGBK >= 45761 && charGBK <= 46317) {
			result = 'C';
		} else if (charGBK >= 46318 && charGBK <= 46825) {
			result = 'D';
		} else if (charGBK >= 46826 && charGBK <= 47009) {
			result = 'E';
		} else if (charGBK >= 47010 && charGBK <= 47296) {
			result = 'F';
		} else if (charGBK >= 47297 && charGBK <= 47613) {
			result = 'G';
		} else if (charGBK >= 47614 && charGBK <= 48118) {
			result = 'H';
		} else if (charGBK >= 48119 && charGBK <= 49061) {
			result = 'J';
		} else if (charGBK >= 49062 && charGBK <= 49323) {
			result = 'K';
		} else if (charGBK >= 49324 && charGBK <= 49895) {
			result = 'L';
		} else if (charGBK >= 49896 && charGBK <= 50370) {
			result = 'M';
		} else if (charGBK >= 50371 && charGBK <= 50613) {
			result = 'N';
		} else if (charGBK >= 50614 && charGBK <= 50621) {
			result = 'O';
		} else if (charGBK >= 50622 && charGBK <= 50905) {
			result = 'P';
		} else if (charGBK >= 50906 && charGBK <= 51386) {
			result = 'Q';
		} else if (charGBK >= 51387 && charGBK <= 51445) {
			result = 'R';
		} else if (charGBK >= 51446 && charGBK <= 52217) {
			result = 'S';
		} else if (charGBK >= 52218 && charGBK <= 52697) {
			result = 'T';
		} else if (charGBK >= 52698 && charGBK <= 52979) {
			result = 'W';
		} else if (charGBK >= 52980 && charGBK <= 53688) {
			result = 'X';
		} else if (charGBK >= 53689 && charGBK <= 54480) {
			result = 'Y';
		} else if (charGBK >= 54481 && charGBK <= 55289) {
			result = 'Z';
		} else {
			result = '!';
		}
		if (!bUpCase) {
			result = Character.toLowerCase(result);
		}
		return result;

	}

	
}
