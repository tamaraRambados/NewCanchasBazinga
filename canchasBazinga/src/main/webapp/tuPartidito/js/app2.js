angular
	.module('myapp2',[])
	.controller('controladorEstablecimiento',['$http','$scope',function($http,$scope){
		misestablecimiento = this;
		$scope.establecimientos = {};
		misestablecimiento.establecimiento = {};
		
		//funcion q me devuelve todos los establecimientos
		misestablecimiento.establecimientoListar = function(){
			$http.get('/canchaBazinga/api/establecimientos/lista').success(function(data){
			$scope.establecimientos = data.establecimiento;
	});
	};
		misestablecimiento.establecimientoListar();
		misestablecimiento.addEstablecimiento = function(){
			var data = {establecimientos:misestablecimiento.establecimiento};
			$http.post('/canchasBazinga/api/establecimientos/registrar',data).success(function(data){
			miscestablecimiento.establecimientoListar();
			misestablecimiento.establecimiento = {};
	});
};

}]);