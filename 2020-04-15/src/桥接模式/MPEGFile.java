package 桥接模式;

// MPEG 解码格式

public class MPEGFile implements VideoFile{
	@Override
	public void decode(String osType, String filename) {
		System.out.println(filename+"文件在"+osType+"MPEG解码格式播放");
	}
}
