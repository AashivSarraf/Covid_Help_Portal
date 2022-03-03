
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/menu.jsp" %>

<%
    String msg="" ;
    Object regData=request.getParameter("reg");
    if(regData!=null){
        if(regData.equals("true")){
            msg ="Data Saved Successfully" ;
        }else{
            msg = "Data Not Saved" ;
        }
    }
%>

<script>
    function search(city){
        if(city.length==0){
            return;
        }
        else{
            var request=new XMLHttpRequest();
            var url="<%=path%>/users/searchtiffin?txt="+city;
            request.open("GET",url);
            request.onreadystatechange=function(){
                if(request.readyState==4 && request.status==200){
                    var data=request.responseText;
                    var obj=JSON.parse(data);
                    var finalData="" ;
                    for(var x=0;x<obj.length;x++){  
                        var ob=obj[x];
                        
                        var tr="<tr>";
                        tr += "<td>"+ob.userName+"</td>";
                        tr += "<td>"+ob.email+"</td>";
                        tr += "<td>"+ob.phone+"</td>";
                        tr += "<td>"+ob.address+"</td>";
                        tr += "<td>"+ob.city+"</td>";
                        tr += "<td>"+ob.price+"</td>";
                        tr += "<td>"+ob.delivery+"</td>";
                        tr += "<td>"+ob.description+"</td>";
                        tr += "</tr>"
                        
                        finalData += tr;
                    }
                    document.getElementById("tb").innerHTML=finalData;
                }
                
            }
        }
        request.send();
    }
</script>

<div id="home" class="intro route bg-image" style="background-image: url(../assets/img/black-bg.jpg);width:100%;height: 200px">
       <div class="overlay-itro"></div>
       <div class="intro-content display-table">
        <div class="table-cell">
           <div class="container">

           </div>
        </div>
       </div>
    </div>
<div style="padding: 10px">
    
    <h1 style="background-color: pink;padding:15px;text-align: center;"> Tiffin Service [ADD/SEARCH] </h1>
    <hr>
    <form action="<%=path%>/users/addtiffin" method="post">
        <div class="row form-group">
            <div class="col-lg-6">
                <label for="name"><b>Name</b></label>
                <input type="text" name="userName" id="name" class="form-control" placeholder="Your Name" required>
            </div>
            <div class="col-lg-6">
                <label for="email"><b>Email</b></label>
                <input type="email" name="email" id="email" class="form-control" placeholder="Your Email" required>
            </div>
        </div>
        <div class="row form-group">
            <div class="col-lg-6">
                <label for="phone"><b>Contact</b></label>
                <input type="text" name="phone" id="phone" class="form-control" placeholder="Your Contact No." required>
            </div>
            <div class="col-lg-6">
                <label for="address"><b>Address</b></label>
                <input type="text" name="address" id="address" class="form-control" placeholder="Your Address" required>
            </div>
        </div>
        <div class="row form-group">
            <div class="col-lg-6">
                <label for="city"><b>City</b></label><div></div>
                <select id="city" name="city" style="width:100%;padding: 6px;" required>
                    <option value="">Choose City</option>
                    <option value="Indore">Indore</option>
                </select>
            </div>
            <div class="col-lg-6">
                <label for="price"><b>Price(Enter 0 for Free)</b></label>
                <input type="text" name="price" id="price" class="form-control" placeholder="Price" required>
            </div>
            
        </div>
        <div class="row form-group">
            <div class="col-lg-6">
                <label for="delivery"><b>Delivery</b></label><div></div>
                <select id="city" name="delivery" style="width:100%;padding: 6px;" required>
                    <option value="">Choose Type</option>
                    <option value="self (Pick Up)">Self(Pick Up)</option>
                    <option value="Home Delivery">Home Delivery</option>
                </select>
            </div>
            <div class="col-lg-6">
                <label for="desc"><b>Brief Description</b></label><div></div>
                <textarea name="desc" id="desc" cols=100% rows="6" placeholder="Description" style="resize: none;" required></textarea>
            </div>
        </div>
       
        <div class="row form-group">
             <div class="col-lg-6">
                 <button type="submit" class="btn btn-success">Save Data</button>
            </div>
            <div class="col-lg-6">
                <b class="text-danger"><%=msg%></b>
            </div>
        </div>
    </form>
            
            <h1 style="background-color: pink;padding:15px;text-align: center;">SEARCH</h1>
            <hr>
            <div align:center>
                <input style="width: 80%;margin: 30px; height: 50px;" type="text" onkeyup="search(this.value)" placeholder="Search City">
            </div>
            <table id="tablecolor" class="table table-hover" style="border: 2px solid black;overflow-x: auto;">
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Contact</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>Price</th>
                    <th>Delivery</th>
                    <th>Description</th>
                </tr>
                <tbody id="tb">
                    
                </tbody>
            </table>
    
</div>
    

<%@include file="../blocks/footer.jsp" %>