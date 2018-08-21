# WebView
WebView Example

### 안드로이드 웹뷰 사용하기

````java
webView = findViewById(R.id.webView);
webView.setWebViewClient(new WebViewClient())
webView.setWebChromeClient(new WebChromeClient()); 

webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setSupportZoom(true);
webView.getSettings().setBuiltInZoomControls(true);

// url에 http:// 가 없는 경우 포함하여 사용
webView.loadUrl("http://m.naver.com");
````
