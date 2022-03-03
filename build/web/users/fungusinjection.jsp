
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
    function search(injectionName){
        if(injectionName.length==0){
            return;
        }
        else{
            var request=new XMLHttpRequest();
            var url="<%=path%>/users/searchfungusinj?txt="+injectionName;
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
                        tr += "<td>"+ob.type+"</td>";
                        tr += "<td>"+ob.injectionName+"</td>";
                        tr += "<td>"+ob.price+"</td>";
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
    
    <h1 style="background-color: pink;padding:15px;text-align: center;"> Fungus Injection [ADD/SEARCH] </h1>
    <hr>
    <form action="<%=path%>/users/addfungusinj" method="post">
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
                <label for="type"><b>Type</b></label><div></div>
                <select id="type" name="type" style="width:100%;padding: 6px;" required>
                    <option value="">Choose Type</option>
                    <option value="Black F">Black Fungus</option>
                    <option value="White F">White Fungus</option>
                    <option value="Yellow F">Yellow Fungus</option>
                </select>
            </div>
            
        </div>
        <div class="row form-group">
             <div class="col-lg-6">
                <label for="fungusinj"><b>Injection Name</b></label>
                <input type="text" name="injectionName" id="fungusinj" class="form-control" placeholder="Fungus Injection Name" required>
            </div>
            <div class="col-lg-6">
                <label for="price"><b>Price</b></label>
                <input type="text" name="price" id="price" class="form-control" placeholder="Price" required>
            </div>
        </div>
        <div class="row form-group">
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
                <input style="width: 80%;margin: 30px; height: 50px;" type="text" onkeyup="search(this.value)" placeholder="Search Injection Name">
            </div>
            <table id="tablecolor" class="table table-hover" style="border: 2px solid black;overflow-x: auto;">
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Contact</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>Type</th>
                    <th>Injection Name</th>
                    <th>Price</th>
                    <th>Description</th>
                </tr>
                <tbody id="tb">
                    
                </tbody>
            </table>
    
</div>
    

<%@include file="../blocks/footer.jsp" %>