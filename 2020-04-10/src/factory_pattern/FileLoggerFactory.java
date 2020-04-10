package factory_pattern;

//FileLoggerFactory:文件日志记录器工厂类,充当具体工厂角色

public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		return new Filelogger();
	}
}
