<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>特色彝族商城</title>

    <style>
      li {
        list-style-type: none;
      }

      header {
        width: 100%;
        display: flex;
        height: 166px;
        justify-content: space-around;
      }
      .logo {
        width: 220px;
      }

      .header-left {
        flex: 1;
        display: flex;
      }
      li {
        display: inline-block;
        margin-right: 12px;
      }

      .header-right {
        width: 180px;
      }
    </style>

    <style>
      .banner {
        height: 466px;
        width: 100%;
        background: pink;
      }
    </style>

    <style>
      .cate {
        padding: 30px;
      }

      .cate-title {
        padding: 6px;
        border-left: 10px solid #f6f6f6;
      }

      .cate-container {
        display: flex;
        justify-content: space-between;
      }
      .cate-item {
        height: 210px;
        width: 120px;
        background: #eaeaea;
      }
    </style>
  </head>
  <body>
    <header>
      <div class="logo">logo</div>
      <div class="header-left">
        <ul>
          <li>
            <a>热门商铺</a>
          </li>

          <li>
            <a>商品中心</a>
          </li>

          <li>
            <a>特色商品</a>
          </li>

          <li>
            <a>网站介绍</a>
          </li>
        </ul>
      </div>
      <div class="header-right">
        <ul>
          <li>
            <a>注册</a>
          </li>
          <li>
            <a>登录</a>
          </li>
        </ul>
      </div>
    </header>

    <div class="banner"></div>

    <main>
      <div class="cate">
        <h2 class="cate-title">热门店铺</h2>
        <div class="cate-container">
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
        </div>
      </div>

      <div class="cate">
        <h2 class="cate-title">商品推荐</h2>
        <div class="cate-container">
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
          <div class="cate-item"></div>
        </div>
      </div>
    </main>

    <footer>版权所有@翻版必究</footer>
  </body>
</html>
