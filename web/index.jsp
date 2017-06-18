<%@include file="header.jsp" %>
<div> 
<h1 style="color: #761c19; text-align: center">Welcome to Student Management System</h1>

<div class="container">
 
  <p>The .thumbnail class can be used to display an image gallery.</p>
  <p>The .caption class adds proper padding and a dark grey color to text inside thumbnails.</p>
  <p>Click on the images to enlarge them.</p>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
          <a href="img/student-research-image.jpg" target="_blank">
              <img src="img/student-research-image.jpg" alt="Biology" style="width:100%">
          <div class="caption">
            <p>Conducting a research on hybrids</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
          <a href="img/comp.jpg" target="_blank">
              <img src="img/comp.jpg" alt="Java Research" style="width:100%">
          <div class="caption">
            <p>Students Researching About Java</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
          <a href="img/mic.jpg" target="_blank">
              <img src="img/mic.jpg" alt="Microscope" style="width:100%">
          <div class="caption">
            <p>Researching on Bacteria</p>
          </div>
        </a>
      </div>
    </div>
  </div>
</div>

    <%@include file="footer.jsp" %>
    