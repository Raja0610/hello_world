#include<iostream>
using namespace std;

int helper(string input,int size1)
{
    if(size1==0)
    {
        return 0;
    }
    else{
        int result=helper(input,size1-1);
        result=(result*10)+(input[size1-1]-48);
        return result;
    }
}

int StoI(string input)
{
    int i=0;
    while(input[i]!='\0')
    {
        i++;
    }
    return helper(input,i);
}

int main()
{
    string s;
    cin>>s;
    int result=StoI(s);
    cout<<result;
    return 0;
}
