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
		item1.title = "热烈欢迎其他学校的同学和老师来我校讨论，对互联网知识的理解和认识";
		item1.time = "2015-10-16 14:00:08";

		NotifyItem item2 = new NotifyItem();
		item2.title = "各位听课的老师，请务必实事求是，严格按照评分要求评分。";
		item2.time = "2015-10-18 09:10:22";

		NotifyItem item3 = new NotifyItem();
		item3.title = "天气转凉，请各位听课的老师注意保暖。";
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
