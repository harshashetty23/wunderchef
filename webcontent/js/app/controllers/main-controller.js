app.controller('ChefDataController', ['$scope','$http',function($scope,$http){
    $scope.cheflist = [];
		$scope.chefFormData = [];
    $http.get('http://localhost:8080/ChefWeb/ChefInfoForm.chf').success(function(data){
      $scope.chefFormData = data;
    });
  }]);