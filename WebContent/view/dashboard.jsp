<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="controller.SistemaPaciente,
				model.Paciente,
				java.util.List" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Meta tags Obrigatórias -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
      crossorigin="anonymous"
    />
    <style>
      div {
        border: solid 1px blue;
      }
      .has-search .form-control {
        padding-left: 2.375rem;
      }

      .has-search .form-control-feedback {
        position: absolute;
        z-index: 2;
        display: block;
        width: 2.375rem;
        height: 2.375rem;
        line-height: 2.375rem;
        text-align: center;
        pointer-events: none;
        color: #aaa;
      }
      .addScroll {
        overflow-y: auto;
        height: 500px;
      }
    </style>

    <title>CMI</title>
  </head>
  <body>
    <div class="container p-5">
      <div class="row">
        <div class="col-md-4 col-lg-4">
          <div class="row">
            <div class="col-12">
              <div class="form-group has-search ">
                <span class="fa fa-search form-control-feedback"></span>
                <input type="text" class="form-control" placeholder="Search" />
              </div>
              <div class="addScroll">
                <div class="list-group" id="list-tab" role="tablist">
                  <form action = "mostraDados" method = "POST">
                  <%
				    SistemaPaciente sp = new SistemaPaciente();
				    List<Paciente> pacientes = sp.getAllPaciente();
				
				    for (Paciente paciente : pacientes ) {
				    	 %>
		                    <input type = "submit" class="list-group-item list-group-item-action active"
		                    id="list-home-list"
		                    data-toggle="list"
		                    role="tab"
		                    aria-controls="home"
		                    value = "<%= paciente.getNome() %>"/>
		                    
				         <li></li>

				     <%
				    }
				    
				    %>
                  </form>>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-8 col-lg-8">
          <div class="container row p-4">
            <div class="col-4">
              <div class="d-flex justify-content-center">
                <img
                  src="./assets/avatar.png"
                  style="max-width:200px; max-height:150px; border:0;"
                  alt="foto do paciente aqui"
                />
              </div>
              <div class="d-flex justify-content-center"">
                <img
                  src="./assets//avatarDePe.jpg"
                  style="max-width:300px; max-height:150px; border:0;"
                  alt=""
                />
              </div>
            </div>
            <div class="col-8 row">
              <div class="col-4"></div>
              <div class="col-8 p-2">
                <a type="button" class="btn-secondary btn-sm">
                  Editar
                </a>
                <a
                  type="button"
                  href="./confirmacao.html"
                  class="btn-primary btn-sm"
                >
                  Questionário
                </a>
              </div>
              <div class="addScroll">
                <p>
                  Lorem ipsum dolor sit amet consectetur, adipisicing elit.
                  Minima libero sed, sit cupiditate ea vitae inventore
                  voluptatibus quae nisi a et officia repellat sint, nihil nam,
                  explicabo maxime voluptatum aliquam.
                </p>
                <p>
                  Lorem ipsum dolor, sit amet consectetur adipisicing elit.
                  Repellat saepe deserunt sint in libero consectetur voluptate
                  culpa numquam ipsam accusamus esse, soluta molestias commodi.
                  Eveniet numquam labore rerum porro minima!
                </p>
                <div class="container">
                  <div class="p-5">chart1</div>
                  <div class="p-5">chart2</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- JavaScript (Opcional) -->
    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
    <script
      src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
      integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
      integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
