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

/**
 * [通过参数名获取url中的参数值]
 * 示例URL:http://htmlJsTest/getrequest.html?uid=admin&rid=1&fid=2&name=小明
 * @param  {[string]} queryName [参数名]
 * @return {[string]}           [参数值]
 */
function GetQueryValue(queryName) {
  var reg = new RegExp("(^|&)" + queryName + "=([^&]*)(&|$)", "i");
  var r = window.location.search.substr(1).match(reg);
  if (r != null) {
    return decodeURI(r[2]);
  } else {
    return null;
  }
}
