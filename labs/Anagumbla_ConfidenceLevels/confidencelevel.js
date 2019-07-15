
"usse strict";
function confidencelevel() {
    var size = Number(document.getElementById('size').value);
    var mean = Number(document.getElementById('mean').value);
    var variance = Number(document.getElementById('variance').value);
    document.getElementById('result').innerHTML = (mean + 1.96 * (variance / Math.sqrt(size))).toFixed(2);
    return false;
}
document.getElementById('go').addEventListener('click', confidencelevel);