/*(function(){
	
	var app= angular.module('myapp',['myapp-paginas']);
	
	app.controller('MiappControl',function($scope){
		cancha=this;
		$scope.mansaje="holaaaaaaaa!!!!";
		cancha.verPaginas=function(){
			myapp-paginas;
		};
		
	});
})();
*/

angular.module('myapp',['ngRoute'])
	   .config(function($routeProvider){
		   $routeProvider
		   
		   .when('/home',{
			   templateUrl:'/canchasBazinga/initializr/index.html'
		   })
		   
		   .when('/canchas-registrar',{
			   templateUrl:'/canchasBazinga/initializr/canchas-registrar.html'
		   })

		   .when('/establecimiento',{
			   templateUrl:'/canchasBazinga/initializr/establecimiento.html'
		   });

	   })
	   
	   .directive('canchasRegistrar',function(){
			return{			
				restrict:'E',
				templateUrl:'canchas-registrar.html'
			};
	   });

	   
	   
	   
	   
	   
	   
	   