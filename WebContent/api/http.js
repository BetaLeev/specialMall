function ajax(url, fnCb) {
  var xmlhttp;
  var result = {};
  if (window.XMLHttpRequest) {
    //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    xmlhttp = new XMLHttpRequest();
  } else {
    // IE6, IE5 浏览器执行代码
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange = function () {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
      result = xmlhttp.responseText;
      fnCb(result);
    } else {
      fnCb();
    }
  };

  xmlhttp.open("GET", url, true);
  xmlhttp.send();
}
