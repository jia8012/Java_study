package 外观模式;

//用户类，测试代码
public class Main {
	public static void main(String[] args) {
		EncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.fileEncrypt("D:\\Java_study\\2020-04-18\\src\\外观模式",
				"D:\\Java_study\\2020-04-18\\src\\外观模式");
	}
}
