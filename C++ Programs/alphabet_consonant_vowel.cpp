//To check whether given alphabet is consonent or vowel

#include<iostream>
using namespace std;
int main()
{
    char a;
    cout<<"Enter an alphabet to check whether it is a consonant or a vowel"<<endl;
    cin>>a;
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
        cout<<"Given Alphabet is a VOWEL and is of lower case"<<endl;
    }
    else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
        cout<<"Given Alphabet is a VOWEL and is of UPPER case"<<endl;
  
    }
    else{
        cout<<"the given alphabet is consonant"<<endl;
    }
return 0;
}