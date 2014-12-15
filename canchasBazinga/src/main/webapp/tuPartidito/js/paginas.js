(function(){
	var app= angular.module('myapp-paginas',[]);
	
	app.directive('canchaRegistar',function(){
		return{			
			restrict:'E',
			templeteUrl:'canchas-registar.html',
		};
	});
})();