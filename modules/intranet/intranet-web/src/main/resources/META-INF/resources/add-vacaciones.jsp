<%@ include file="init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="javax.portlet.RenderRequest" %>



<liferay-theme:defineObjects />
<portlet:defineObjects />







<portlet:actionURL name="addVacaciones" var="addVacacionesUrl"/>

<h1>Solicitud de vacaciones</h1>



<aui:form action="<%=addVacacionesUrl%>"  name="vacacionesForm" method="POST" >
    <aui:input name="formDesde" type="date" label="Desde:" id="desde">
        <aui:validator name="required"/>
        <aui:validator errorMessage="La fecha tiene que ser igual o menor que la fecha final"
                       name="custom">

            function(val, fieldNode, ruleValue) {



            if (document.getElementById("<portlet:namespace/>hasta").value != "")
            {
            var desd = new Date(val);
            var hast = new Date(document.getElementById("<portlet:namespace/>hasta").value);
            if(desd.getTime() <= hast.getTime()){
            console.log("<portlet:namespace />checkOtherDate");

            return true;
            }else{
            return false;
            }
            }else{
            return true
            }
            }

        </aui:validator>


    </aui:input>

    <aui:input name="formHasta" type="date" label="Hasta:" id="hasta">
        <aui:validator name="required"/>
        <aui:validator errorMessage="La fecha tiene que ser igual o mayor que la fecha inicial"
                       name="custom">

            function(val, fieldNode, ruleValue) {
            <portlet:namespace />checkOtherDate("<portlet:namespace />formDesde");
            if (document.getElementById("<portlet:namespace/>desde").value != "")
            {
            var desd = new Date(document.getElementById("<portlet:namespace/>desde").value);
            var hast = new Date(val);
            if(desd.getTime() <= hast.getTime()){
            console.log("<portlet:namespace />checkOtherDate");

            return true;
            }else{
            return true;
            }
            }else{return true;}
            }
        </aui:validator>

    </aui:input>

    <aui:input name="formComments" type="textarea" label="Comentario:">
        <aui:validator name=""/>
    </aui:input>

    <aui:script>

        function <portlet:namespace />checkOtherDate(fieldName) {
        alert("entro");
        console.log("va");
        var formValidator = Liferay.Form.get('<portlet:namespace />vacacionesForm').formValidator;
        formValidator.validateField(fieldName);
        }
    </aui:script>

    <script type="text/javascript">
        function submitVacForm() {


            var desde = Date.parse(document.getElementById("<portlet:namespace/>desde").value);
            var hasta = Date.parse(document.getElementById("<portlet:namespace/>hasta").value);
            alert(desde);
            if (desde > hasta) {
                SessionErrors.add(renderRequest, "error");
                alert ("Error!");
            }else{
                document.<portlet:namespace />vacacionesForm.submit();
            }




        }
    </script>


    <aui:button type="button" name="" value="Submit" onClick="submitVacForm()" primary="true"> </aui:button>



</aui:form>

<liferay-ui:error key="err1" message="Third message" translateMessage="false"/>

<liferay-ui:error key="error" message="Sorry, an error prevented saving your greeting" />

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

    /* custom styles */
    input {
        border: 1px solid #c4c4c4;
        border-radius: 5px;
        background-color: #fff;
        padding: 3px 5px;
        box-shadow: inset 0 3px 6px rgba(0,0,0,0.1);
        width: 190px;
    }
</style>