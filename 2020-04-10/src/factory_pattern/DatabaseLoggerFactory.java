package factory_pattern;

//DatabaseFactory:数据库日志记录器工厂类,充当具体工厂色

public class DatabaseLoggerFactory implements LoggerFactory{
	@Override
	public Logger createLogger(){
		return new DatabaseLogger();
	}


}
