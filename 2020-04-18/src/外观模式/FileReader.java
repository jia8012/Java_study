package 外观模式;

//文件读取类
//read方法需要返回文件读取的内容
public class FileReader {
	public String read(String fileNameSrc){
		System.out.println("读取-->\""+fileNameSrc+"\"-->文件成功");
		return "张三的电话号码：18329548704";
	}
}
