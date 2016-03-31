package bingyue.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bingyue.dubbo.api.TestService;

/**
 * 测试服务
 *
 */
public class Tester {

	//使用注解或者使用远程服务代理取得接口实例
//	@Autowired TestService testService;
	
	public static void main(String[] args){
		//加载同级目录下的消费者配置文件
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("consumer.xml");
		ctx.start();
		TestService testService = (TestService) ctx.getBean("testService"); 
		String result=testService.sayHello("cnblogs");
		System.out.println(result);
	}
}
