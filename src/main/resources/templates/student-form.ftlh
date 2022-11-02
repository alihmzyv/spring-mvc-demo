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
<@spring.bind "countryOptions"/>
<@spring.bind "langOptions"/>
<@spring.bind "osOptions"/>
<form action="processForm" method="post">
    First Name: <@spring.formInput path="student.firstName"/>
    <@spring.showErrors "<br>"/><br>
    Last Name: <@spring.formInput path="student.lastName"/>
    <@spring.showErrors "<br>"/><br>
    Country: <@spring.formSingleSelect path="student.country" options=countryOptions/>
    <@spring.showErrors "<br>"/><br>
    Favorite programming language: <br>
    <@spring.formRadioButtons path="student.favoriteProgrammingLanguage"
    options=langOptions separator="<br>" attributes=''/>
    <@spring.showErrors "<br>"/>
    Operations systems experience:<br>
    <@spring.formCheckboxes path="student.operatingSystems" options=osOptions separator="<br>" attributes=''/>
    <@spring.showErrors "<br>"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>