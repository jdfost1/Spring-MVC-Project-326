<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Security Authorization -->
<sec:authorize var="auth" access="hasAuthority('USER')" />

<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="/budgetbuddy">Budget Buddy</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Financial Quick Tools </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/budgetbuddy/tools/quick-budget">Quick
							Budget</a> <a class="dropdown-item"
							href="/budgetbuddy/tools/401k-calculator">401k Calculator</a> <a
							class="dropdown-item"
							href="/budgetbuddy/tools/compound-interest-calculator">Compound
							Interest Calculator</a>
					</div></li>
			</ul>
			<c:choose>
				<c:when test="${auth}">
					<form:form action="${pageContext.request.contextPath}/account/logout" method="post">
						<button type="submit" class="btn btn-outline-danger">Logout</button>
					</form:form>
				</c:when>
				<c:otherwise>
					<a class="btn btn-outline-success my-2 my-sm-0"
						href="/budgetbuddy/account/login" role="button">Login</a>
				</c:otherwise>
			</c:choose>
		</div>
	</nav>
</header>