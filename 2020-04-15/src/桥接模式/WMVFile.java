package 桥接模式;

// WMV 解码格式

public class WMVFile implements VideoFile {
	@Override
	public void decode(String osType, String filename) {
		System.out.println(filename+"文件在"+osType+"WMV解码格式播放");
	}
}
