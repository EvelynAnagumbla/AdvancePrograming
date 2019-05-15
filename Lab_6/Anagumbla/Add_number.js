"use strict";
function add(){
    var x = Number(document.getElementById('x').Value);
    var y = Number(document.getElementById('y').Value);
    document.getElementById('result').innerHTML=x+y;
    return false;
}
document.getElementById('go').addEventListener('click',add);