<%@ page import="in2.liferay.crud.horari.model.Horari" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.LinkedHashMap" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/init.jsp" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% List<Horari> horariList = (List<Horari>)request.getAttribute("horariList"); %>
<% List<Horari> horariAvui = (List<Horari>)request.getAttribute("horariAvui"); %>
<% LinkedHashMap<Date, List<Date>> hashMes = (LinkedHashMap<Date, List<Date>>)request.getAttribute("hashMes"); %>
<% int horesTotalsDelMes = (int)request.getAttribute("horesTotalsDelMes"); %>
<% int minTotalsDelMes = (int)request.getAttribute("minTotalsDelMes"); %>
<% int horasTotalesHoy = (int)request.getAttribute("horasTotalesHoy"); %>
<% int minTotalesHoy = (int)request.getAttribute("minTotalesHoy"); %>
<% String avui = (String)request.getAttribute("avui"); %>

<portlet:actionURL name="addDesde" var="addDesdeUrl"/>

<portlet:actionURL name="addHasta" var="addHastaUrl">
	<portlet:param name="horariId" value="<%=String.valueOf(horariAvui.get(horariAvui.size()-1).getFooId())%>" />
</portlet:actionURL>

<portlet:renderURL var="addHorariRenderUrl">
	<portlet:param name="mvcPath" value="/add-horari.jsp" />
</portlet:renderURL>

<table class="table table-striped tablehorari">
	<tr>
		<th class="titol">
			<h1>
				<%= avui %>
			</h1>
		</th> <%--"el dia de hoy" --%>
	</tr>

	<% if (!horariAvui.isEmpty()) { %>

	<c:forEach items="${horariAvui}" var="horari">

		<portlet:actionURL name="deleteHorari" var="deleteHorariActionURL">
			<portlet:param name="horariId" value="${horari.getFooId()}" />
		</portlet:actionURL>

		<tr>
			<fmt:formatDate value="${horari.getDesde()}" var="formattedDateDesde" type="date" pattern="HH:mm" />
			<fmt:formatDate value="${horari.getHasta()}" var="formattedDateHasta" type="date" pattern="HH:mm" />
			<td>${formattedDateDesde} - ${formattedDateHasta}
				<a href="<%=deleteHorariActionURL%>">
					<i id = "gliph1" class="glyphicon glyphicon-remove glrm"></i>
				</a>
			</td>

		</tr>
	</c:forEach>
	<% }else{ %>
	<br>
	<tr>
		<h1 class="no-reg">No hay registros</h1> ////////////////////////////////////////////////////////// mirar esto
	</tr>
	<br>

	<% } %>
</table>

<div class="dreta" style="float: right">
	<h3 style="margin-bottom: 0" >
		<br>
		Total de hoy: <%= horasTotalesHoy %>h <%= minTotalesHoy %>m <br><br>
		Total del mes: <%= horesTotalsDelMes %>h <%= minTotalsDelMes %>m  <br><br>
	</h3>
	<a href="<%= addHorariRenderUrl %>" class="regMan">Añadir registros manualmente</a>

	<br>
	<br>
</div>

<br>

<% if (horariAvui.get(horariAvui.size()-1).getHasta() == null && !horariAvui.isEmpty()) { %>

<div class="mb-5 botEnt">
	<a href="<%= addHastaUrl %>" class="btn sortida">
		 Salida
	</a>
</div>

<% }else{ %>

<div class="mb-5 botSal">
	<a href="<%= addDesdeUrl %>" class="btn entrada">
		 Entrada
	</a>
</div>
<% } %>

<div class="regMes">
	<br>
	<br>
	<table>
		<tr>
		<c:forEach items="${hashMes.entrySet()}" var="horari">
		<th class ="tableth">
			<fmt:formatDate value="${horari.getKey()}" var="formattedDateHoy" type="date" pattern="dd-MM-yyyy" />
			<div class="tabs">
			<table class ="table table-striped tableMes">

				<tr>
					<th class="titol">
						<h1>
								${formattedDateHoy}
						</h1>
					</th> <%--"el dia de hoy" --%>

				</tr>

			<c:forEach items="${horari.getValue()}" var="horariAvui">
				<portlet:actionURL name="deleteHorari" var="deleteHorariActionURL">
					<portlet:param name="horariId" value="${horariAvui.getFooId()}" />
				</portlet:actionURL>

				<tr>
					<fmt:formatDate value="${horariAvui.getDesde()}" var="formattedDateDesde" type="date" pattern="HH:mm" />
					<fmt:formatDate value="${horariAvui.getHasta()}" var="formattedDateHasta" type="date" pattern="HH:mm" />
					<td>${formattedDateDesde} - ${formattedDateHasta}
						<a href="<%=deleteHorariActionURL%>">
							<i id = "gliph2" class="glyphicon glyphicon-remove glrm"></i>
						</a>
					</td>

				</tr>
			</c:forEach>
				</table>
			</div>
		</th>
		</c:forEach>

		</tr>
	</table>
</div>

<style>

	.regMes{
		overflow-y:hidden;
		overflow-x:scroll;
		width: 100%;
	}
	.regMan{
		display: flex;
		justify-content: center;
		align-items: center;
	}

	.glrm{
		color: lightslategrey;
		padding-left: 3px;
	}
	.tableMes
	{
		width: max-content;
		font-weight: normal;
	}
	.tableth
	{
		padding-left: 40px;
		text-align: center;
		vertical-align: text-top;
	}

	.sortida
	{
		background-color: #ff0000;
	}
	.sortida:hover{ background-color: #a80000;}
	.entrada{
		background-color: #64db64;
		color: darkslategrey;

	}
	.entrada:hover {background-color: #398e3b;}
	.botEnt
	{
		margin-left: 210px;
		margin-top: 15px;
		margin-right:auto;
		text-align:center;

	}
	.botSal
	{
		margin-left: 199px;
		margin-top: 15px;
		margin-right:auto;
		text-align:center;

	}
	.titol
	{
		text-align:center;
		vertical-align: middle;
	}
	.tablehorari
	{
		margin-left:auto;
		margin-right:auto;
		text-align:center;
		table-layout: auto;
		width: 25%;
	}
	.no-reg
	{
		text-align:center;
		margin-left:auto;
		margin-right:auto;
	}
</style>