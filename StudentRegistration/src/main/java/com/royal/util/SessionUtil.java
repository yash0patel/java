package com.royal.util;

import jakarta.servlet.http.HttpSession;

public class SessionUtil {
	public static boolean isLoggedIn(HttpSession session) {
        if (session != null) {
            Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");
            return Boolean.TRUE.equals(isLoggedIn);
        }
        return false;
    }
}
