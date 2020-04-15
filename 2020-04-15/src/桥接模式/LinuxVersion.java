package 桥接模式;

// Linux 播放平台
public class LinuxVersion extends OperatingSystemVersion {
	@Override
	public void play(String name) {
		String osType = "Linux平台";
		this.vf.decode(osType,name);
	}
}
