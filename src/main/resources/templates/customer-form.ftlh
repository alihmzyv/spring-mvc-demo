<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>
<body>
<#--
https://docs.spring.io/spring-framework/docs/3.0.0.M4/reference/html/ch16s04.html
-->
<#--
https://hellokoding.com/form-data-binding-and-validation-example-with-java-spring-boot-and-freemarker/
-->
<form action="/customer/processForm" method="post">
    First Name: <@spring.formInput path="customer.name"/>
    <@spring.showErrors "<br>"/><br>
    Last Name: <@spring.formInput path="customer.surname"/>
    <@spring.showErrors "<br>"/><br>
    Email: <@spring.formInput path="customer.email"/>
    <@spring.showErrors "<br>"/><br>
    Age: <@spring.formInput path="customer.age"/>
    <@spring.showErrors "<br>"/><br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>