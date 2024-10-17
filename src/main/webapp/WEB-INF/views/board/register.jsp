<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../includes/header.jsp"%>
<div class="row-content">
    <div class="card">
        <div class="card-header">
            Featured
        </div>
        <div class="card-body">
            <h5 class="card-title">게시글 등록</h5>
            <form method="post" action="/board/register">
                <div class="mb-3">
                    <label class="form-label">Title</label>
                    <input type="text" class="form-control" name="title" placeholder="Title">
                </div>
                <div class="mb-3">
                    <label class="form-label">Example textarea</label>
                    <textarea class="form-control" name="content" rows="3"></textarea>
                </div>
                <div class="mb-3">
                    <label class="form-label">Writer</label>
                    <input type="text" class="form-control" name="writer" placeholder="Writer">
                </div>
                <div class="mb-3">
                    <button type="submit" class="btn btn-primary">Register</button>
                    <button type="button" class="btn btn-secondary">Board List</button>
                </div>
            </form>
            <script>
                document.querySelector(".btn-secondary").addEventListener("click", function (e){
                    self.location="/board/list"
                })
            </script>
        </div>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>