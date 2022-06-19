# Bookkeeping
Simple bookkeeping software<br/>
Income and spent money can be stored via JSON body request.<br/>

This POST request to http://localhost:8080/action is possible:<br/>
{<br/>
"received": "10.60",<br/>
"spent" : "9.40"<br/>
}<br/>
Send a GET request to http://localhost:8080/total and you get the difference between received and spent money.

