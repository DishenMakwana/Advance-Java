<%-- 
    Document   : userdetails
    Created on : 27 Apr, 2021, 11:09:07 AM
    Author     : Dishen
--%>

<jsp:useBean id="userinfo" class="com.vvp.web.Details"></jsp:useBean> 
<jsp:setProperty property="*" name="userinfo"/> 

You have enterted below details:<br> 
<jsp:getProperty property="username" name="userinfo"/><br> 
<jsp:getProperty property="password" name="userinfo"/><br> 
<jsp:getProperty property="email" name="userinfo" /><br>
<jsp:getProperty property="phone_number" name="userinfo" /><br>
