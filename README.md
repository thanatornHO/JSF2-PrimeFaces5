**The standard JSF equivalent to the PrimeFaces specific**

PrimeFaces | Standard JSF
------------ | -------------
process | execute
update | render

Component | Submit | Refresh
------------ | ------------- | -------------
f:ajax | execute="@this" | render="@none"
p:ajax | process="@this" | update="@none"
p:commandXXX | process="@form" | update="@none"

[best answer for reference client id of component (Stackoverflow)](http://stackoverflow.com/questions/8634156/how-to-find-out-client-id-of-component-for-ajax-update-render-cannot-find-compo)
