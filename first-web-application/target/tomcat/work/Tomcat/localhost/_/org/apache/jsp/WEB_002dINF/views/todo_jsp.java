/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-04-01 07:54:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class todo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fclass_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>welcome</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\t    \t\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"container\">\r\n");
      out.write("<h1>This is add to do</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/todo.jsp(19,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/views/todo.jsp(19,0) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("todo");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write('\r');
            out.write('\n');
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            if (_jspx_meth_form_005fhidden_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("<fieldset class=\"form-group\">\r\n");
            if (_jspx_meth_form_005flabel_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/todo.jsp(25,0) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("desc");
            // /WEB-INF/views/todo.jsp(25,0) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setCssClass("text-warning");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write('\r');
            out.write('\n');
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("</fieldset>\r\n");
            out.write("\r\n");
            out.write("<input type=\"submit\" class=\"btn btn-success\" name=\"add\" value=\"Submit\">\r\n");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t    <script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/todo.jsp(20,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("id");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/todo.jsp(21,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f1.setPath("user");
    int[] _jspx_push_body_count_form_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f1 = _jspx_th_form_005fhidden_005f1.doStartTag();
      if (_jspx_th_form_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/todo.jsp(22,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f2.setPath("targetDate");
    int[] _jspx_push_body_count_form_005fhidden_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f2 = _jspx_th_form_005fhidden_005f2.doStartTag();
      if (_jspx_th_form_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f0 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/todo.jsp(24,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f0.setPath("desc");
    int[] _jspx_push_body_count_form_005flabel_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f0 = _jspx_th_form_005flabel_005f0.doStartTag();
      if (_jspx_eval_form_005flabel_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Description");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.reuse(_jspx_th_form_005flabel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/todo.jsp(26,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("desc");
    // /WEB-INF/views/todo.jsp(26,0) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
    // /WEB-INF/views/todo.jsp(26,0) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
    // /WEB-INF/views/todo.jsp(26,0) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "required", "required");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }
}
