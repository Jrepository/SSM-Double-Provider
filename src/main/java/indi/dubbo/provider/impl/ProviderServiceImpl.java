package indi.dubbo.provider.impl;

import inde.dubbo.api.IProvider;


public class ProviderServiceImpl implements IProvider {

	public String build(String name) throws Exception {
		System.out.println(this.getClass().getName() + "[" + name + "]");
		return "信息来自provide: " + name;
	}

}
