<%@page import="java.sql.*"%>
<%
    
    String itemcode=request.getParameter("itemcode");
    String current=(String)session.getAttribute("currentkey");
    String email=(String)session.getAttribute("emailkey");
    if(email==null)
    {
        if(itemcode.equals(current))
        {
            current=null;
            session.setAttribute("currentkey",current);
            response.sendRedirect("kart.jsp");
        }
        int i=current.indexOf("itemcode");
        if(i==-1)
        {
            response.sendRedirect("kart.jsp");
        }
        String temp1=current.substring(0,i);
        String temp2=current.substring(i+itemcode.length(), current.length());
        current=new String(temp1.concat(temp2));
        response.sendRedirect("kart.jsp");
    }
    else
    { 
        String kart=(String)session.getAttribute("kartkey");
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int i=current.indexOf(itemcode);
        if(i==-1)
        { 
            response.sendRedirect("kart1.jsp");
        }
        else{
            String temp1=current.substring(0,i);
            String temp2=current.substring(i+itemcode.length(), current.length());
            current=new String(temp1.concat(temp2));
            try
            { 
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                ps=con.prepareStatement("update customer set kart=? where email=?");
                ps.setString(1,current);
                ps.setString(2,email);
                ps.executeUpdate();
                kart=new String(current);
                session.setAttribute("kartkey",kart);
                session.setAttribute("currentkey",current);
                System.out.println(current+" ri "+itemcode);
                response.sendRedirect("kart1.jsp");
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
