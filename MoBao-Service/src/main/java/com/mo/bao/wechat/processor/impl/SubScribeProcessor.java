package com.mo.bao.wechat.processor.impl;


import com.mo.bao.wechat.processor.Processor;
import com.mo.bao.wechat.request.event.RequestEventSubscribe;
import com.mo.bao.wechat.response.ResponseText;
import org.springframework.stereotype.Service;

@Service
public class SubScribeProcessor implements Processor<RequestEventSubscribe> {
	@Override
	public String doProcess(RequestEventSubscribe request) {
		String userBindUrl = "http://dwz.cn/1KTZKx";
		String downloadUrl = "http://dwz.cn/1KU12W";
		String listCtxUrl = "http://dwz.cn/1KTYQ2";
		String writeMatchUrl = "http://dwz.cn/2aOV1V";

		StringBuilder sb = new StringBuilder();

		sb.append("Hi，我是小知了，感谢您的关注！/:rose/:rose请为小作家投上您宝贵的一票：");
		sb.append("\n\n");
		sb.append("第1步：点击【<a href=\"" + userBindUrl + "\">手机验证</a>】，验证手机号");
		sb.append("\n\n");
		sb.append("第2步：点击【<a href=\"" + writeMatchUrl + "\">作文大赛</a>】，即可投票");

		ResponseText response = new ResponseText();

		response.setToUserName(request.getFromUserName());
		response.setFromUserName(request.getToUserName());
		response.setCreateTime(System.currentTimeMillis());
		response.setContent(sb.toString());

		return response.toXmlString();
	}
}