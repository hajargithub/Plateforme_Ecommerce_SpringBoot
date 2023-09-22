<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en"> 
<head>
    <title>Sign Up</title>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta name="description" content="sign up">
    <meta name="author" content="Group1">    
    <link rel="shortcut icon" href="favicon.ico"> 
    
    <!-- FontAwesome JS-->
    <script defer src="assets/plugins/fontawesome/js/all.min.js"></script>
    
    <!-- App CSS -->  
    <link id="theme-style" rel="stylesheet" href="assets/css/portal.css">

</head> 

<body class="app app-signup p-0">    	
    <div class="row g-0 app-auth-wrapper">
	    <div class="col-12 col-md-7 col-lg-6 auth-main-col text-center p-5">
		    <div class="d-flex flex-column align-content-end">
			    <div class="app-auth-body mx-auto">	
				    <div class="app-branding"><img class="logo-icon me-2" src="assets/images/l1.png" alt="logo"></div>			
	
					<div class="auth-form-container text-start mx-auto">
						<%--@elvariable id="U" type=""--%>


							<form:form class="auth-form auth-signup-form" action="Signup2" method="post" modelAttribute="user">
								<form:hidden path="idUser" value="${idUser}" />


								<div class="email mb-3">
									<label class="sr-only" for="nom">Nom</label>
									<form:input id="nom" path="nom" type="text" class="form-control signup-name" placeholder="Nom" required="required" />
								</div>
								<div class="email mb-3">
									<label class="sr-only" for="prenom">Prénom</label>
									<form:input id="prenom" path="prenom" type="text" class="form-control signup-name" placeholder="Prenom" required="required" />
								</div>
								<div class="email mb-3">
									<label class="sr-only" for="age">Age</label>
									<form:input id="age" path="age" type="text" class="form-control signup-name" placeholder="Age" required="required" />
								</div>
								<div class="email mb-3">
									<label class="sr-only" for="date_naissance">Date de naissance</label>
									<form:input id="date_naissance" path="date_naissance" type="date" class="form-control signup-name" placeholder="Date naissance" required="required" />
								</div>
								<div class="email mb-3">
									<label class="sr-only" for="signup-email">Email</label>
									<form:input id="signup-email" path="email" type="email" class="form-control signup-email" placeholder="Email" required="required" />
								</div>
								<div class="password mb-3">
									<label class="sr-only" for="signup-password">Password</label>
									<form:password id="signup-password" path="password" class="form-control signup-password" placeholder="Password" required="required" />
								</div>
								<div class="extra mb-3">
								</div><!--//extra-->

								<div class="text-center">
									<button type="submit" class="btn app-btn-primary w-100 theme-btn mx-auto">Sign Up</button>
								</div>
							</form:form>

							<div class="auth-option text-center pt-5">Already have an account? <a class="text-link" href="/Login" >Log in</a></div>
					</div><!--//auth-form-container-->	
					
					
				    
			    </div><!--//auth-body-->	
		    </div><!--//flex-column-->   
	    </div><!--//auth-main-col-->
	    <div class="col-12 col-md-5 col-lg-6 h-100 auth-background-col">
		    <div class="auth-background-holder">			    
		    </div>
		    <div class="auth-background-mask"></div>

	    </div><!--//auth-background-col-->
    
    </div><!--//row-->


</body>
</html> 

