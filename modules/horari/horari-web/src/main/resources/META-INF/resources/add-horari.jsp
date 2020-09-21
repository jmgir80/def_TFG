<%@ include file="/init.jsp"%>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ page import="java.lang.Integer"%>

<%@ page contentType="text/html; charset=UTF-8" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:actionURL name="addHorari" var="addHorariUrl"/>


<portlet:renderURL var="atrasUrl">
    <portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<div class="mb-5">
    <a href="<%= atrasUrl %>">
        <i class="icon-chevron-left"></i> Atras
    </a>
</div>

<aui:form action="<%=addHorariUrl%>" name="horariForm" method="POST" >

    <p>Desde:</p>
    <liferay-ui:input-time name="desde" amPmParam="ampm" amPmValue="0" hourParam="hour" minuteParam="min" minuteInterval="30"/>

    <br/>
    <p>Hasta:</p>
    <div class="errorDesde" id="errorHasta" style="display: none; color: red ">
        Hasta no puede ser mas pequeño que Desde
    </div>

    <liferay-ui:input-time name="hasta" amPmParam="ampm" amPmValue="0" hourParam="hour" minuteParam="min" minuteInterval="30"/>

    <br/>
    <p>Dia:</p>
    <div class="errorDesde" id="errorDia" style="display: none; color: red ">
        No se puede sobrepasar el dia de hoy
    </div>
    <liferay-ui:input-date name="dia" yearValue="2020" monthValue="00" dayValue="01">
    </liferay-ui:input-date>

    <div class="errorDesde" id="errornull" style="display: none; color: red ">
        Todos los campos son obligatorios
    </div>

    <script type="text/javascript">
        function submitHorariForm() {

            var x = document.getElementById("errorHasta");
            var y = document.getElementById("errorDia");
            var z = document.getElementById("errornull");



            var des = document.getElementById("<portlet:namespace/>desde").value;
            var hast = document.getElementById("<portlet:namespace/>hasta").value;
            var dia = document.getElementById("<portlet:namespace/>dia").value;


            if( des && hast && dia ) {

                z.style.display = "none";

                var hhmmDes = des.split(":");
                var hhmmHast = hast.split(":");
                var diaSplit = dia.split("/");
                var minDes = (parseInt(hhmmDes[0]) * 60) + parseInt(hhmmDes[1]);
                var minHas = (parseInt(hhmmHast[0]) * 60) + parseInt(hhmmHast[1]);
                var valHasta = false;
                var valDia = false;
                var valNoNull = false;
                var avui = new Date();


                var diaDate = new Date(diaSplit[2], diaSplit[1]-1, diaSplit[0]);


                // var dateDes = new Date(0,0,0,hhmmDes[0],hhmmDes[1],0,0);
                //var dateHast = new Date(0,0,0,hhmmHast[0],hhmmHast[1],0,0);

                if (minHas <= minDes) {
                    x.style.display = "block";
                } else {
                    x.style.display = "none";
                    valHasta = true;
                }


                if (diaDate.getTime() > avui.getTime()) {
                    y.style.display = "block";
                } else {
                    y.style.display = "none";
                    valDia = true;
                }

                if (valDia && valHasta) {


                    document.<portlet:namespace />horariForm.submit();
                }
            }else {
                z.style.display = "block";

            }
        }
    </script>


    <br/>

    <aui:button type="button" name="" value="Agregar Horario" onClick="submitHorariForm()" primary="true"> </aui:button>

</aui:form>


<style>
    [type="date"] {
        background:#fff url(https://cdn1.iconfinder.com/data/icons/cc_mono_icon_set/blacks/16x16/calendar_2.png)  98% 50% no-repeat ;
    }
    [type="date"]::-webkit-inner-spin-button {
        display: none;
    }
    [type="date"]::-webkit-calendar-picker-indicator {
        opacity: 0;
    }
</style>