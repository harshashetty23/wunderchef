'use strict';

/**
 * @ngdoc overview
 * @name wunderChefApp
 * @description
 * # wunderChefApp
 *
 * Main module of the application.
 */
var app = angular
    .module('wunderChefApp', ["ngRoute","ngTouch","ui.bootstrap", "ngAnimate", "angucomplete","angucompleteloc","duScroll"])
    .run(function($rootScope, $location, $routeParams) {
    $rootScope.$on('$routeChangeSuccess', function(event, current) {
      // Look at $location.path()
      // If it isn't what you want, toggle showSideBar...
	  $rootScope.showPageHeader = $location.path() !== '/';
    })
    })
	.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'landingpage.html',
        controller: 'ChefLandingDataController'
    }).
      when('/chefs', {
        templateUrl: 'chefs.html',
        controller: 'ChefMainDataController'
      }).
	   when('/menus', {
        templateUrl: 'food_order.html',
        controller: 'MenuDataController'
      }).
      otherwise({
        redirectTo: '/'
      });
}]);