package factory_pattern;

//LoggerFactory:日志记录器工厂接口,充当抽象工厂角色

public interface LoggerFactory {
	public Logger createLogger();
}
