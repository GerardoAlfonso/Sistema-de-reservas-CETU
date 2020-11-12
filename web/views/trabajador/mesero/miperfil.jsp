<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Tomato Responsive Restaurant HTML5 Template</title>
        <meta name="author" content="Surjith S M">

        <!-- SEO -->
        <meta name="description" content="Tomato is a Responsive HTML5 Template for Restaurants and food related services.">
        <meta name="keywords" content="tomato, responsive, html5, restaurant, template, food, reservation">

        <!-- Favicons -->
        <link rel="shortcut icon" href="img/favicon.ico">
        <script src="https://kit.fontawesome.com/b4b5e95396.js" crossorigin="anonymous"></script>
        <!-- Responsive Tag -->
        <meta name="viewport" content="width=device-width">





        <!-- CSS Files -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="css/plugin.css">
        <link rel="stylesheet" href="css/main.css">

        <!--[if lt IE 9]>
                <script src="js/vendor/html5-3.6-respond-1.4.2.min.js"></script>
            <![endif]-->
    </head>

    <body>
        <!--[if lt IE 8]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

        <!-- Preloder-->
        <div class="preloder animated">
            <div class="scoket">
                <img src="img/preloader.svg" alt="" />
            </div>
        </div>

        <div class="body">
            <div class="main-wrapper">
                <jsp:include page="menu.jsp"></jsp:include>

                    <!-- Page Header -->
                    <section class="page_header">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 text-center">
                                    <h2 class="text-uppercase">Mi Perfil</h2>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </section>

                    <!-- Reservations page - OPENTABLE -->
                    <section class="reservation">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="page-header wow fadeInDown">
                                        <h1>Configuracion<small>Mi Pefil</small></h1>
                                    </div>
                                </div>
                            </div>


                            <!--FORM-->
                            <form>
                                <fieldset disabled>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputEmail4">Nombre</label>
                                            <input type="email" class="form-control" id="inputEmail4">
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for="inputPassword4">Apellido</label>
                                            <input type="password" class="form-control" id="inputPassword4">
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputEmail4">Correo</label>
                                            <input type="email" class="form-control" id="inputEmail4">
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for="inputPassword4">Tel</label>
                                            <input type="password" class="form-control" id="inputPassword4">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputAddress">Tipo</label>
                                        <input type="text" class="form-control" id="inputAddress" placeholder="">
                                    </div>
                                    <br>
                                </fieldset>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <center><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter" >Modificar Contraseña</button>
                                        </center>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <center><button type="submit" class="btn btn-primary">Modificar</button></center>
                                    </div>
                                </div>
                                <br>

                            </form>


                        </div>
                </div>


                <!-- // end .text-center -->
                <div class="OT_hidden">
                    <input type="hidden" class="OT_hidden" name="RestaurantID" value="">
                    <input type="hidden" class="OT_hidden" name="GeoID" value="7">
                    <input type="hidden" class="OT_hidden" name="txtHidServerTime" value="6/26/2014 8:50 PM">
                    <input type="hidden" class="OT_hidden" name="txtDateFormat" value="MM/dd/yyyy">
                </div>
            </form>
            <noscript>&amp;lt;a href="http://www.omniture.com" title="Web Analytics"&amp;gt;&amp;lt;img
            src="http://o.opentable.com/b/ss/otrestref/1/H.22.1--NS/0" height="1" width="1" border="0" alt=""
            /&amp;gt;&amp;lt;/a&amp;gt;</noscript>
            <!--/DO NOT REMOVE/-->
        </div>
    </div>
</div>
<div class="reservation-footer">
    <p>Puedes llamar a : <strong>+1 224 6787 004</strong> para hacer una reservación.</p>

    <span></span>
</div> 
<jsp:include page="footer.jsp"></jsp:include>

<!-- Javascript -->
<script src="js/vendor/jquery-1.11.2.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/vendor/jquery.flexslider-min.js"></script>
<script src="js/vendor/spectragram.js"></script>
<script src="js/vendor/owl.carousel.min.js"></script>
<script src="js/vendor/velocity.min.js"></script>
<script src="js/vendor/velocity.ui.min.js"></script>
<script src="js/vendor/bootstrap-datepicker.min.js"></script>
<script src="js/vendor/bootstrap-clockpicker.min.js"></script>
<script src="js/vendor/jquery.magnific-popup.min.js"></script>
<script src="js/vendor/isotope.pkgd.min.js"></script>
<script src="js/vendor/slick.min.js"></script>
<script src="js/vendor/wow.min.js"></script>
<script src="js/animation.js"></script>
<script src="js/vendor/vegas/vegas.min.js"></script>
<script src="js/vendor/jquery.mb.YTPlayer.js"></script>
<script src="js/vendor/jquery.stellar.js"></script>

<script src="js/vendor/mc/jquery.ketchup.all.min.js"></script>
<script src="js/vendor/mc/main.js"></script>
<script src="js/vendor/validate.js"></script>

<!-- Main JS -->
<script src="js/main.js"></script>






<!-- INICIO MODA -->
<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <br><br>
    <br><br>

    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">Cambiar Contraseña</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Contraseña Actual</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <small id="emailHelp" class="form-text text-muted">Escribe tu contraseña actual para verificar que eres tu</small>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Nueva Contraseña</label>
                        <input type="password" class="form-control" id="exampleInputPassword1">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Confirmar Contraseña</label>
                        <input type="password" class="form-control" id="exampleInputPassword1">
                    </div>
                    <button type="submit" class="btn btn-primary">Modificar</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>


<script>
    $('#myModal').on('shown.bs.modal', function () {
        $('#myInput').trigger('focus')
    })
</script>


<!-- FIN MODAL -->

</body>
</html>



