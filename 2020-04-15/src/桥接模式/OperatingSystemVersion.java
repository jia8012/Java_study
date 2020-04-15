package 桥接模式;

//抽象类是完成桥接的关键
//建立两个对象之间的联系，提供一个 play 方法

public abstract class OperatingSystemVersion {
	VideoFile vf;

	public void setVideoFile(VideoFile vf) {
		this.vf = vf;
	}
	public abstract void play(String name);
}