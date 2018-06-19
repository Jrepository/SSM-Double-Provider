package indi.dubbo.provider;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Server
 * @Description: 服务提供
 * @author 谢振海
 * @date 2017年9月26日 下午11:49:20
 */
public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo.xml" });
		context.start();
		System.out.println("启动");
		System.in.read(); // 按任意键退出
	}
	
	@Test
	public void dubbo2Test() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo2.xml" });
		context.start();
		System.out.println("启动");
		System.in.read(); // 按任意键退出
	}
}