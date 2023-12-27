package Tag;

import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is my custom Tag<h1/>");
			out.println("<p>This is my custom paragraph</p>");
			out.println(new Date().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}