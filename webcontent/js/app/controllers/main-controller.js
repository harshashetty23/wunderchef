app.controller('MainController', ['$scope','$http','$location',function($scope,$http,$location){
   $scope.goNext = function (hash) { 
   $location.path(hash);
 }
  }]);
app.controller('ChefLandingDataController', ['$scope','$http',function($scope,$http){
    $scope.cheflist = [];
		$scope.chefFormData = [];
    $http.get('http://localhost:8080/ChefWeb/ChefInfoForm.chf').success(function(data){
      $scope.chefFormData = data;
    });
  }]);
app.controller('ChefMainDataController', ['$scope','$http',function($scope,$http){
   $scope.chefMainFormData = []; 
   $http.get('http://localhost:8080/ChefWeb/ChefSearchList.chf?searchParam=ch').success(function(data){
      $scope.chefMainFormData = data;
    });
  }]);
app.controller('MenuDataController', ['$scope','$http','$location',function($scope,$http,$locationd){
   $http.get('http://localhost:8080/ChefWeb/MenuSearchList.chf?searchParam=ch').success(function(data){
      $scope.menuMainFormData = data;
	  $scope.categoryList = $scope.menuCategory(data);
    });
	$scope.isCollapsed = true;
	var indexedMenus = [];
    var indexedcategory = [];
    // this will reset the list of indexed teams each time the list is rendered again
    $scope.menuToFilter = function() {
        indexedMenus = [];
        return $scope.menuMainFormData;
    }

    $scope.menuItems = function(menuVal) {
        var menuIsNew = indexedMenus.indexOf(menuVal.category) == -1;
        if (menuIsNew) {
            indexedMenus.push(menuVal.category);
        }
        return menuIsNew;
    }
	$scope.menuCategory = function(menuData) {
		for(var i=0;i<menuData.length;i++)
		{
        var categoryIsNew = indexedcategory.indexOf(menuData[i].category) == -1;
        if (categoryIsNew) {
            indexedcategory.push(menuData[i].category);
        }
		}
		return indexedcategory;
    }
  }]);