<#import "parts/common.ftlh" as c>
    <#import "parts/login.ftlh" as l>
<@c.page>
<p>Login page</p>
   <@l.login "/login"/>
<a href="/registration">Register new user.</a>
</@c.page>