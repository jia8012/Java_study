package 桥接模式;

// RMVB 解码格式

public class RMVBFile implements VideoFile{
	@Override
	public void decode(String osType, String filename) {
		System.out.println(filename+"文件在"+osType+"RMVB解码格式播放");
	}
}
