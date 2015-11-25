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
import com.cqupt.bean.User;
import com.google.gson.Gson;

public class MyInfoServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("item_id");

		System.out.println("MyInfoServer item_id:" + idString);

		User table = initData();

		Gson gson = new Gson();
		String string = gson.toJson(table);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(string);

	}

	private User initData() {
		// TODO Auto-generated method stub
		User user = new User();
		user.myId = "1342432";
		user.myName = "Íõ½­ºé";
		user.myStatus = "½ÌÊÚ";
		user.mySubmit = "5";
		return user;
	}

}
