<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Wear a Fashion Category Bootstrap Responsive Website Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<c:url value="/resources/css" var="css"/>
<c:url value="/resources/js" var="js"/>
<c:url value="/resources/images" var="img"/>


<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="${css }/style.css" rel="stylesheet" media="all" />
<!--// bootstrap-css -->
<!--gallery pop-up-css file -->
<link rel="stylesheet" href="css/chocolat.css" type="text/css">
<!-- // gallery pop-up-css file -->

<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<!--// css -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="${js }"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
</head>
<body>
	<!-- banner -->
	<div class="banner" id="home">
		<div class="w3-header-bottom">
			<div class="w3layouts-logo">
				<h1>
					<a href="index.html">Wear </a>
					<i class="fa fa-shopping-bag" aria-hidden="true"></i>
					
				</h1>
			</div>
			<div class="top-nav">
						<nav class="navbar navbar-default">
								<div class="navbar-header">
									<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
									</button>
								</div>
							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li class="first-list"><a class="active" href="index.html">Home</a></li>
									<security:authorize access="hasRole('ROLE_ADMIN')">
									<li><a href="<c:url value="/category"/>">Category</a></li>
									<li><a href="<c:url value="/Product"/>">Product</a></li>
									<li><a href="<c:url value="/Supplier"/>">Supplier</a></li>
									</security:authorize>
									<li><a href="<c:url value="/Login"/>">Login</a></li>
									<li><a href="<c:url value="/User"/>">Signup</a></li>
			
									<li><a href="<c:url value="/j_spring_security_logout"/>">Logout</a></li>
									<li><a href="#about" class="scroll">About</a></li>
									<li><a href="#mail" class="scroll">Contact</a></li>
								</ul>	
								<div class="clearfix"> </div>
							</div>	
						</nav>		
			</div>
			<div class="agileinfo-social-grids">
				<ul>
					<li><a href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a href="#"><i class="fa fa-rss"></i></a></li>
					<li><a href="#"><i class="fa fa-vk"></i></a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="banner-info">
			<div class="container">
				<div class="w3-banner-info">
					<div class="slider">
						<div class="callbacks_container">
							<ul class="rslides callbacks callbacks1" id="slider4">
								<li>
									<div class="w3layouts-banner-info">
										<h3>Lorem<span>Fashion</span>ipsum</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla tincidunt tortor leo, at pulvinar metus accumsan vitae.</p>
										<div class="w3ls-button">
											<a href="#" data-toggle="modal" data-target="#myModal">Read More</a>
										</div>
									</div>
								</li>
								<li>
									<div class="w3layouts-banner-info">
										<h3>Nulla<span>Trends</span>lacinia</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla tincidunt tortor leo, at pulvinar metus accumsan vitae.</p>
										<div class="w3ls-button">
											<a href="#" data-toggle="modal" data-target="#myModal">Read More</a>
										</div>
									</div>
								</li>
							</ul>
						</div>
						<div class="clearfix"> </div>
									
									<!--banner Slider starts Here-->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- modal -->
	<div class="modal about-modal fade" id="myModal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header"> 
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
					<h4 class="modal-title">Wear fashions</h4>
				</div> 
				<div class="modal-body">
					<div class="agileits-w3layouts-info">
						<img src="images/pop1.jpg" alt="" />
						<p>Duis venenatis, turpis eu bibendum porttitor, sapien quam ultricies tellus, ac rhoncus risus odio eget nunc. Pellentesque ac fermentum diam. Integer eu facilisis nunc, a iaculis felis. Pellentesque pellentesque tempor enim, in dapibus turpis porttitor quis. Suspendisse ultrices hendrerit massa. Nam id metus id tellus ultrices ullamcorper.  Cras tempor massa luctus, varius lacus sit amet, blandit lorem. Duis auctor in tortor sed tristique. Proin sed finibus sem</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //modal -->
	<!-- about -->
	<div class="about wthree-about" id="about">
		<div class="container"> 
			<!-- about-section2 -->
			<div class="about-section abt-w3sec2">
				<div class="col-md-5 ab-text two w3-agileits">
					<h3 class="agileits-title">About</h3> 
					<h6>Itaque earum rerum hic tenetur a optio sapiente nihil impedit</h6>
					<p>Lorem ipsum Nam libero tempore cum soluta nobis esteligen dioptio cumque nihil impedit quo minus id quod maxime pla ceatfacere.Lorem Ipsum has been the industry's standard dummy text ever since.</p>
					<div class="start">
						<a href="#" class="hvr-bounce-to-bottom">Read more</a>
					</div> 
				</div>
				<div class="col-md-7 ab-left w3-agileits">
					<div class="grid">
						<div class="col-xs-6 abt-w3limg">
							<figure class="effect-jazz">
								<img src="images/a1.jpg" alt=""/>
								<figcaption>
									<h4>Best<span>looks</span></h4>  
									<p>Lorem ipsum Nam libero tempore cum soluta nobis est at facere nobis.</p> 
								</figcaption>			
							</figure> 
						</div>
						<div class="col-xs-6 abt-w3limg">
							<figure class="effect-jazz">
								<img src="images/a2.jpg" alt=""/>
								<figcaption>
									<h4>trend<span>point</span></h4>
									<p>Lorem ipsum Nam libero tempore cum soluta nobis est at facere nobis.</p> 
								</figcaption>			
							</figure> 
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<!-- //about-section2 -->
		</div>
	</div>
	<!-- //about --> 

	<!-- /services -->
	<div class="w3-services" id="services">
			<div class="w3-services-grids">
				<div class="col-md-4 w3-services-left-grid">
					<h3>our services</h3>
					<h4>Cras lacinia, nisl id dignissim ultrices</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In euismod faucibus quam, a sodales eros placerat vitae. Sed pretium fermentum luctus. Nunc at lectus ut ex blandit egestas. Pellentesque sed erat at diam lacinia accumsan. </p>
				</div>
				<div class="col-md-8 w3-services-right-grid">
				<div class="w3-icon-grid-gap1">
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-female" aria-hidden="true"></i>
						<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-thumb-tack" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-optin-monster" aria-hidden="true"></i>
						<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-bolt" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="clearfix"></div>
					</div>
					<div class="w3-icon-grid-gap2">
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-modx" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-linux" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-shopping-bag" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="col-md-3 w3-icon-grid1">
					<i class="fa fa-renren" aria-hidden="true"></i>
					<h3>lorem ipsum</h3>
					</div>
					<div class="clearfix"></div>
					</div>
				</div>
				<div class="clearfix"></div>
		</div>
	</div>

	<!-- //services -->
	<!-- /team -->
	<div class="w3-team" id="models">
	<div class="w3-team-head">
			<h3>Our Models</h3>
	</div>
		<div class="container">
			<div class="w3-team-grids">
				<div class="col-md-4 w3-team-grid">
					<img src="images/m1.jpg" alt="img">
					<h3>RICKY ROY</h3>
					<ul class="team-social">
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-rss"></i></a></li>
								</ul>
				</div>
				<div class="col-md-4 w3-team-grid">
				<img src="images/m2.jpg" alt="img">
					<h3>BEN STARC</h3>
					<ul class="team-social">
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-rss"></i></a></li>
								</ul>
				</div>
				<div class="col-md-4 w3-team-grid">
				<img src="images/m3.jpg" alt="img">
					<h3>MITCH JON</h3>
					<ul class="team-social">
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-rss"></i></a></li>
								</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //team -->
	<!-- portfolio -->
	<div class="portfolio" id="portfolio">
			<h3 class="w3ls_head">Portfolio</h3>
			<div class="container">
			<div class="portfolio-agile">
			<div class="main">
                <div class="view view-seventh">
					<a href="images/g1.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g1-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g2.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g2-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g3.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g3-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g4.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g4-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
					<a href="images/g5.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g5-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g6.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g6-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g7.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g7-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g8.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g8-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
				
        
			
                <div class="view view-seventh">
					<a href="images/g9.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g9-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g10.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g10-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g11.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g11-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
						
						</div>
					</a>
                </div>
                <div class="view view-seventh">
                    <a href="images/g12.jpg" class="b-link-stripe b-animate-go  thickbox">
						<img src="images/g12-.jpg" alt="" />
						<div class="mask">
							<h4>Wear fashions</h4>
							
						</div>
					</a>
                </div>
				<div class="clearfix"></div>
           
			</div>
			</div>
			</div>
	</div>
<!-- //portfolio -->


	<!-- testimonials -->
<div class="testimonials" id="testimonials">
	<div class="container">
		<div class="w3-testimonials-head">
		<h3>Testimonials</h3>
		</div>
		<div class="flexslider-info">
			<section class="slider1">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="w3l-info1">
								<div class="col-md-3 testimonials-grid-1">
									<img src="images/t1.jpg" alt="" />
								</div>
								<div class="col-md-9 testimonials-grid-2">
									<h4>Jonny d'cruz</h4>
									<h5>subtitles here</h5>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget tempus hendrerit sem ut.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="w3l-info1">
								<div class="col-md-3 testimonials-grid-1">
									<img src="images/t3.jpg" alt="" />
								</div>
								<div class="col-md-9 testimonials-grid-2">
									<h4>Richard</h4>
									<h5>subtitles here</h5>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget tempus hendrerit sem ut.</p>
								</div>
							</div>
						</li>
						<li>
							<div class="w3l-info1">
								<div class="col-md-3 testimonials-grid-1">
									<img src="images/t2.jpg" alt=""  />
								</div>
								<div class="col-md-9 testimonials-grid-2">
									<h4>Carnivel</h4>
									<h5>subtitles here</h5>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget tempus hendrerit sem ut.</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</section>
		</div>
	</div>
</div>
<!-- //testimonials -->
<!-- contact form  -->
	<div id="mail" class="contact" >
		<div class="container">
			<h3 class="wthree_head_contact">contact us</h3>
			<div class="w3layouts_mail_grids">
				<div class="col-md-5 w3layouts_mail_grid_left">
					<div class="w3_agile_contact_left">
						<ul>
							<li><img src="images/c1.jpg" alt=" " class="img-responsive" /></li>
							<li><img src="images/c2.jpg" alt=" " class="img-responsive" /></li>
							<li><img src="images/c3.jpg" alt=" " class="img-responsive" /></li>
							<li><img src="images/c4.jpg" alt=" " class="img-responsive" /></li>
							<li><img src="images/c5.jpg" alt=" " class="img-responsive" /></li>
							<li><img src="images/c6.jpg" alt=" " class="img-responsive" /></li>
						</ul>
					</div>
				</div>
				<div class="col-md-7 w3layouts_mail_grid_right">
					<form action="#" method="post">
						<div class="col-md-6 wthree_contact_left_grid">
							<input type="text" name="Name" placeholder="Name" required="">
							<input type="email" name="Email" placeholder="Email" required="">
						</div>
						<div class="col-md-6 wthree_contact_left_grid">
							<input type="text" name="Telephone" placeholder="Telephone" required="">
							<input type="text" name="Subject" placeholder="Subject" required="">
						</div>
						<div class="clearfix"> </div>
						<textarea name="Message" placeholder="Message..." required=""></textarea>
						<input type="submit" value="Submit">
						<input type="reset" value="Clear">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //contact form -->

<!-- //contact -->	
<!-- map -->	
	 <div class="map wow fadeInUp animated animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">
		<iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d2482.432383990807!2d0.028213999961443994!3d51.52362882484525!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1423469959819" style="border:0"></iframe>
		<div class=" footer-grids">
			<h3>Get In Touch</h3>
			<form action="#" method="post">
				<input type="email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
				<input type="submit" value="Subscribe">
			</form>
		</div>
		<div class=" footer-grids1  f2">
			<h3>Address</h3>
			<p>8901 Marmora Road <br>
				Glasgow, DO4 89GR.<br>
				Freephone: +1 234 456 7890<br>
				Telephone: +1 234 456 7890<br>
				FAX: +1 989 889 9898</p>
			<p>E-mail : <a href="mailto:info@example.com">example@mail.com</a></p>
		</div>	
	 </div>
<!-- //map -->	
<!-- //main -->

<!-- footer -->

<div class="footer-bot wow fadeInRight animated" data-wow-delay=".5s">
	<div class="container">
			<div class="logo2">
				<h3><a href="index.html">Wear</a></h3>
			</div>
			<div class="ftr-menu">
				 <ul>
					<li><a class="scroll" href="#home">Home </a></li>
					<li><a class="scroll" href="#about">About</a></li>
					<li><a class="scroll" href="#services">Services</a></li>
					<li><a class="scroll" href="#models">models</a></li>
					<li><a class="scroll" href="#testimonials">Testimonials</a></li>
					<li><a class="scroll" href="#contact">Contact</a></li>
				 </ul>
			</div>
			<div class="clearfix"></div>
	</div>
</div>
<div class="copy-right wow fadeInLeft animated" data-wow-delay=".5s">
	<div class="container">
			<p> &copy; 2017 Wear . All Rights Reserved | Design by  <a href="http://w3layouts.com/"> W3layouts</a></p>
	</div>
</div>
<!-- //footer -->

	<script src="js/responsiveslides.min.js"></script>
	<script>
										// You can also use "$(window).load(function() {"
										$(function () {
										  // Slideshow 4
										  $("#slider4").responsiveSlides({
											auto: true,
											pager:true,
											nav:false,
											speed: 400,
											namespace: "callbacks",
											before: function () {
											  $('.events').append("<li>before event fired.</li>");
											},
											after: function () {
											  $('.events').append("<li>after event fired.</li>");
											}
										  });
									
										});
									 </script>
	<!-- gallery-pop-up-script -->
<script src="js/jquery.chocolat.js"></script>
<script type="text/javascript">
$(function() {
	$('.view-seventh a').Chocolat();
});
</script>
<!-- //gallery-pop-up-script -->

	
<script defer src="js/jquery.flexslider.js"></script>
<!--Start-slider-script-->
		<script type="text/javascript">
		
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	  </script>

	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
</body>	
</html>