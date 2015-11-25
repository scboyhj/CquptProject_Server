package com.cqupt.deal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.bean.RecordItem;
import com.google.gson.Gson;

public class RecordItemsServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("user_id");

		System.out.println("RecordItemsServer idString:" + idString);

		// DataOutputStream dataOutputStream = new DataOutputStream(
		// resp.getOutputStream());
		// dataOutputStream.writeBytes("ok");

		// dataOutputStream.close();
		RecordItem item1 = new RecordItem();
		item1.recordId = "1";
		item1.recordTeacher = "����";
		item1.recordTitle = "�Ի�����֪ʶ��������ʶ";
		item1.recordTime = "2015-10-16 14:00:08";
		RecordItem item2 = new RecordItem();
		item2.recordId = "2";
		item2.recordTeacher = "�";
		item2.recordTitle = "�ߵ���ѧ�и����۵�Ӧ��";
		item2.recordTime = "2015-10-18 09:10:22";
		RecordItem item3 = new RecordItem();
		item3.recordId = "3";
		item3.recordTeacher = "������";
		item3.recordTitle = "��ɢ��ѧ������";
		item3.recordTime = "2015-10-18 09:10:22";

		ArrayList<RecordItem> arrayList = new ArrayList<RecordItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);

		Gson gson = new Gson();
		String string = gson.toJson(arrayList);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(string);

	}
}
