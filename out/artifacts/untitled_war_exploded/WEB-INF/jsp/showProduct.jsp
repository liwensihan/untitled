<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript" >
    function del(id){
        var flag=confirm("是否删除?");
        if(flag){
            this.location.href="deletePRO?id="+id;
            alert("成功！");
        }
    }
</script>
<body>
<div>
    <div><h3>产品列表</h3></div>
    <form action="intoPRO" method="post">
        <table border="1px">
            <tr id="tr_1">
                <td>产品名称</td>
                <td>产品描述</td>
                <td>类别</td>
                <td>状态</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${list}" var="pg">
                <tr id="tr_2">
                    <td>${pg.productname}</td>
                    <td>${pg.descs}</td>
                    <td>${pg.cg.name}</td>
                    <td>${pg.cg.explain}</td>
                    <td><a href="javascript:del(${pg.id})">删除</a></td>
                </tr>
            </c:forEach>
        </table>
        共${page.totalCount }条记录${page.pageNo}/${page.pageCount}页
        <c:if test="${page.pageNo > 1}">
            <a href="intoPRO?pageNo=1">首页</a>
            <a href="intoPRO?pageNo=${page.pageNo-1}">上一页</a>
        </c:if>
        <c:if test="${page.pageNo < page.pageCount }">
            <a href="intoPRO?pageNo=${page.pageNo+1}">下一页</a>
            <a href="intoPRO?pageNo=${page.pageCount}">最后一页</a>
        </c:if>
    </form>
    <a href="insertPRO">新增产品</a>
</div>
</body>
</html>
