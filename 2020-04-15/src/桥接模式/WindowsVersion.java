package 桥接模式;

// Windows 播放平台
public class WindowsVersion extends OperatingSystemVersion {
	@Override
	public void play(String name) {
		String osType = "Windows平台";
		this.vf.decode(osType,name);
	}
}
