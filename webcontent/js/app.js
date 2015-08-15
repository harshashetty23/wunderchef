'use strict';

/**
 * @ngdoc overview
 * @name decordecibelApp
 * @description
 * # decordecibelApp
 *
 * Main module of the application.
 */
var app = angular
    .module('wunderChefApp', ["ngRoute","ngTouch", "angucomplete"])

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