package com.cqupt.deal;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.bean.NotifyItem;
import com.google.gson.Gson;

public class NotifyItemsServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("user_id");

		System.out.println("NotifyItemsServer idString:" + idString);

		NotifyItem item1 = new NotifyItem();
		item1.title = "���һ�ӭ����ѧУ��ͬѧ����ʦ����У���ۣ��Ի�����֪ʶ��������ʶ";
		item1.time = "2015-10-16 14:00:08";

		NotifyItem item2 = new NotifyItem();
		item2.title = "��λ���ε���ʦ�������ʵ�����ǣ��ϸ�������Ҫ�����֡�";
		item2.time = "2015-10-18 09:10:22";

		NotifyItem item3 = new NotifyItem();
		item3.title = "����ת�������λ���ε���ʦע�Ᵽů��";
		item3.time = "2015-10-18 09:10:22";

		ArrayList<NotifyItem> arrayList = new ArrayList<NotifyItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);

		Gson gson = new Gson();
		String string = gson.toJson(arrayList);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(string);
	}
}
