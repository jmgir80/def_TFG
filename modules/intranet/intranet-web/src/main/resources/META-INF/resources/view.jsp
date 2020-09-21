<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ include file="init.jsp"%>

<%@ page import="in2.liferay.crud.intranet.model.Vacaciones" %>
<%@ page import="java.util.List" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<% List<Vacaciones> vacacionesList = (List<Vacaciones>)request.getAttribute("vacacionesList"); %> <%-- (List<Vacaciones>)request.getAttribute("vacacionesList"); %> --%>
<% boolean canValidate = Boolean.valueOf(String.valueOf(request.getAttribute("canValidate"))); %> <%-- Boolean.valueOf(String.valueOf(request.getAttribute("canValidate"))); %> --%>
<% boolean exists = Boolean.valueOf(String.valueOf(request.getAttribute("boolean"))); %>  <%-- Boolean.valueOf(String.valueOf(request.getAttribute("boolean"))); %> --%>
<portlet:renderURL var="addVacacionesRenderUrl">
	<portlet:param name="mvcPath" value="/add-vacaciones.jsp" />
</portlet:renderURL>

<div class="mb-5">
	<% if (exists) { %>
	<a href="<%= addVacacionesRenderUrl %>" class="btn btn-primary btn-default">
		<i class="glyphicon glyphicon-plus"></i> Add123 Vacaciones
	</a>
	<% } %>
</div>
<table class="table table-striped">
	<tr>
		<th>Username</th>
		<th>Desde</th>
		<th>Hasta</th>
		<th>Comentarios</th>
		<th>Estado</th>
		<th colspan="2" style="width: 100px">Acción</th>
	</tr>
	<c:forEach items="${vacacionesList}" var="vacaciones">

		<%--
		<portlet:renderURL var="updateVacacionesRenderURL">
			<portlet:param name="mvcPath" value="/update-vacaciones.jsp" />
			<portlet:param name="Estado" value="${vacaciones.getEstado()}" />
			<portlet:param name="vacacionesId" value="${vacaciones.getFooId()}" />
		</portlet:renderURL>
		--%>

		<portlet:actionURL name="validarVacaciones" var="validarVacacionesActionURL">
			<portlet:param name="vacacionesId" value="${vacaciones.getVacId()}" />
		</portlet:actionURL>

		<portlet:actionURL name="deleteVacaciones" var="deleteVacacionesActionURL">
			<portlet:param name="vacacionesId" value="${vacaciones.getVacId()}" />
		</portlet:actionURL>

		<tr>
			<td>${vacaciones.getUserName()}</td>
			<fmt:formatDate value="${vacaciones.getDesde()}" var="formattedDateDesde" type="date" pattern="dd/MM/yyyy" />
			<td>${formattedDateDesde}</td>
			<fmt:formatDate value="${vacaciones.getHasta()}" var="formattedDateHasta" type="date" pattern="dd/MM/yyyy" />
			<td>${formattedDateHasta}</td>
		 	<td>${vacaciones.getComentarios()}</td>
			<td>${ vacaciones.getStatus() == -1 ? "Aceptado" : "Pendiente" }</td>

				<%--
				<a href="<%=updateVacacionesRenderURL%>" class="btn btn-primary btn-default btn-sm px-2 py-1">
					<i class="glyphicon glyphicon-edit"></i>
				</a>
				--%>
			<c:choose>
				<c:when test="${canValidate==true}">
					<td class="text-center" style="width: 50px">
						<c:choose>
							<c:when test="${vacaciones.getStatus()>=0}">
								<a href="<%=validarVacacionesActionURL%>" class="btn btn-primary btn-default btn-sm px-2 py-1" id="boton1" role="button"
								   onclick="return confirm('Aceptar vacaciones');">

									 <i class="icon-ok"></i>
								</a>
							</c:when>
						</c:choose>
					</td>
					<td class="text-center" style="width:50px">
						<a href="<%=deleteVacacionesActionURL%>" class="btn btn-primary btn-default btn-sm px-2 py-1" id="boton2"  role="button"
						   onclick="return confirm('Rechazar vacaciones');">
							<i id = "gliph1" class="glyphicon glyphicon-remove"></i>
						</a>
					</td>

				</c:when>
			</c:choose>
				<%--<c:when test="${canValidate==false}">

                    <script>
                        $('#boton1').addClass('btn btn-primary btn-default btn-sm px-2 py-1 disabled');
                        $('#boton2').addClass(' btn btn-primary btn-default btn-sm px-2 py-1 disabled');
                    </script>
                        </c:when>
                    </c:choose>--%>
		</tr>
	</c:forEach>
</table>


