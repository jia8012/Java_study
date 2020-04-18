package 外观模式;

//文件保存类
//需要知道保存内容以及保存路径
public class FileWriter {
	public void write(String encryptText,String fileNameDes){
		System.out.println("加密结果："+encryptText+"\n文件已保存至："+fileNameDes);
	}
}
