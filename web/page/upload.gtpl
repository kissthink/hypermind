<html>
<head>
    <title>Upload file</title>
</head>
<body>
<form enctype="multipart/form-data" action="http://hypermind.com.cn:9090/upload" method="post"> 
  <input type="file" name="file" /> 
  <input type="hidden" name="token" value="{{.}}">
  <input type="submit" value="upload" /> 
</form>
</body>
</html>
