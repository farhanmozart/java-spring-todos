<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
	    <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
		<title>List Todos Page</title>
	</head>
	<body>
       <div class="container">
           <nav class="navbar navbar-light bg-light">
             <div class="container-fluid">
               <a class="navbar-brand" href="#">
                 <h2>IT APD Todo-List</h2>
               </a>
             </div>
           </nav>
           <hr>
           <div>
               <h3>Enter Todo Details</h3>
           </div>
            <form method="post">
           	   <section class="vh-100 gradient-custom">
                    <div class="container py-5 h-100">
                      <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                          <div class="card bg-dark text-white" style="border-radius: 1rem;">
                            <div class="card-body p-5 text-center">

                              <div class="mb-md-5 mt-md-4 pb-5">

                                <h2 class="fw-bold mb-2 text-uppercase">Add Todo</h2>
                                <p class="text-white-50 mb-5">Please enter your todo details</p>

                                <div class="form-outline form-white mb-4">
                                  <input type="text" name="description" class="form-control form-control-lg" />
                                  <label class="form-label" for="description">Description</label>
                                </div>

                                <div class="form-outline form-white mb-4">
                                  <input type="date" name="targetDate" class="form-control form-control-lg" />
                                  <label class="form-label" for="targetDate" placeholder="yyyy-MM-dd">Target Date</label>
                                </div>

                                <div class="form-outline form-white mb-4">
                                  <input type="text" name="isDone" class="form-control form-control-lg" />
                                  <label class="form-label" for="isDone">Is Done?</label>
                                </div>

                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Submit</button>

                                <div class="d-flex justify-content-center text-center mt-4 pt-1">
                                  <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                                  <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                                  <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
                                </div>

                              </div>

                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </section>
                  </form>
       </div>
		<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
		<script src="webjars\jquery\3.6.0\jquery.min.js"></script>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>

	</body>
</html>