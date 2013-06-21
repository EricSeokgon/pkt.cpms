<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>




<!-- 아래 스타일은 전자정부 프레임워크의 샘플 CSS를 이용한다는 것입니다. -->

<link type="text/css" rel="stylesheet" href="/KnowledgeBank/css/egovframework/sample.css;jsessionid=5D98BFB8E6ECEB0969759AD8461FBD0C"/>




<script type="text/javascript">

<!--

	function registAccount() {

		var frm = document.forms.addAccountForm;

		

		frm.action = '<c:url value="/AdongcardInsert/AdongcardInsert.do" />';

		frm.submit();

	}

//-->

</script>




<form name='AdongcardInsertForm' method='post'>




<div id="content_pop">

	<!-- 타이틀 -->

	<div id="title">

		<ul>

			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>"> 계정 신청 화면 </li>

		</ul>

	</div>




	<div id="table" style='text-align:center;'>

		<br/>

		<table width="500px" border="1" cellpadding="0" cellspacing="0">

			<colgroup>

				<col width="150" />

				<col width="" />

			</colgroup>




			<tr>

				<th>계정</th>

				<td>

					<input type="text" name='account' />

				</td>

			</tr>

			<tr>

				<th>암호</th>

				<td>

					<input type="password" name='password' />

				</td>

			</tr>

			<tr>

				<th>암호확인</th>

				<td>

					<input type="password" name='repassword' />

				</td>

			</tr>

			<tr>

				<th>이름</th>

				<td>

					<input type="text" name='user_name' />

				</td>

			</tr>

			<tr>

				<th>전화번호(긴급연락처)</th>

				<td>

					<input type="text" name='user_telno1' />

				</td>

			</tr>

			<tr>

				<th>전화번호(일반연락처)</th>

				<td>

					<input type="text" name='user_telno2' />

				</td>

			</tr>

			<tr>

			<th>전자우편</th>

			<td>

				<input type="text" name='email_adres' />

			</td>

		</tr>

		</table>

		<br/>

	</div>

	<div style='text-align:center'>

		<input type="button" value='신청서 보내기' on_click='registAccount();'/>

	</div>

</div>

</form>
