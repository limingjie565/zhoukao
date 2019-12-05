<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index3.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="upd" method="post">
     <input type="hidden" name="id">
       品牌：<input type="text" name="name"><br><br>
       分类：<select id="pid" name="pid">
         <option value="0">请选择分类</option>
       </select><br><br>
       价格：<input type="text" name="price"><br><br>
       <input type="submit" value="提交">
    </form>
</body>
<script type="text/javascript">
    $(function(){
    	$.getJSON("type",function(opt){
    		$.each(opt,function(index,item){
    			$("#pid").append("<option value='"+item.pid+"'>"+item.pname+"</option>")
    		})
    	})
    })
    $(function(){
    	var id = ${param.id};
    	$("[name=id]").val(id);
    	$.getJSON("show",{"id":id},function(res){
    		$("[name=name]").val(res.name);
    		$("[name=price]").val(res.price);
    		$("#pid").val(res.pid);
    	})
    })
</script>
</html>