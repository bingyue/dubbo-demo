package bingyue.dubbo.provider;

import bingyue.dubbo.api.TestService;


public class TestServiceImpl implements TestService {

	/**
	 * 服务提供方实现接口：(对服务消费方隐藏实现)
	 */
	public String sayHello(String name) {
		System.out.println("调用provider服务");
		return "hello"+name;
	}

}
