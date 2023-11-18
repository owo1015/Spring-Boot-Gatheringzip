<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/loginProc" method="post">
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">이메일</label>
			<input type="email" class="form-control" id="email" name="email">
		</div>
		<div class="mb-5">
			<label for="password" class="form-label">비밀번호</label>
			<input type="password" class="form-control" id="password" name="password">
		</div>
		<div class="mb-5">
			<button type="submit" class="btn btn-primary">로그인</button>
			<button type="button" class="btn btn-primary">회원가입</button>
		</div>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>