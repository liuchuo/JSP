/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.14
 * Generated at: 2017-04-24 23:32:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class note_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/1.jsp", Long.valueOf(1493072648000L));
    _jspx_dependants.put("/WEB-INF/tags/tagfile1.tag", Long.valueOf(1493076773000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write("\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("\n");
      out.write("<!-- jsp中的java程序片 -->\n");
      out.write("如果一个正整数刚好等于它的真因子之和，这样的正整数为完数。</br>例如，6=1+2+3，因此6就是一个完数。</br>1到1000内的完数有：\n");
      out.write("    ");
 int i, j, sum = 0;
        for (i = 1; i <= 1000; i++) {
            sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0)
                    sum = sum + j;
            }
            if (sum == i)
                out.print(" " + i);
    }
    
      out.write("\n");
      out.write("\n");
      out.write("<!-- 表达式 -->\n");
 double x = 0.9, y = 3; 
      out.write("\n");
      out.write("<P>Sin(");
      out.print( x );
      out.write(')');
      out.write('除');
      out.write('以');
      out.print( y );
      out.write('等');
      out.write('于');
      out.print( Math.sin(x)/y );
      out.write("</P>\n");
      out.write("\n");
      out.write("<!-- 指令标记 -->\n");
      out.write("<!-- page指令标记 -->\n");
      out.write("page指令用来定义整个JSP页面的一些属性和这些属性的值，page指令标记可以制定如下属性的值：<br>\n");
      out.write("contentType，如contentType=\"text/html;charset=UTF-8\"，所以说contentType属性指定JSP页面相应的MIME类型和JSP页面字符的编码。<br>\n");
      out.write("\n");
      out.write("import，如import=\"java.util.*\"，JSP页面默认import属性已经有如下值：\"java.lang.*\"、“javax.servlet.*\"、\"javax.servlet.jsp\"、\"javax.servlet.http.*\"<br>\n");
      out.write("\n");
      out.write("language，如language=\"java\" 只能取java，不写的话默认是java～<br>\n");
      out.write("\n");
      out.write("session，用于设置是否需要使用内置的session对象。session属性的属性值可以是true或false，默认是true～<br>\n");
      out.write("\n");
      out.write("buffer，用来指定内置输出流对象out设置的缓冲区的大小或不使用缓冲区，默认值是8KB，可取none<br>\n");
      out.write("\n");
      out.write("autoFlush<br>\n");
      out.write("\n");
      out.write("isThreadSafe<br>\n");
      out.write("\n");
      out.write("pageEncoding<br>\n");
      out.write("\n");
      out.write("info<br>\n");
      out.write("\n");
      out.write("不允许两次使用page指令给contentType属性指定不同的值<br>\n");
      out.write("\n");
      out.write("<!-- include指令标记 -->\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("</head>\n");
      out.write("<BODY BGCOLOR=pink>\n");
      out.write("<FONT Size=3>\n");
      out.write("<P>这是一个简单的JSP页面\n");
 //这是Java程序片
    int tempsum = 0;
    for (int k = 1; k <= 100; k++) {
        tempsum += k;
    }

      out.write("</P>\n");
      out.write("<P>1到100的连续和是：");
      out.print( tempsum );
      out.write("</P>\n");
      out.write("</FONT>\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
      out.write("\n");
      out.write("<!-- include的jsp文件中不能重复定义变量i和sum，否则会报错。 -->\n");
      out.write("\n");
      out.write("<!-- 动作标记 -->\n");
      out.write("与静态插入文件的include指令标记不同，当JSP引擎把JSP页面转译成Java文件时，不把JSP页面中的动作指令include所指定的文件与JSP页面合并一个新的JSP页面，而是告诉Java解释器，这个文件在JSP运行时才被处理。\n");
      out.write("<!-- include动作标记 -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "1.jsp", out, false);
      out.write("\n");
      out.write("<!-- param动作标记 -->\n");
      out.write("使用request.getParameter(\"name的值\"); 获取param子标记中name属性的值\n");
      out.write("<!-- forward动作标记 -->\n");
      out.write("\n");
      out.write("<!-- plugin动作标记 -->\n");
      out.write("\n");
      out.write("<!-- useBean动作标记 -->\n");
      out.write("Sun公司倡导，用HTML完成JSP页面的静态部分用JavaBean完成动态部分，实现真正意义上的静态和动态之分割。<br>\n");
      out.write("\n");
      out.write("<!-- Tag文件与Tag标记 -->\n");
      out.write("\n");
      out.write("以下是调用Tag文件的效果：<br>\n");
      if (_jspx_meth_myTagName_005ftagfile1_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_myTagName_005ftagfile1_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  myTagName:tagfile1
    org.apache.jsp.tag.web.tagfile1_tag _jspx_th_myTagName_005ftagfile1_005f0 = new org.apache.jsp.tag.web.tagfile1_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_myTagName_005ftagfile1_005f0);
    try {
      _jspx_th_myTagName_005ftagfile1_005f0.setJspContext(_jspx_page_context);
      _jspx_th_myTagName_005ftagfile1_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_myTagName_005ftagfile1_005f0);
    }
    return false;
  }
}
