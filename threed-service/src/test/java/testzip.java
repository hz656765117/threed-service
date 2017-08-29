import java.io.File;

import com.hz.base.utils.FileUtil;
import com.hz.base.utils.ZipUtil;


public class testzip {
	public static void main(String[] args) {
	File file = ZipUtil.zip("F:\\three\\窗帘.max");
	String baseStr =  FileUtil.getBaseStrByFile(file);
	
	
	FileUtil.getFileByBaseStr("F:\\three1\\窗帘.max.zip", baseStr);
 
	ZipUtil.unzip("F:\\three1\\窗帘.max.zip");
	}
	
	
	
	
 
	
}
