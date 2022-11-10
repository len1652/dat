<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>Dat Mobile</h4>
      
      <form action="cuahangController" method="post">
      	<div class="input-group">
	        <input type="text" class="form-control"  name="txttk"  placeholder="Nhap thong tin tim kiem ...">
	        
	        <input class="btn-primary"  name="butt" type="submit" value="Search">
	        	
	          
	        
	      </div>
      </form>
      <div>
      	<h4>
      		Số mẫu tìm được: <c:out value="${didong.size() }"></c:out>
      	</h4>
      </div>
    </div>

    <div class="col-sm-9">
      <h3 style="Text-align:Center; color:red"> Điện thoại mới </h3>
      	<c:if test="${didong.size()!=0}">
			<div class="row">
                    	<c:forEach var ="s" items="${didong}">
                    		<div class="col-sm-4 col-lg-4 col-md-4">
                    			<div class="thumbnail">
                    				<img src="${s.getAnh() }"  style="width: 300px; height: 280px"> <br>
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						Mã hàng: ${ s.getMadidong()} <br>
                    					</h4>
                    				</div>
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						${ s.getTendidong()} <br>
                    					</h4>
                    				</div>
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						Nhà cung cấp: ${ s.getNhacungcap()} <br>
                    					</h4>
                    				</div>
                    				
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :5px ">
                    						Giá: ${ s.getGia()} VNĐ<br>
                    					</h4>
                    				</div>
                    				
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						Số lượng: ${ s.getSoluong()} <br>
                    					</h4>
                    				</div>
                    				
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						Thành tiền: ${ s.getSoluong()*s.getGia()} VNĐ<br>
                    					</h4>
                    				</div>
                    				
                    				<div style="height: 40px">
                    					<h4 style="text-align: left ; padding-left :10px ">
                    						Mức: <c:if test="${ s.getSoluong()*s.getGia() > 1000000}">
                    							Cao
                    						</c:if>
                    						<c:if test="${ s.getSoluong()*s.getGia() <= 1000000}">
                    							Trung Bình
                    						</c:if>
                    						
                    						
                    						
                    						
                    						<br>
                    					</h4>
                    				</div>
                    				
                    				
                    				
                    			</div>
                    		</div>
				      	</c:forEach>
                        
                     </div>
		</c:if>
		<c:if test="${didong.size()==0}">
			<h1>
				Không tìm thấy chiếc điện thoại nào
			</h1> 
		</c:if>
                    
                   
                    
    </div>
  </div>
</div>


</body>
</html>