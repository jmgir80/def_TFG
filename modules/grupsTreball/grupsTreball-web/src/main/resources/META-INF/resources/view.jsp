<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="/init.jsp" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="java.util.List" %>


<% HashMap<String, List<User>> directori = (HashMap<String, List<User>>)request.getAttribute("directori"); %>

    <c:forEach items="${directori.entrySet()}" var="grup">

        <h2>${grup.getKey()}</h2>
        <table class="table">
        <tr>
            <th>Nombre</th>
            <th>Correo</th>

        </tr>
            <% boolean capDeGrup = true; %>

        <c:forEach items="${grup.getValue()}" var="usuari">

            <% if (capDeGrup) { %>
            <tr>
                <td><strong>${usuari.getFullName()}</strong></td>
                <td class ="correu"><strong>${usuari.getOriginalEmailAddress()}</strong></td>
            </tr>
            <% } else { %>
            <tr>
                <td>${usuari.getFullName()}</td>
                <td class ="correu">${usuari.getOriginalEmailAddress()}</td>

            </tr>

            <% } %>

            <% capDeGrup = false; %>

        </c:forEach>

        </table>
        <br>
        <br>
    </c:forEach>

<style>

    .correu
    {
        width: 50%;
    }
</style>




