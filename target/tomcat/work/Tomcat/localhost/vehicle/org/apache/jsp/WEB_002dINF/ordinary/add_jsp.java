/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-12 07:14:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.ordinary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>车辆维护系统-车辆备案</title>  \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/selectList.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("\t loadSelect(\"001\",\"category\",\"category.dict_id\"); \r\n");
      out.write("\t loadSelect(\"002\",\"operationStatus\",\"operationStatus.dict_id\"); \r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <font color=\"red\" >");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("  <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/OrdinaryAction_save\" method=\"post\"> \r\n");
      out.write("     <table>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>车牌号</th>\r\n");
      out.write("         <td><input type=\"text\" name=\"plateId\" id=\"plateId\" required  oninvalid=\"setCustomValidity('请填写车牌号');\" oninput=\"setCustomValidity('');\" /></td>    \r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>车辆类型</th>\r\n");
      out.write("         <td id=\"category\"></td> \r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>车辆型号</th>\r\n");
      out.write("         <td><input type=\"text\" name=\"model\" id=\"model\" required  oninvalid=\"setCustomValidity('请填写车牌号');\" oninput=\"setCustomValidity('');\" /></td> \r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>发动机型号</th>\r\n");
      out.write("         <td><input type=\"text\" name=\"engineId\" id=\"engineId\" required  oninvalid=\"setCustomValidity('请填写发动机编号');\" oninput=\"setCustomValidity('');\" /></td>\r\n");
      out.write("          \r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>车底盘号衍射</th>\r\n");
      out.write("         <td><input type=\"text\" name=\"carChassisId\" id=\"carChassisId\" required  oninvalid=\"setCustomValidity('请填写车底盘号衍射');\" oninput=\"setCustomValidity('');\" /></td>\r\n");
      out.write("          \r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>车辆重量</th>\r\n");
      out.write("         <td><input type=\"text\" name=\"weight\" id=\"weight\" required  oninvalid=\"setCustomValidity('请填写车辆重量');\" oninput=\"setCustomValidity('');\" /></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <th>出厂日期</th>\r\n");
      out.write("         <td><input type=\"date\" name=\"manufactureDate\" id=\"manufactureDate\" required  oninvalid=\"setCustomValidity('请选择出厂日期');\" oninput=\"setCustomValidity('');\" /></td> \r\n");
      out.write("       </tr>  \r\n");
      out.write("       <tr>\r\n");
      out.write("         <th><input type=\"submit\" value=\"进行备案\"/></th>\r\n");
      out.write("       </tr>       \r\n");
      out.write("     </table>\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /WEB-INF/ordinary/add.jsp(20,21) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("exception.message");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
