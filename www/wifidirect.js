/*global cordova, module*/
var exec = require('cordova/exec');

function WifiDirect() {}

WifiDirect.prototype.getStatus = function() {
    exec(function(msg) { alert(msg); },
                 function(msg) { alert("Error: " + msg); },
                 "WifiDirect",
                 "getStatus",
                 []);
}

var wifidirect = new WifiDirect();
module.exports = wifidirect;
