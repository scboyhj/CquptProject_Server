package com.cqupt.utils;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class DescryptByDESTool {
	public static String getDescrypt(String str) {

		SecretKeySpec keySpec = new SecretKeySpec("cquptaaa".getBytes(), "des");

		try {
			Cipher cipher = Cipher.getInstance("des");

			cipher.init(Cipher.DECRYPT_MODE, keySpec);

			byte[] bs = cipher.doFinal(Base64.decode(str));

		

			return new String(bs,"utf-8");

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
