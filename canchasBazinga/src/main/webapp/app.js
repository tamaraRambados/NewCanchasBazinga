angular
	.module('myapp',[])
	.controller('controladorCanchas', function($scope,$http){
	
		

		micanchas=this;
		$scope.cancha={};
		
		micanchas.cancha={};
		micanchas.canchaListar=function(){
			$http.get('/canchasBazinga/api/canchas/lista').success(function(data){
																$scope.canchas=data.canchas;
			});
		};
		micanchas.canchasListar();
		micanchas.addCanchas=fuction(){
			var data={canchas:micanchas.cancha};
			$http.post('/canchasBazinga/api/canchas/registrar',data).success(function(data){
				micanchas.canchasListar();
				micanchas.cancha={};
			});
		};

		});