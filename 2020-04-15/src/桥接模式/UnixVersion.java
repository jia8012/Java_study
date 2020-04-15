package 桥接模式;

// Unix 播放平台

public class UnixVersion extends OperatingSystemVersion{
	@Override
	public void play(String name) {
		String osType = "Unix平台";
		this.vf.decode(osType,name);
	}
}
