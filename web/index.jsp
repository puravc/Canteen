<%-- 
    Document   : both
    Created on : May 27, 2013, 4:57:20 AM
    Author     : akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
        <%@taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        
   

      <!-- Three columns of text below the carousel -->
      <div class="page-header" >
        <h1 style="color: black;text-align: center ">Login</h1>
    </div>
      
      <s:form action="login" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal " style="margin-left:200px" >
                <s:textfield
                        label="Username"
                        name="username"
                        placeholder="Enter the College Id"
                        tooltip="Enter your Name here"/>

                <s:password
                        label="Password"
                        name="password"
                        placeholder="Enter your Password"
                        tooltip="Enter your Name here"
                        />
                
                <s:select
                        tooltip="Choose Your Favourite Color"
                        label="Type of Login"
                        list="{'User','Canteen'}"
                        name="type"/>
                <s:submit cssClass="btn-primary" style="margin-left:250px"/>
                
      </s:form>
 
    <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
