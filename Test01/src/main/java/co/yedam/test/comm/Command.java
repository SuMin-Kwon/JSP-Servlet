package co.yedam.test.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
