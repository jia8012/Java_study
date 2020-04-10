package factory_pattern;

//Filelogger:文件日志记录器,充当具体产品角色。

public class Filelogger implements Logger{
	@Override
	public void writeLog() {
		System.out.println("文件日志记录");
	}
}
