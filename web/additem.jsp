<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String temp=null;
    String item=request.getParameter("itemcode");
    String current=(String)session.getAttribute("currentkey");
    if(current!=null && item!=null)
    {
        current=new String(current+item);
    }
    else if(current==null)
    current=new String(item);
    else
        current=new String(current);
    session.setAttribute("currentkey",current);
%>    
<html>
    <head>
<title>A trial shopping site by Rajeev Ranjan</title>

</head>
<body>

    <%
if(((String)session.getAttribute("namekey"))==null)    
{
    response.sendRedirect("index.jsp");
} 
else
{
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    try
    {
        Class.forName("oracle.jdbc.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
        ps=con.prepareStatement("update customer set kart=? where email=?");
        ps.setString(1,current);
        ps.setString(2,(String)session.getAttribute("emailkey"));
        rs=ps.executeQuery();
        String kart=new String(current);
        session.setAttribute("kartkey",kart);
        response.sendRedirect("index1.jsp");
    }
    catch(Exception e)
    {
        System.out.println(e.toString());
    }
}
    
    %>
</body>
</html>
