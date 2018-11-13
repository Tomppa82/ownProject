<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1 align="center">Liiga hockey teams</h1>
<table style="width:100%">
<tr>
<col align="left">
<th align="left">City</th>
<th align="left">Team</th>
<th align="left">Establish year</th>
<th align="left">Championship count</th>
<th align="left">Current rank</th>
<th align="left">Coach</th>
</tr>
    <c:forEach var="currentTeamDetails" items="${teams}">
        <tr>
            <td><c:out value="${currentTeamDetails.cityName}"/></td>
            <td><c:out value="${currentTeamDetails.teamName}"/></td>
            <td><c:out value="${currentTeamDetails.teamDetails.establish_year}"/></td>
            <td><c:out value="${currentTeamDetails.teamDetails.champions_count}"/></td>
            <td><c:out value="${currentTeamDetails.teamDetails.current_rank}"/></td>
            <td><c:out value="${currentTeamDetails.teamDetails.coach}"/></td>
            </div>
        </tr>
    </c:forEach>
</table>
<iframe src="http://liiga.fi/fi/sarjataulukko" height="529" width="25%" scrolling="no" style="max-width:1300px; min-width: 275px"></iframe>
</body>
</html>
