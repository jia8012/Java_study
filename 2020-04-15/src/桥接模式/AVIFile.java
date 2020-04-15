package 桥接模式;

// AVI 解码模式

public class AVIFile implements VideoFile {
	@Override
	public void decode(String osType, String filename) {
		System.out.println(filename+"文件在"+osType+"AVI解码格式播放");
	}
}
