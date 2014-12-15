angular
		.module('myapp', [])
		.controller(
				'controladorCancha',
				[
						'$http',
						'$scope',
						function($http, $scope) {
							miscancha = this;
							$scope.canchas = {};
							miscancha.cancha = {};

							miscancha.canchaListar = function() {

								$http.get('/canchaBazinga/api/canchas/lista')
										.success(function(data) {
											$scope.canchas = data.cancha;
										});
							};
							miscancha.canchaListar();
							miscancha.addCanchas = function() {
								var data = {
									canchas : miscancha.cancha
								};
								$http
										.post(
												'/canchasBazinga/api/canchas/registrar',
												data).success(function(data) {
											miscancha.canchaListar();
											miscancha.canchas = {};
										});
							};

						} ])
		.controller(
				'controladorEstablecimiento',
				[
						'$http',
						'$scope',
						function($http, $scope) {
							misestablecimiento = this;
							$scope.establecimientos = {};
							misestablecimiento.establecimiento = {};

							// funcion q me devuelve todos los establecimientos
							misestablecimiento.establecimientoListar = function() {
								$http
										.get(
												'/canchaBazinga/api/establecimientos/lista')
										.success(
												function(data) {
													$scope.establecimientos = data.establecimiento;
												});
							};
							misestablecimiento.establecimientoListar();
							misestablecimiento.addEstablecimiento = function() {
								var data = {
									establecimientos : misestablecimiento.establecimiento
								};
								$http
										.post(
												'/canchasBazinga/api/establecimientos/registrar',
												data)
										.success(
												function(data) {
													miscestablecimiento
															.establecimientoListar();
													misestablecimiento.establecimiento = {};
												});
							};

						} ]);
