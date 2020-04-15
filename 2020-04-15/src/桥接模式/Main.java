package 桥接模式;

//测试程序

public class Main {
	public static void main(String[] args) {
		OperatingSystemVersion operatingSystemVersion1 = new WindowsVersion();
		VideoFile videoFile1 = new RMVBFile();
		operatingSystemVersion1.setVideoFile(videoFile1);
		operatingSystemVersion1.play("test");

		OperatingSystemVersion operatingSystemVersion2 = new LinuxVersion();
		VideoFile videoFile2 = new AVIFile();
		operatingSystemVersion2.setVideoFile(videoFile2);
		operatingSystemVersion2.play("test");
	}
}
