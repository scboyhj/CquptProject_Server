package com.cqupt.deal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.bean.ArrangeItem;
import com.cqupt.bean.RecordItem;
import com.google.gson.Gson;

public class ArrangeItemsServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("user_id");

		System.out.println("ArrangeItemsServer idString:" + idString);

		ArrangeItem item1 = new ArrangeItem();
		item1.arragePlace = "2403";
		item1.arrageTime = "2015-11-14  星期四  下午三四节";
		item1.publishTime = "2015-11-12";

		ArrangeItem item2 = new ArrangeItem();
		item2.arragePlace = "5201";
		item2.arrageTime = "2015-11-22  星期一  上午三四节";
		item2.publishTime = "2015-11-12";

		ArrangeItem item3 = new ArrangeItem();
		item3.arragePlace = "4201";
		item3.arrageTime = "2015-11-24  星期二  上午一二节";
		item3.publishTime = "2015-11-13";

		ArrayList<ArrangeItem> arrayList = new ArrayList<ArrangeItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);

		Gson gson = new Gson();
		String string = gson.toJson(arrayList);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(string);

	}
}
