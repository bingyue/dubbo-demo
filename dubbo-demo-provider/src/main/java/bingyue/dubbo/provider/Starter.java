package bingyue.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 加载Spring配置，启动服务提供者
 *
 */
public class Starter {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
		ctx.start();
		System.out.println("Start service provider_");
	    System.in.read(); // 按任意键退出
	}
}
