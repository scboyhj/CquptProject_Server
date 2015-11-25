package com.cqupt.deal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.bean.ClassListenTable;
import com.cqupt.bean.RecordItem;
import com.google.gson.Gson;

public class RecordItemServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("item_id");

		System.out.println("RecordItemServer item_id:" + idString);

		// DataOutputStream dataOutputStream = new DataOutputStream(
		// resp.getOutputStream());
		// dataOutputStream.writeBytes("ok");

		// dataOutputStream.close();

		ClassListenTable table = initData();

		Gson gson = new Gson();
		String string = gson.toJson(table);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(string);

	}

	private ClassListenTable initData() {
		// TODO Auto-generated method stub

		ClassListenTable table1 = new ClassListenTable();
		table1.book_hold = "一般";
		table1.class_condition = "良好";
		table1.class_content = "互联网已经深入生活中";
		table1.class_num = "14";
		table1.class_time = "2015-9-23 17:00:01";
		table1.comeout_rate = "95";
		table1.fact_be = "64";
		table1.is_advance = "否";
		table1.is_late = "否";
		table1.late_num = "3";
		table1.late_rate = "3";
		table1.lesson_belong = "软件学院";
		table1.lesson_name = "互联网理解";
		table1.lesson_property = "选修";
		table1.listen_time = "2015-9-23 17:00:01";
		table1.my_advice = "课堂需要更加活跃";
		table1.my_name = "王大力";
		table1.room_num = "2301";
		table1.score_attitude = "14";
		table1.score_content = "23";
		table1.score_manage = "8";
		table1.score_method = "21";
		table1.score_result = "18";
		table1.should_be = "74";
		table1.state_score = "81";
		table1.student_belong = "软件学院";
		return table1;
	}

}
