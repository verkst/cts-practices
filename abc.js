
/*********Log In Page validation*******/

var user,pswd;
function validateName(){
var input;
input=document.getElementById("input_0").value;
if(input=="" || input.length<8 ){
     document.getElementById("p0").innerHTML="*Please enter username";
     user=false;
}
else{
    document.getElementById("p0").innerHTML="OK!";
    user=true;
}
}

var isLower,isUpper,isDigit,isSymbol,char;
function validatePassword(){
var password,i;
password=document.getElementById("input_1").value;
if(password.length>8){
	for(i=0;i<password.length;i++){
	char=password.charAt(i);
	if( char>='a' && char<='z'){
		isLower=true;continue;
		}
	if( char>='A' && char<='Z'){
		isUpper=true;continue;
		}
	if( char>='0' && char<='9'){
		isDigit=true;continue;
		}
	if( (char>=21&&char<=2F) || (char>=3A&&char<=40) || (char>=5B&&char<=60) || (char>=7B&&char<=7E) ){
		isSymbol=true;continue;
		}
	}
if( isLower==true && isUpper==true && isDigit==true && isSymbol==true ){
document.getElementById("p1").innerHTML="OK!";
pswd=true;
	}
}
else{
document.getElementById("p1").innerHTML="*Please enter Password";
    pswd=false;    
   }
}
function validate(){
if(user==true && pswd==true){
     window.alert("Details Submitted!");
     }
else{
     window.alert("Invalid Creditionals!");
     }
}
/*********Log In Page validation*********/