package controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * User: lmf@cic.tsinghua.edu.cn
 * Date: 13-11-25
 * Time: 上午9:17
 */
public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @ModelAttribute
    public void set(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = this.request.getSession();
    }
}
