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
<form action="list" method="post">
     品牌:<input type="text" name="name">
     <input type="submit" value="查询">
</form>
     <table>
         <tr>
            <td>请选择</td>
            <td>编号</td>
            <td>品牌</td>
            <td>价格</td>
            <td>分类</td>
            <td>发布时间</td>
            <td>操作</td>
         </tr>
         <c:forEach items="${page.list}" var="g">
          <tr>
            <td>
              <input type="checkbox" name="arr" value="${g.id}">
            </td>
            <td>${g.id}</td>
            <td>${g.name}</td>
            <td>${g.price}</td>
            <td>${g.pname}</td>
            <td><fmt:formatDate value="${g.datea}" pattern="yyyy-MM-dd hh:MM"/></td>
            <td>
              <a href="show.jsp?id=${g.id}"><input type="button" value="详情"></a>
              <a href="upd.jsp?id=${g.id}"><input type="button" value="编辑"></a>
            </td>
         </tr>
         </c:forEach>
         <tr>
           <td colspan="10">
             <a href="?pageNum=1"><input type="button" value="首页"></a>
             <a href="?pageNum=${page.pageNum-1 <1 ?page.pageNum : page.pageNum-1}"><input type="button" value="上一页"></a>
                             当前${page.pageNum}页/总共${page.pages}页
             <a href="?pageNum=${page.pageNum+1 >page.pages ? page.pageNum :page.pageNum +1}"><input type="button" value="下一页"></a>
             <a href="?pageNum=${page.pages}"><input type="button" value="尾页"></a>
           </td>
         </tr>
     </table>
     <a href="add.jsp"><input type="button" value="添加"></a>
     <a><input type="button" id="dels" value="批量删除"></a>
</body>
<script type="text/javascript">
    $("#dels").click(function(){
    	var ids = $("[name=arr]:checked").map(function(){
    		return $(this).val();
    	}).get().join(",");
    	var shan = confirm("确定删除id为"+ids+"的商品吗?");
    	if(shan){
    		$.post("del",{ids:ids},function(res){
    			if(res=true){
    				alert("删除成功");
    				location="list";
    			}else{
    				alert("删除失败");
    			}
    		})
    	}
    })
</script>
</html>