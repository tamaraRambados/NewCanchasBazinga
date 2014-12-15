angular
	.module('myapp',[])
	.controller('controladorCancha',['$http','$scope',function($http,$scope){
		miscancha = this;
		$scope.canchas = {};
		miscancha.cancha = {};
		miscancha.canchaListar = function(){
		$http.get('/canchaBazinga/api/canchas/lista').success(function(data){
		$scope.canchas = data.cancha;
	});
	};
		miscancha.canchaListar();
		miscancha.addCanchas = function(){
		var data = {canchas:miscancha.cancha};
		$http.post('/canchasBazinga/api/canchas/registrar',data).success(function(data){
		miscancha.canchaListar();
		miscancha.canchas = {};
	});
};
miscancha.remover = function(cancha){
};
}]);