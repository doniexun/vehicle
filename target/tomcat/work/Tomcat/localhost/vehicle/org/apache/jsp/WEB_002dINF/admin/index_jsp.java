/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-20 06:55:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/common.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/style.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\t#usern{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("#usern1{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\ttop:65px;\r\n");
      out.write("\t/* left:  */\r\n");
      out.write("}\r\n");
      out.write("#usern:hover #usern1{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery.SuperSlide.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("      $(\".sideMenu\").slide({\r\n");
      out.write("         titCell:\"h3\", \r\n");
      out.write("         targetCell:\"ul\",\r\n");
      out.write("         defaultIndex:0, \r\n");
      out.write("         effect:'slideDown', \r\n");
      out.write("         delayTime:'500' , \r\n");
      out.write("         trigger:'click', \r\n");
      out.write("         triggerTime:'150', \r\n");
      out.write("         defaultPlay:true, \r\n");
      out.write("         returnDefault:false,\r\n");
      out.write("         easing:'easeInQuint',\r\n");
      out.write("         endFun:function(){\r\n");
      out.write("              scrollWW();\r\n");
      out.write("         }\r\n");
      out.write("       });\r\n");
      out.write("      $(window).resize(function() {\r\n");
      out.write("          scrollWW();\r\n");
      out.write("      });\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  function scrollWW(){\r\n");
      out.write("    if($(\".side\").height()<$(\".sideMenu\").height()){\r\n");
      out.write("       $(\".scroll\").show();\r\n");
      out.write("       var pos = $(\".sideMenu ul:visible\").position().top-38;\r\n");
      out.write("       $('.sideMenu').animate({top:-pos});\r\n");
      out.write("    }else{\r\n");
      out.write("       $(\".scroll\").hide();\r\n");
      out.write("       $('.sideMenu').animate({top:0});\r\n");
      out.write("       n=1;\r\n");
      out.write("    }\r\n");
      out.write("  } \r\n");
      out.write("\r\n");
      out.write(" var n=1;\r\n");
      out.write("function menuScroll(num){\r\n");
      out.write("  var Scroll = $('.sideMenu');\r\n");
      out.write("  var ScrollP = $('.sideMenu').position();\r\n");
      out.write("  /*alert(n);\r\n");
      out.write("  alert(ScrollP.top);*/\r\n");
      out.write("  if(num==1){\r\n");
      out.write("     Scroll.animate({top:ScrollP.top-38});\r\n");
      out.write("     n = n+1;\r\n");
      out.write("  }else{\r\n");
      out.write("    if (ScrollP.top > -38 && ScrollP.top != 0) { ScrollP.top = -38; }\r\n");
      out.write("    if (ScrollP.top<0) {\r\n");
      out.write("      Scroll.animate({top:38+ScrollP.top});\r\n");
      out.write("    }else{\r\n");
      out.write("      n=1;\r\n");
      out.write("    }\r\n");
      out.write("    if(n>1){\r\n");
      out.write("      n = n-1;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<title>车辆维护管理系统-管理员界面</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"top\">\r\n");
      out.write("      <div id=\"top_t\">\r\n");
      out.write("        <div id=\"logo\" class=\"fl\"></div>\r\n");
      out.write("        <div id=\"photo_info\" class=\"fr\">\r\n");
      out.write("          <div id=\"photo\" class=\"fl\">\r\n");
      out.write("             <a href=\"#\" id=\"usern\">\r\n");
      out.write("              <img src=\"images/a.png\" alt=\"\" width=\"60\" height=\"60\">\r\n");
      out.write("              <div id=\"usern1\">\r\n");
      out.write("                <p>用户姓名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("                <p>用户身份：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("                <p></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"base_info\" class=\"fr\">\r\n");
      out.write("            <div class=\"help_info\">\r\n");
      out.write("              <a href=\"1\" id=\"hp\">&nbsp;</a>\r\n");
      out.write("              <a href=\"2\" id=\"gy\">&nbsp;</a>\r\n");
      out.write("              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/BaseAction_logout\" id=\"out\">&nbsp;</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"info_center\">\r\n");
      out.write("               admin\r\n");
      out.write("              <span id=\"nt\">通知</span><span><a href=\"#\" id=\"notice\">3</a></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"side_here\">\r\n");
      out.write("        <div id=\"side_here_l\" class=\"fl\"></div>\r\n");
      out.write("        <div id=\"here_area\" class=\"fl\">当前位置：</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"side\">\r\n");
      out.write("        <div class=\"sideMenu\" style=\"margin:0 auto\">\r\n");
      out.write("          <h3>用户管理</h3>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/UserAction_addUser\" target=\"right\">增加用户</a></li> \r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/UserAction_userList\" target=\"right\">用户列表</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <h3> 车辆管理</h3>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/VehicleAction_addVehicleList\" target=\"right\">车辆备案</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/VehicleAction_vehicleList\" target=\"right\">车辆列表</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/VehicleAction_maturityVehicleList\" target=\"right\">到期车辆列表</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <h3>维护信息管理</h3>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/MaintainAction_addMaintain\" target=\"right\">信息录入</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/MaintainAction_maintainList\" target=\"right\">信息列表</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <h3>系统设置</h3>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"\" target=\"right\">修改密码</a></li>\r\n");
      out.write("            <li><a href=\"\" target=\"right\">关于系统</a></li>\r\n");
      out.write("          </ul>          \r\n");
      out.write("       </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("       <iframe name=\"right\" id=\"rightMain\" src=\"\" frameborder=\"no\" scrolling=\"auto\" width=\"100%\" height=\"auto\" allowtransparency=\"true\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"bottom\">\r\n");
      out.write("      <div id=\"bottom_bg\">版权:未来</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"scroll\">\r\n");
      out.write("          <a href=\"javascript:;\" class=\"per\" title=\"使用鼠标滚轴滚动侧栏\" onClick=\"menuScroll(1);\"></a>\r\n");
      out.write("          <a href=\"javascript:;\" class=\"next\" title=\"使用鼠标滚轴滚动侧栏\" onClick=\"menuScroll(2);\"></a>\r\n");
      out.write("    </div>\r\n");
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
}
