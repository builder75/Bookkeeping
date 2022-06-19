# Bookkeeping
Simple bookkeeping software.
Income and spent money can be stored via JSON body request.

This POST request to http://localhost:8080/action is possible:
{
"received": "10.60",
"spent" : "9.40"
}
Send a GET request to http://localhost:8080/total and you get the difference between received and spent money.

