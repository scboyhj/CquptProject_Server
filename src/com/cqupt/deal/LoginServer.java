package com.cqupt.deal;

import java.io.DataOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.utils.DescryptByDESTool;

public class LoginServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idString = req.getParameter("id");
		String pwdString = req.getParameter("pwd");
		System.out.println("idString:" + idString + " pwdString:" + pwdString);
		System.out.println("½âÎö£ºidString:" + idString + " pwdString:"
				+ DescryptByDESTool.getDescrypt(pwdString));

		// try {
		// Thread.currentThread().sleep(1000000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// DataOutputStream dataOutputStream = new DataOutputStream(
		// resp.getOutputStream());
		// dataOutputStream.writeBytes("ok");

		// dataOutputStream.close();

		resp.getWriter().write("ok");

	}
}
