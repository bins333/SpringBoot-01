## SPRING BOOT API

This is a sample App which demonstrate basic REST services.
<h5>
Prerequisites : Java 8 </br> 
IDE: Spring STS </br> 
Build tool: Maven </br>
</h5>


#GET: 
http://localhost:8080/topics </br>
http://localhost:8080/topics/spring </br>

#POST:
http://localhost:8080/topics </br>
<code>
{    
    "id": "j2ee",
    "name": "Java EE",
    "description": "J2EE topics"
}
</code>

#PUT: 
http://localhost:8080/topics/spring </br>

<code>
{
    "id": "spring",
    "name": "Spring MVC",
    "description": "spring topics"
}
</code>

#DELETE: 
http://localhost:8080/topics/spring <br>

 