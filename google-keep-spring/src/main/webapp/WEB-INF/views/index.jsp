<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

 <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="resources\style\style.css"/>
    <!-- 구글 무료 아이콘: https://fonts.google.com/icons -->
    <link
      href="https://fonts.googleapis.com/icon?family=Material+Icons|Material+Icons+Outlined"
      rel="stylesheet"
    />
    <title>My Notes</title>
  </head>
 <body>
  
    <main>
      <img id="mainBanner" src="resources/img/main_banner.png" />
      <!-- 새로운 노트 생성 컴포넌트 -->
      <div id="newNoteBar">
        <input type="text" placeholder="노트 작성..." />
      </div>

	<c:if test="${list == null}">
      <div id="emptyNotes">
        <img src="resources/img/empty_icon.png" />
        <div>추가한 메모가 여기에 표시됩니다.</div>
      </div>
	</c:if>
	
      <!-- 핀 노트 -->
      <section id="pinnedNoteList" class="notes-section">
        <div class="section-header">핀 노트</div>
        <div class="note-container">
        
        	<c:forEach var="dto" items="${list }" >
        	<c:if test="${dto.pinned == true }">
        		<div class="note"> 
        			${dto.id}
        			<div class="note-title">
        				${dto.title}
        			</div>
        			<div class="note-body">
        				${dto.body}
        			</div>
        	        
        		
        			<div class="note-footer flex-start">
        				<button class="pin">
        					<span class="material-icons md-18 gray">push_pin</span>
        				</button>
        				<div class="color-select">
        					<input class="color-picker" type="color">
        					<span class="material-icons-outlined md-18 gray">palette</span>        				
        				</div>
        				<button class="delete">
        					<span class="material-icons-outlined md-18 gray">delete</span>
        				</button>
        				
        				<form action="correction" method="GET">
        					<input type="hidden" class=id name="id" value="${dto.id}">        			
        					<input type="hidden" class= deleted name="deleted" value="0">
        					<input type="hidden" name="color" value="${dto.backgroundColor }">
        					<input type="hidden" class="pinned" value="${dto.pinned }">
        				</form>
        			</div>
        
        			
        		</div>
			</c:if>	
        	</c:forEach>
        
        </div>
      </section>

      <!-- 노트들 -->
      <section id="noteList" class="notes-section">
        <div class="section-header">노트</div>
        <div class="note-container">
        
        <c:forEach var="dto" items="${list }" >
        	<c:if test="${dto.pinned == false }">
        		<div class="note" style="background-color:${dto.backgroundColor}"> 
        			${dto.id}
        			<div class="note-title">
        				${dto.title}
        			</div>
        			<div class="note-body">
        				${dto.body}
        			</div>
        			

        				<div class="note-footer flex-start">
        					<button class="pin">
        						<span class="material-icons-outlined md-18 gray">push_pin</span>
        					</button>
        					<div class="color-select">
        						<input class="color-picker" type="color">
        						<span class="material-icons-outlined md-18 gray">palette</span>        				
        					</div>
        					<button class="delete">
        						<span class="material-icons-outlined md-18 gray">delete</span>
        					</button>
        					
        					<form action="correction" method="GET">
        						<input type="hidden" class=id name="id" value="${dto.id}">        			
        						<input type="hidden" class= deleted name="deleted" value="0">
        						<input type="hidden" name="color" value="${dto.backgroundColor }">
        						<input type="hidden" class="pinned" value="${dto.pinned }">
        					</form>
        					
        				</div>
        			
        					
        		</div>
			</c:if>	
        </c:forEach>
        	
        </div>
      </section>
    </main>

    <footer>Crafted by gyeongseok</footer>

<form action="create" method="get" >
  <div id="modalLayout" class="hide"></div>
    <div id="modalWrapper" class="hide">
      <div class="modal-container">
        <div class="note-content">      
          <input name="title" class="note-title-input" type="text" placeholder="제목" />
          <textarea name="body" class="note-body-input"></textarea>
        </div>
        
        <div class="note-footer">
          <div>
          	
            <button name="pin" type="button" class="pin">
              <span class="material-icons-outlined md-18 gray">push_pin</span>
            </button>
            
            <div class="color-select">
              <input name=color class="color-picker" type="color" value="#FFFFFF" />
              <span class="material-icons-outlined md-18 gray">palette</span>
            </div>
            
            <button type="button" class="delete">
              <span class="material-icons-outlined md-18 gray">delete</span>
            </button>
            
          </div>
          <button class="close">저장</button>   
        </div>
      </div>
    </div>
</form>
 
     <script type="text/javascript" src="resources/js/modal.js?test"></script>
     <script type="text/javascript" src="resources/js/notebar.js?test"></script>
  </body>
</html>
