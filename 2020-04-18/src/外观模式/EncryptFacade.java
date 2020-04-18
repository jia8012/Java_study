package 外观模式;

//外观类，用户只用对这个类进行使用，便可以完成所有工作
public class EncryptFacade {
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;

	public EncryptFacade() {
		reader = new FileReader();
		cipher = new CipherMachine();
		writer = new FileWriter();
	}
	public void fileEncrypt(String fileNameSrc,String fileNameDes){
		String plainText =  reader.read(fileNameSrc);
		String encryptText = cipher.encrypt(plainText);
		writer.write(encryptText,fileNameDes);
	}
}
