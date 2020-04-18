package 外观模式;

//文件加密类
//eccrypt方法需要返回加密后的内容
public class CipherMachine {
	public String encrypt(String plainText){
		System.out.println("文件内容:"+plainText+"加密成功");
		return "***********";
	}
}
