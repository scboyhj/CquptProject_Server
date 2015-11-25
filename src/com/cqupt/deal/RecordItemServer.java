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
		table1.book_hold = "һ��";
		table1.class_condition = "����";
		table1.class_content = "�������Ѿ�����������";
		table1.class_num = "14";
		table1.class_time = "2015-9-23 17:00:01";
		table1.comeout_rate = "95";
		table1.fact_be = "64";
		table1.is_advance = "��";
		table1.is_late = "��";
		table1.late_num = "3";
		table1.late_rate = "3";
		table1.lesson_belong = "���ѧԺ";
		table1.lesson_name = "���������";
		table1.lesson_property = "ѡ��";
		table1.listen_time = "2015-9-23 17:00:01";
		table1.my_advice = "������Ҫ���ӻ�Ծ";
		table1.my_name = "������";
		table1.room_num = "2301";
		table1.score_attitude = "14";
		table1.score_content = "23";
		table1.score_manage = "8";
		table1.score_method = "21";
		table1.score_result = "18";
		table1.should_be = "74";
		table1.state_score = "81";
		table1.student_belong = "���ѧԺ";
		return table1;
	}

}
